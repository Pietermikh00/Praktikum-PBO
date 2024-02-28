public class OperasiGaris {
    public double getPanjang(Garis G){
        double a = G.getTitikAkhir().getAbsis() - G.getTitikAwal().getAbsis();
        double b = G.getTitikAkhir().getOrdinat() - G.getTitikAwal().getOrdinat();
        return Math.sqrt(a*a+b*b);
    }
    
    public double getGradien(Garis G){
        double a = G.getTitikAkhir().getAbsis() - G.getTitikAwal().getAbsis();
        double b = G.getTitikAkhir().getOrdinat() - G.getTitikAwal().getOrdinat();
        return b/a;
    }

    public void getRefleksiY(Garis G){
        OperasiTitik OT = new OperasiTitik();
        OT.refleksiY(G.getTitikAwal());
        OT.refleksiY(G.getTitikAkhir());
    }

    public boolean isTegakLurus(Garis L ,Garis G){
        if(getGradien(L)*getGradien(G)==-1){
            return true;
        }
        else{
            return false;
        }
    }
}
