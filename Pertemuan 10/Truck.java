/**
 * File: Truck.java
 * Deskripsi: Class Truck
 * Nama/NIM : Aldisar Gibran/24060122130081
 * Tanggal  : 28 Mei 2024
 */

public class Truck extends Vehicle{
    private double maxLoad;

    Truck(){}
    
    Truck(double maxLoad){
        this.maxLoad = maxLoad;
    }

    @Override
    public double calcFuelEfficiency(){
        return 0.0;
    }

    @Override
    public double calcTripDistance(){
        return 0.0;
    }    
}
