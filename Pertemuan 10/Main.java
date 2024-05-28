/**
 * File: Main.java
 * Deskripsi: Program utama untuk mengelola armada kendaraan
 * Nama/NIM : Aldisar Gibran/24060122130081
 * Tanggal  : 28 Mei 2024
 */

 import java.util.*;

 public class Main {
     public static void main(String[] args) {
         Truck truck = new Truck();
         System.out.println(truck);
 
         Seaplane sPlane = new Seaplane();
         System.out.println(sPlane);
 
         Helicopter copter = new Helicopter();
         System.out.println(copter);
 
         System.out.println("###################################################");
 
         List<Truck> armadaTruck = new ArrayList<>();
         List<Seaplane> armadaSeaplane = new ArrayList<>();
         List<Helicopter> armadaHelicopter = new ArrayList<>();
 
         // Menambahkan kendaraan ke kelompok armada yang sesuai
         armadaTruck.add(truck);
         armadaTruck.add(truck);
         armadaTruck.add(truck);
         System.out.println("Jumlah Armada Truck: " + armadaTruck.size());
 
         armadaSeaplane.add(sPlane);
         System.out.println("Jumlah Armada Seaplane: " + armadaSeaplane.size());
 
         armadaHelicopter.add(copter);
         armadaHelicopter.add(copter);
         System.out.println("Jumlah Armada Helicopter: " + armadaHelicopter.size());
 
         System.out.println("###################################################");
 
         ArmadaKendaraan armadaKendaraan = new ArmadaKendaraan();
 
         System.out.println("Menambah armada baru");
         armadaKendaraan.tambahArmada(armadaTruck);
         System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
 
         System.out.println("Menambah armada baru");
         armadaKendaraan.tambahArmada(armadaSeaplane);
         System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
 
         System.out.println("Menambah armada baru");
         armadaKendaraan.tambahArmada(armadaHelicopter);
         System.out.println(">> Jumlah unit kendaraan: " + armadaKendaraan.getAllArmada().size());
     }
 }