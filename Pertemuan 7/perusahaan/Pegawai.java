// Nama Program: Pegawai.java
// Nama Pembuat/NIM: Aldisar Gibran/24060122130081
// Deskripsi: Kelas Pegawai
// Tanggal Dibuat: 2 Mei 2024 

package perusahaan;

public class Pegawai {
    private String nama;
    private int gajiPokok = 5000000;

    public void setNama(String nama){
        this.nama = nama;
    }

    public void tampilData(){
        System.out.println("Nama: "+nama+", Gaji pokok : "+gajiPokok);
    }
}
