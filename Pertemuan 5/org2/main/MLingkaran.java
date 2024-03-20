package main;
import BangunDatar.Lingkaran;
import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari: ");
        double jejari = scan.nextDouble();
        Lingkaran l = new Lingkaran(jejari);
        System.out.println("Luas lingkaran dengan jejari " + jejari + " satuan adalah " + l.hitungLuas());
        scan.close();
    }
}

/* Scanner berfungsi untuk menerima input dari user, input ini akan disimpan dalam variable jejari,
 * kemudian variable jejari digunakan sebagai parameter aktual pada objek lingkaran yang baru
 */