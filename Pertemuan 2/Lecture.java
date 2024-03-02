import java.util.List;
import java.util.ArrayList;

public class Lecture {
    /* TODO: implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */

    private String name;
    private int age;
    private String address;
    private int employeeID;
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        // TODO: buatlah fungsi konstruktor
        this.name = name;
        this.age = age;
        this.address = address;
        this.employeeID = employeeID;
        this.coursesTaught = new ArrayList<>();
    }

    public void getDetails() {
        /* TODO: buat fungsi untuk print detail dari Lecture,
           menampilkan nama, umur, alamat, dan ID
        */
        System.out.println("Nama: "+this.getLecturerName());
        System.out.println("Umur: "+this.getLecturerAge());
        System.out.println("Alamat: "+this.getLecturerAddress());
        System.out.println("NIP: "+this.getLecturerID()+"\n");
    }    

    public void teachCourse(Course course) {
        // TODO: buatlah fungsi untuk menambah sebuah course
        if(!coursesTaught.contains(course)){
            this.coursesTaught.add(course);
        }
    }

    public void viewTaughtCourses() {
        /* TODO: buatlah fungsi untuk menampilkan seluruh course
           yang diampu oleh dosen.

           Hint: gunakan loop dan method getDetails dari Course
        */
        for (Course course : coursesTaught){
            course.getDetails();
        }
    }

    // Other methods...

    public String getLecturerName(){
        return this.name;
    }

    public int getLecturerAge(){
        return this.age;
    }
    
    public String getLecturerAddress(){
        return this.address;
    }

    public int getLecturerID(){
        return this.employeeID;
    }

    public void setLecturerName(String name){
        this.name = name;
    }

    public void setLecturerAge(int age){
        this.age = age;
    }
    
    public void setLecturerAddress(String address){
        this.address = address;
    }

    public void setLecturerID(int ID){
        this.employeeID = ID;
    }

    public void removeTaughtCourse(Course course) {
        if(coursesTaught.contains(course)){
            this.coursesTaught.remove(course);
        }
    }
}
