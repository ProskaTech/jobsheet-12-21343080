/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

package LATIHAN6;

public class BuahUtama {
    public static void main(String[]args){
        EncapsulationBuah Apel = new EncapsulationBuah("Apel", "Rp.3000", "Merah");

        System.out.println("Nama Buah : " + Apel.getName()+"\nHarga : " +Apel.getPrice()+ "\nWarna : " + Apel.getColor());

        Apel.setColor("Hijau");
        Apel.SetPrice("Rp.7000");
        System.out.println("\nInformasi terkait Apel setelah di Update");

        System.out.println("Nama Buah: " +Apel.getName()+"\nHarga: " +Apel.getPrice()+"\nWarna: " +Apel.getColor());
    }
}
