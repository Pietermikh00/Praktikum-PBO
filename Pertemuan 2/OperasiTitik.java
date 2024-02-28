public class OperasiTitik {
    public double getJarakPusat(Titik P){
        double Jarak;
        Jarak = Math.sqrt(P.getAbsis()*P.getAbsis()+P.getOrdinat()*P.getOrdinat());
        return Jarak;
    }

    public void refleksiX(Titik P){
        P.setOrdinat(P.getOrdinat()*(-1));
    }

    public void refleksiY(Titik P){
        P.setAbsis(P.getAbsis()*(-1));
    }
    
    public void getRefleksiX(Titik P){
        refleksiX(P);
    }
    
    public void getRefleksiY(Titik P){
        refleksiY(P);
    }
    
}
