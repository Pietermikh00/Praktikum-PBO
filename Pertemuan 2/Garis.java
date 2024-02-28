public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;

    //Method
    //Konstruktor
    Garis(Titik A, Titik B){
        this.titikAwal = A;
        this.titikAkhir = B;
    }

    //Getter & Setter
    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    public Titik setTitikAwal(Titik A){
        return this.titikAwal = A;
    }

    public Titik setTitikAkhir(Titik B){
        return this.titikAkhir = B;
    }    
}
