// Nama Program: Senjata.java
// Nama Pembuat/NIM: Aldisar Gibran/24060122130081
// Deskripsi: Kelas Senjata
// Tanggal Dibuat: 2 Mei 2024 

package latihanMedium;

public class Senjata {
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    public Senjata (String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }

    public String getBunyi(){
        return this.bunyi;
    }

    public int getPeluru(){
        return this.peluru;
    }

    public boolean isMenusuk(){
        return this.menusuk;
    }

    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }

    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }

    public void setPeluru(int peluru){
        this.peluru += peluru;
    }
}
