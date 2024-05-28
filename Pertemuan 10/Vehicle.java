/**
 * File: Vehicle.java
 * Deskripsi: abstract class vehicle
 * Nama/NIM : Aldisar Gibran/24060122130081
 * Tanggal  : 28 Mei 2024
 */

public abstract class Vehicle{
    public abstract double calcFuelEfficiency();
    public abstract double calcTripDistance();
    public String toString(){
        return this.getClass().getSimpleName();
    }
}