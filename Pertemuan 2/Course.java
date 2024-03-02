import java.util.List;
import java.util.ArrayList;

public class Course {
    /* TODO: implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */
    private String courseCode;
    private String courseName;
    private Lecture lecturer;
    private List<Student> studentsEnrolled;

    Course(String courseCode, String courseName, Lecture lecturer) {
        // TODO: buatlah fungsi konstruktor
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecturer = lecturer;
        this.studentsEnrolled = new ArrayList<>();
    }

    void addStudent(Student student) {
        // TODO: buatlah fungsi untuk menambah seorang mahasiswa
        if (!studentsEnrolled.contains(student)){
            this.studentsEnrolled.add(student);
            student.enrollInCourse(this);
        }
    }

    void removeStudent(Student student) {
        // TODO: buatlah fungsi untuk menghapus seorang mahasiswa
        if(studentsEnrolled.contains(student)){
            this.studentsEnrolled.remove(student);
            student.removeCourse(this);
        }
    }

    void viewEnrolledStudents() {
        /* TODO: buatlah fungsi untuk menampilkan seluruh 
           student yang mengambil course. 

           Hint: gunakan loop dan method getDetails dari Student
        */
        for (Student student : studentsEnrolled){
            student.getDetails();
        }
    }

    void getDetails() {
        /* TODO: buat fungsi untuk print detail dari Course, 
           menampilkan kode course, nama course, dan dosen pengampu
        */ 
        System.out.println("Kode Mata Kuliah: "+this.getCourseCode());
        System.out.println("Nama Course: "+this.getCourseName());
        System.out.println("Nama Dosen: "+this.lecturer.getLecturerName()+"\n");
    }      

    // Other methods...

    public String getCourseName(){
        return this.courseName;
    }

    public String getCourseCode(){
        return this.courseCode;
    }

    public Lecture getLecturer(){
        return this.lecturer;
    }
    
    public void setCourseName(String name){
        this.courseName = name;
    }

    public void setCourseCode(String code){
        this.courseCode = code;
    }

    public void setLecturer(Lecture lecture){
        this.lecturer = lecture;
    }
}
