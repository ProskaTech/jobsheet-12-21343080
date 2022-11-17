/*
 * Created by 21343080_Andi Sultan Al Ayyubi
 */

package LATIHAN3;

class Bank {
    float sukuBunga(){
        return 0;
    }    
}

class BRI extends Bank{
    float sukuBunga(){
        return 5.5f;
    }
}

class BNI extends Bank{
    float sukuBunga(){
        return 10.6f;
    }
}

class Mandiri extends Bank{
    float sukuBunga(){
        return 9.4f;
    }
}