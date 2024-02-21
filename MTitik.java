public class MTitik {
    public static void main(String args[]){
        Titik t1 = new Titik();
        Titik t2 = new Titik();
        Titik t3; 
        t3 = new Titik(5,6);
        t1.setAbsis(1);
        t1.setOrdinat(1);
        t2.setAbsis(4);
        t2.setOrdinat(5);
        System.out.println("Jumlah Objek Titik: " + t1.getCounter());
        System.out.println("Koordinat t1: (" + t1.absis +","+t1.ordinat+")");
        System.out.println("Koordinat t2: (" + t2.absis +","+t2.ordinat+")");
        System.out.println("Koordinat t3: (" + t3.absis +","+t3.ordinat+")");
    }
}