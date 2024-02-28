// package PBO.Pertemuan2;
public class Titik {
    private double x,y;

    Titik (){
        x = 0;
        y = 0;
    }

    Titik (double a, double b){
        x = a;
        y = b;
    }

    public void setAbsis(double x){
        this.x = x;
    }

    public void setOrdinat(double y){
        this.y = y;
    }

    public double getAbsis(){
        return this.x;
    }

    public double getOrdinat(){
        return this.y;
    }
}