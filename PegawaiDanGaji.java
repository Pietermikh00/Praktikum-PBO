// Nama Program: PegawaiDanGaji.java
// Nama Pembuat/NIM: Aldisar Gibran/24060122130081
// Deskripsi: Main Program
// Tanggal Dibuat: 2 Mei 2024 

package perusahaan;

public class PegawaiDanGaji {
    public static void main(String[] args) {
        Pegawai pegawai = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Pegawai pegawai3 = new Manajer("Argo");

        Payroll payroll = new Payroll();
        payroll.cetakGaji(pegawai);
        payroll.cetakGaji(pegawai2);
        payroll.cetakGaji(pegawai3);
    }
}
