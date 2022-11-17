/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

package LATIHAN4;

abstract class Orang {
    public String namaAyah = "Randi Proska";
    abstract void makan();
    public void minum(){
        System.out.println("Minum Air Teh dan Kopi");
    }
}

class AnakUmur1Tahun extends Orang {
    public void namaAyahKu(){
        System.out.println("Nama Ayahku adalah " +namaAyah);
    }
    @Override
    public void makan(){
        System.out.println("Anak Umur 1 Tahun Makan Asi");
    }

    @Override
    public void minum(){
        System.out.println("Anaka Umur 1 Tahun Minum Asi");
    }
}
