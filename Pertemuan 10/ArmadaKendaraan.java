/**
 * File: ArmadaKendaraan.java
 * Deskripsi: Kelas untuk mengelola armada kendaraan
 * Nama/NIM : Aldisar Gibran/24060122130081
 * Tanggal  : 28 Mei 2024
 */

 import java.util.*;

public class ArmadaKendaraan {
     private List<Vehicle> armada;
 
     public ArmadaKendaraan() {
         armada = new ArrayList<>();
     }
 
     public <T extends Vehicle> void tambahArmada(Collection<T> vehicles) {
         armada.addAll(vehicles);
     }
 
     public List<Vehicle> getAllArmada() {
         return armada;
     }
 }