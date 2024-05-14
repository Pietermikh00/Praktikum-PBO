package Pertemuan8.a;
public class Main {
    public static void main(String[] args) {
        Ulat K = new Ulat();
        Data<Kupu> anu = new Data<>();

        Kupu objK = K;
        anu.setIsi(objK);
        anu.getIsi().gerak();
    }
}
