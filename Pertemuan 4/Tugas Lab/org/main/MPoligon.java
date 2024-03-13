package org.main;

import org.bangunDatar.*;

public class MPoligon{
    public static void main(String[] args){
        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        segitiga segitiga = new segitiga(3, 5, 3);
        persegi.printInfo();
        segitiga.printInfo();
        System.out.println("Luas Persegi Panjang :"+persegi.hitungLuas());
        System.out.println("Luas Segitiga :"+segitiga.hitungLuas());
    }
}