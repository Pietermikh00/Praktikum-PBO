package org.bin;
import java.util.List;

import org.person.Person;

import java.util.ArrayList;

public class Student extends Person {
    /* TODO: implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */
    private List<Course> coursesEnrolled;


    public Student(String name, int age, String address, int studentID) {
        // TODO: buatlah fungsi konstruktor
        this.name=name;
        this.age=age;
        this.address=address;
        this.ID=studentID;
        this.coursesEnrolled = new ArrayList<>();
    }

    public void getDetails() {
        /* TODO: buat fungsi untuk print detail dari Student,
           menampilkan nama, umur, alamat, dan ID
        */
       System.out.println("Nama: "+this.getStudentName());
       System.out.println("Umur: "+this.getStudentAge());
       System.out.println("Alamat: "+this.getStudentAddress());
       System.out.println("NIM: "+this.getStudentID()+"\n");
    }

    public void enrollInCourse(Course course) {
        // TODO: buatlah fungsi untuk menambah sebuah course
        this.coursesEnrolled.add(course);
    }

    public void viewEnrolledCourses() {
        /* TODO: buatlah fungsi untuk menampilkan seluruh course 
           yang diambil oleh mahasiswa.

           Hint: gunakan loop dan method getDetails dari Course
        */
        for (Course course : coursesEnrolled){
            course.getDetails();
        }
    }

    // Other methods...
    public String getStudentName(){
        return this.name;
    }

    public int getStudentAge(){
        return this.age;
    }

    public String getStudentAddress(){
        return this.address;
    }

    public int getStudentID(){
        return this.ID;
    }

    public void setStudentName(String name){
        this.name = name;
    }

    public void setStudentAge(int age){
        this.age = age;
    }

    public void setStudentAddress(String address){
        this.address = address;
    }

    public void setStudentID(int studentID){
        this.ID = studentID;
    }

    public void removeCourse(Course course){
        /* Menghapus course dari coursesEnrolled */
        if(coursesEnrolled.contains(course)){
            this.coursesEnrolled.remove(course);
        }
    }

}
