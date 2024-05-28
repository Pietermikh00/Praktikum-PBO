/**
 * File: RiverBarge.java
 * Deskripsi: class Riverbarge
 * Nama/NIM : Aldisar Gibran/24060122130081
 * Tanggal  : 28 Mei 2024
 */

public class RiverBarge extends Vehicle {
    private double maxLoad;

    RiverBarge(){}

    RiverBarge(double maxLoad){
        this.maxLoad = maxLoad;
    }

    public double calcFuelEfficiency(){
        return 0.0;
    }

    public double calcTripDistance(){
        return 0.0;
    }  
}
