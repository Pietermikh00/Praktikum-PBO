/**
 * File: Helicopter.java
 * Deskripsi: class helicopter
 * Nama/NIM : Aldisar Gibran/24060122130081
 * Tanggal  : 28 Mei 2024
 */

public class Helicopter extends Airplane{
    private double maxLoad;

    Helicopter(){}

    Helicopter(double maxLoad){
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
        System.out.println("Helikopter lepas landas");
    }

    @Override
    public void land() {
        System.out.println("Helikopter mendarat");
    }

    @Override
    public void fly() {
        System.out.println("Helikopter terbang");
    }  
}
