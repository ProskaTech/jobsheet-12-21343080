/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

package LATIHAN1;

public class JavaInheritance {
    public static void main (String[] args){
        RodaDua sepeda = new RodaDua();

        RodaEmpat mobil = new RodaEmpat();

        sepeda.tampilkanharga();
        sepeda.hargaAkhir();

        mobil.tampilkanharga();
        mobil.hargaAkhir();
    }
}
