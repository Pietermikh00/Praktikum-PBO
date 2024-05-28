/**
 * File: AirPort.java
 * Deskripsi: class airport
 * Nama/NIM : Aldisar Gibran/24060122130081
 * Tanggal  : 28 Mei 2024
 */

public class AirPort extends Airplane {
    private Airplane airplane;
    private String name;

    AirPort(){}

    AirPort(String name){
        this.name = name;
    }

    @Override
    public void takeOff() {
        
    }

    @Override
    public void land() {

    }

    @Override
    public void fly() {

    }

    @Override
    public double calcFuelEfficiency() {
        return 0.0;
    }

    @Override
    public double calcTripDistance() {
        return 0.0;
    }

    
}
