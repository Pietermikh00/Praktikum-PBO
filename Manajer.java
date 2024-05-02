// Nama Program: Manajer.java
// Nama Pembuat/NIM: Aldisar Gibran/24060122130081
// Deskripsi: Kelas Manajer
// Tanggal Dibuat: 2 Mei 2024 

package perusahaan;

public class Manajer extends Pegawai{
    private int tunjangan = 700000;

    public Manajer(String nama){
        this.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Tunjangan: "+this.tunjangan);
    }
}
