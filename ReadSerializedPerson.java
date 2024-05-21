/*
* Nama File    : ReadSerializedPerson.java
* Nama Pembuat : Aldisar Gibran
* NIM          : 24060122130081
* Deskripsi    : Main file untuk membaca data dari serialisasi
* Tanggal      : 21 Mei 2024
*/

import java.io.*;
public class ReadSerializedPerson {
    public static void main(String[] args) {
        Person p = null;
        try {
            FileInputStream fis = new FileInputStream("person.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            p = (Person) ois.readObject();
            ois.close();
            System.out.println("Serialized person name = "+p.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
