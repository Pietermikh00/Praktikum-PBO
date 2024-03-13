package org.bangunDatar;

import org.poligon.Poligon;

public class segitiga extends Poligon{
    private double alas, tinggi;

    public segitiga(double alas, double tinggi, int jumlahSisi){
        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;
    }

    public double hitungLuas(){
        return alas * tinggi * 0.5;
    }

    public void printInfo(){
        System.out.println("Bangun Segitiga berisi " + this.getJumlahSisi());
    }
}
