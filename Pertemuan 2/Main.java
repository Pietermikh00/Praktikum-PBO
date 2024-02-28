// package PBO.Pertemuan2;
public class Main {
    public static void main(String args[]){
        //Titik
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        Titik t3;
        OperasiTitik OT = new OperasiTitik();
        t3 = new Titik(5,6);
        t1.setAbsis(1);
        t1.setOrdinat(1);
        t2.setAbsis(3);
        t2.setOrdinat(4);
        System.out.println("Koordinat t1: (" + t1.getAbsis() +","+t1.getOrdinat()+")");
        System.out.println("Koordinat t2: (" + t2.getAbsis() +","+t2.getOrdinat()+")");
        OT.getRefleksiX(t2);
        System.out.println("Koordinat t2: (" + t2.getAbsis() +","+t2.getOrdinat()+")");
        System.out.println("Koordinat t3: (" + t3.getAbsis() +","+t3.getOrdinat()+")");
        OT.getRefleksiY(t3);
        System.out.println("Koordinat t3: (" + t3.getAbsis() +","+t3.getOrdinat()+")");
        System.out.println("Jarak Titik t2 terhadap (0,0) yaitu "+ OT.getJarakPusat(t2));
        OT.getRefleksiX(t2);

        //Garis
        Titik A = new Titik(0,-3);
        Titik B = new Titik(4,0);
        Titik C = new Titik(3,0);
        Titik D = new Titik(0,-4);
        Garis L = new Garis(t2, t3);
        Garis K = new Garis(C, D);
        OperasiGaris OG = new OperasiGaris();
        System.out.println("Titik Awal Garis L: ("+ L.getTitikAwal().getAbsis()+","+L.getTitikAwal().getOrdinat()+")");
        System.out.println("Titik Akhir Garis L: ("+ L.getTitikAkhir().getAbsis()+","+L.getTitikAkhir().getOrdinat()+")");
        L.setTitikAkhir(B);
        L.setTitikAwal(A);
        System.out.println("Titik Awal Garis L: ("+ L.getTitikAwal().getAbsis()+","+L.getTitikAwal().getOrdinat()+")");
        System.out.println("Titik Akhir Garis L: ("+ L.getTitikAkhir().getAbsis()+","+L.getTitikAkhir().getOrdinat()+")");
        System.out.println("Panjang Garis L: "+OG.getPanjang(L));
        System.out.println("Gradien Garis L: "+OG.getGradien(L));
        OG.getRefleksiY(L);
        System.out.println("Titik Awal Garis L: ("+ L.getTitikAwal().getAbsis()+","+L.getTitikAwal().getOrdinat()+")");
        System.out.println("Titik Akhir Garis L: ("+ L.getTitikAkhir().getAbsis()+","+L.getTitikAkhir().getOrdinat()+")");
        System.out.println("Apakah garis L dan K tegak lurus: "+OG.isTegakLurus(L, K));
    }
}
