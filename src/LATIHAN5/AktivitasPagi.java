/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

package LATIHAN5;

interface AktivitasPagi {
    abstract void lari();

    abstract void berenang();
}

class AktivitasPagiAnak implements AktivitasPagi{
    @Override
    public void lari(){
        System.out.println("Aktivitas pertama pagi ini adalah lari pagi");
    }

    @Override
    public void berenang(){
        System.out.println("Aktivitas kedua pagi ini adalah berenang");
    }
}
