/**
 * File: Bird.java
 * Deskripsi: class bird
 * Nama/NIM : Aldisar Gibran/24060122130081
 * Tanggal  : 28 Mei 2024
 */

public class Bird extends Animal implements IFlyer{
    @Override
    public void takeOff(){
        System.out.println("Burung akan terbang");
    }

    @Override
    public void land(){
        System.out.println("Burung mendarat");
    }

    @Override
    public void fly(){
        System.out.println("Burung terbang");
    }

    @Override
    public void eat(){
        System.out.println("Burung makan");
    }

    public void buildNest(){

    }

    public void layEggs(){

    }
}
