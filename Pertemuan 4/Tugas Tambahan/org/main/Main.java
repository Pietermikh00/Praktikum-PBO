package org.main;
import org.bin.*;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      List<Student> Students = new ArrayList<>(); 
      List<Course> Courses = new ArrayList<>(); 
      List<Lecture> Lecturers = new ArrayList<>(); 
      Scanner scanner = new Scanner(System.in);
      int responseInt;
      String nama;
      int ID;
      String alamat;
      int umur; 

      //Tes Class Student, Course, Lecture
      Lecture agus = new Lecture("Agus", 35, "Tembalang", 177013);
      Lecture bambang = new Lecture("Bambang", 35, "Banyumanik", 412873);
      
      Student cahyo = new Student("Cahyo", 20, "456 Elm St", 723751);
      Student dani = new Student("Dani", 20, "123 Oak St", 734621);
      Student edi = new Student("Edi", 20, "789 Pine St", 733451);

      Course cs101 = new Course("CS101", "Intro to Computer Science",agus);
      Course cs102 = new Course("CS102", "Data Structures", agus);
      Course cs103 = new Course("CS103", "Algorithms", bambang);
      Course cs104 = new Course("CS104", "Object Oriented Programming", bambang);

      agus.teachCourse(cs101);
      agus.teachCourse(cs102);
      bambang.teachCourse(cs103);
      bambang.teachCourse(cs104);
  
      cs101.addStudent(cahyo);
      cs101.addStudent(dani);
      cs101.addStudent(edi);
  
      cs102.addStudent(cahyo);
      cs102.addStudent(dani);
  
      cs103.addStudent(cahyo);
      cs104.addStudent(edi);
  
      System.out.println("Mata kuliah yang diikuti "+cahyo.getStudentName()+":");
      cahyo.viewEnrolledCourses();
      System.out.println("Mata kuliah yang diampu "+agus.getLecturerName()+":");
      agus.viewTaughtCourses();
      System.out.println("Mahasiswa yang mengambil mata kuliah '"+cs101.getCourseName()+"':");
      cs101.viewEnrolledStudents();  

      System.out.println("Cahyo mengundurkan diri dari mata kuliah "+cs101.getCourseName());
      System.out.println("sehingga peserta mata kuliahnya menjadi sebagai berikut");
      cs101.removeStudent(cahyo);
      cs101.viewEnrolledStudents();

      System.out.println("Sebagai gantinya, Cahyo mengikuti mata kuliah "+cs104.getCourseName());
      System.out.println("sehingga mata kuliah yang diikuti yaitu");
      cahyo.enrollInCourse(cs104);
      cahyo.removeCourse(cs101);
      cahyo.viewEnrolledCourses();

      System.out.println("------------------------------------------------------------");

      while (true) {
        System.out.println("\nMau ngapain?");
        System.out.println("1. Input Mahasiswa Baru");
        System.out.println("2. Input Mata Kuliah Baru");
        System.out.println("3. Input Dosen Baru");
        System.out.println("4. Tampilkan Daftar Mahasiswa");
        System.out.println("5. Tampilkan Daftar Mata Kuliah");
        System.out.println("6. Tampilkan Daftar Dosen");
        System.out.println("7. Keluar");
        System.out.println("Pilihan (1/2/3/4/5/6/7)");
        responseInt = scanner.nextInt();
        boolean exit = false;
        boolean invalid = false;
        scanner.nextLine();
        if (responseInt == 1){
          System.out.println("Masukkan Nama Mahasiswa: ");
          nama = scanner.nextLine();

          System.out.println("Masukkan Umur Mahasiswa: ");
          umur = scanner.nextInt();
          scanner.nextLine();
          System.out.println("Masukkan Alamat Mahasiswa: ");
          alamat = scanner.nextLine();

          System.out.println("Masukkan NIM Mahasiswa (5 digit terakhir): ");
          ID = scanner.nextInt();
          
          Student student = new Student(nama,umur,alamat,ID);
          System.out.println("Berhasil input dengan data mahasiswa sebagai berikut:");
          student.getDetails();
          Students.add(student);
          
        }
        else if (responseInt == 2){
          System.out.println("Masukkan Data Dosen Pengampunya Terlebih Dahulu");
          System.out.println("Masukkan Nama Dosen: ");
          nama = scanner.nextLine();

          System.out.println("Masukkan Umur Dosen: ");
          umur = scanner.nextInt();
          scanner.nextLine();
          System.out.println("Masukkan Alamat Dosen: ");
          alamat = scanner.nextLine();
          
          System.out.println("Masukkan NIP Dosen (5 digit terakhir): ");
          ID = scanner.nextInt();
          scanner.nextLine();
          Lecture Dosbar = new Lecture(nama,umur,alamat,ID);
          Lecturers.add(Dosbar);
          System.out.println("Berhasil input dengan data dosen pengampu sebagai berikut:");
          Dosbar.getDetails();

          System.out.println("Masukkan Data Mata Kuliah");
          System.out.println("Masukkan Nama Mata Kuliah: ");
          nama = scanner.nextLine();

          System.out.println("Masukkan Kode Mata Kuliah: ");
          alamat = scanner.nextLine();
          
          Course Course = new Course(alamat,nama,Dosbar);
          Courses.add(Course);
          System.out.println("Berhasil input dengan data mata kuliah sebagai berikut:");
          Course.getDetails();
        }
        else if(responseInt == 3){
          System.out.println("Masukkan Data Dosen Pengampunya Terlebih Dahulu");
          System.out.println("Masukkan Nama Dosen: ");
          nama = scanner.nextLine();

          System.out.println("Masukkan Umur Dosen: ");
          umur = scanner.nextInt();
          scanner.nextLine();
          System.out.println("Masukkan Alamat Dosen: ");
          alamat = scanner.nextLine();
          
          System.out.println("Masukkan NIP Dosen (5 digit terakhir): ");
          ID = scanner.nextInt();

          Lecture Dosbar = new Lecture(nama,umur,alamat,ID);
          Lecturers.add(Dosbar);
          System.out.println("Berhasil input dengan data dosen pengampu sebagai berikut:");
          Dosbar.getDetails();
        }
        else if(responseInt == 4){
          if(Students.isEmpty()){
            System.err.println("Daftar mahasiswa kosong");
          }
          else{
            for (Student Student : Students){
              Student.getDetails();
            }
          }
        }
        else if(responseInt == 5){
          if(Courses.isEmpty()){
            System.err.println("Daftar mata kuliah kosong");
          }
          else{
            for (Course Course : Courses){
              Course.getDetails();
            }
          }
        }
        else if(responseInt == 6){
          if(Lecturers.isEmpty()){
            System.err.println("Daftar dosen kosong");
          }
          else{
            for (Lecture Lecture : Lecturers){
              Lecture.getDetails();
            }
          }
        }
        else if(responseInt == 7){
          scanner.close();
          break;
        }
        else{
          System.out.println("Pilihan Invalid. Silahkan pilih antara 1/2/3/4/5/6/7");
          invalid = true;
        }
        while (true && invalid == false) {
          System.out.println("Mau lanjut nggak?");
          System.out.println("1. Lanjut");
          System.out.println("2. Keluar");
          responseInt = scanner.nextInt();
          if(responseInt == 1){
            break;
          }
          else if(responseInt == 2){
            exit = true;
            break;
          }
          else{
            System.out.println("Pilihan Invalid. Silahkan pilih antara 1/2");
          }
        }
        if(exit==true){
          scanner.close();
          break;
        }
      }
    }
  }
  