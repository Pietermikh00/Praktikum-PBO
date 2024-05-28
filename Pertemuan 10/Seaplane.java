/**
 * File: Seaplane.java
 * Deskripsi: class Seaplane
 * Nama/NIM : Aldisar Gibran/24060122130081
 * Tanggal  : 28 Mei 2024
 */

public class Seaplane extends Airplane{
    private double maxLoad;

    Seaplane(){}

    Seaplane(double maxLoad){
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

    @Override
    public void takeOff() {
        System.out.println("Seaplane lepas landas");
    }

    @Override
    public void land() {
        System.out.println("Seaplane mendarat");
    }

    @Override
    public void fly() {
        System.out.println("Seaplane terbang");
    }  
}
