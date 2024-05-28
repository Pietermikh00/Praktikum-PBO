/**
 * File: Animal.java
 * Deskripsi: abstract class animal
 * Nama/NIM : Aldisar Gibran/24060122130081
 * Tanggal  : 28 Mei 2024
 */

public abstract class Animal {
    abstract public void eat();
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
