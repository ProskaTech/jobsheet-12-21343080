package LATIHAN3;

/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

class polymorphismDynamic {
    public static void main(String[] args){
        Bank B;
        B = new BRI();
        System.out.println("Tingkat Suku Bunga BRI adalah: " + B.sukuBunga());
        B = new BNI();
        System.out.println("Tingkat Suku Bunga BNI adalah: " + B.sukuBunga());
        B = new Mandiri();
        System.out.println("Tingkat Suku Bunga Mandiri adalah: " + B.sukuBunga());
    }    
}
