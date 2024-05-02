// Nama Program: Programmer.java
// Nama Pembuat/NIM: Aldisar Gibran/24060122130081
// Deskripsi: Kelas Programmer
// Tanggal Dibuat: 2 Mei 2024 

package perusahaan;

public class Programmer extends Pegawai{
    private int bonus = 450000;

    public Programmer(String nama){
        this.setNama(nama);
    }

    public void tampilData(){
        super.tampilData();
        System.out.println("Bonus: "+this.bonus);
    }
}
