package day04scannerwrapper;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Ornek : Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //a) Alanini hesaplayiniz  ==> Kisa kenar * Uzun kenar
        //b) Cevresiniz hesaplayiniz ==> 2 * Kisa kenar + 2 * Uzun kenar

     Scanner input=new Scanner(System.in);
        System.out.println("diktörtgenin kısa kenar uzunlugunu giriniz");
      double sohrtSide = input.nextDouble();

        System.out.println("diktörtgenin uzun kenar uzunlugunu giriniz");
   double longSide = input.nextDouble();

        System.out.println("Alan"+(sohrtSide*longSide));
        System.out.println("cevre"+(2*sohrtSide+2*longSide));

    }//main
}//class