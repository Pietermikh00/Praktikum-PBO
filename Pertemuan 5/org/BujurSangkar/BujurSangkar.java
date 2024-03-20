public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi * sisi;
        return luas;
    }
}

/* Akan terjadi error apabila Class BujurSangkar tidak mengimplementasi
 * metode abstrak pada kelas abstrak BangunDatar, karena BujurSangkar
 * merupakan subclass dari BangunDatar
 */