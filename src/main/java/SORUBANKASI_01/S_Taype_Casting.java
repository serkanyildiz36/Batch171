package SORUBANKASI_01;

import java.util.Scanner;

public class S_Taype_Casting {
    public static void main(String[] args) {

        /*
    Numeric primitve data type larinin birbirine donusturulmesine "Type Casting " denir
    Numeric (sayisal) Data typelar  byte  -  short   -   int  -   long    -   float   -  double-
     */
        //Note 1: Kucuk data typelarini buyuk data typelarina cevirmeyi java otomatik olarak yapar
        //bu isleme "AutoWidening" (otomatik genisletme) denir.

        //Note 2: Buyuk data typelarini kucuk data typelarina cevirmek riskli bir istir, java bu riskli isi otomatik olarak yapmaz
        // bu islemi kod yazanlardan bekler.
        //Bu isleme "ExplicitNarrowing" (Aciktan Daraltma) denir



        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen -128 ile 127 arasaın da bir sayı giriniz ");
        Byte num = scanner.nextByte();
        System.out.println(5 * num);


    }//main
}//class
