// Nama Program: KontrolSenjata.java
// Nama Pembuat/NIM: Aldisar Gibran/24060122130081
// Deskripsi: Kelas KontrolSenjata
// Tanggal Dibuat: 2 Mei 2024 

package latihanMedium;

public class KontrolSenjata {
    Senjata senjata;
    public KontrolSenjata(Senjata s){
        senjata = s;
    }

    public boolean isAdaPeluru(){
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.println("Peluru berhasil ditambah: " + this.senjata.getPeluru());
    }

    public void menembak(int jumlah){
        System.out.println("Siap menembak "+jumlah+" kali");
        if (senjata.getPeluru()==0){
            System.out.println("Peluru Habis");
        }
        else{   
            for (int i = 0; i < jumlah; i++) {
                if (senjata.getPeluru()==0){
                    System.out.println("Gagal tembak, Peluru Habis");
                }
                else{
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(-1);
                }
            }
            System.out.println("Peluru sisa: "+senjata.getPeluru());
        }
    }

    public String menusuk(){
        if(senjata.isMenusuk()){
            return "Jleb";
        }
        else{
            return "Gagal, belum pasang bayonet";
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet Terpasang");
    }
}