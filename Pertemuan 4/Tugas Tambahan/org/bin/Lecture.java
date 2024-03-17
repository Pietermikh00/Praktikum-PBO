package org.bin;
import java.util.List;

import org.person.Person;

import java.util.ArrayList;

public class Lecture extends Person{
    /* TODO: implementasi enkapsulasi dengan 
       berikan akses yang sesuai
    */
    private List<Course> coursesTaught;

    public Lecture(String name, int age, String address, int employeeID) {
        // TODO: buatlah fungsi konstruktor
        this.name = name;
        this.age = age;
        this.address = address;
        this.ID = employeeID;
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
        return this.ID;
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
        this.ID = ID;
    }

    public void removeTaughtCourse(Course course) {
        if(coursesTaught.contains(course)){
            this.coursesTaught.remove(course);
        }
    }
}
