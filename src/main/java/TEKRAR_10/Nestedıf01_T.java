package TEKRAR_10;

import java.util.Scanner;

public class Nestedıf01_T {

    public static void main(String[] args) {
 /*
     Example 1: Kullanicidan 3 tane sayi aliniz.
                 Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
                 Eger ucgen ise "eskenar" Ucgen olma durumunu kontrol ediniz.
                 INFO :
                 Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                                   herhangi iki kenar farki ucuncu kenardan kucuk olmali
                 a+b>c>|a-b|
                 a+c>b>|a-c|
                 b+c>a>|b-c|
                 a=b=c ise eskenar ucgen     */


        Scanner input = new Scanner(System.in);
        System.out.println("üçgenin kenarları için 3 tane uzunluk giriniz..");
        double a = Math.abs(input.nextDouble());
        double b = Math.abs(input.nextDouble());
        double c = Math.abs(input.nextDouble());

      boolean uçgenmi=  a+b>c && c> Math.abs(a-b) &&
                a+c>b && b> Math.abs(a-c) &&
                b+c>a && c> Math.abs(b-c);

        if (uçgenmi) {

            if (a==b && b==c && a==c) {
                System.out.println("üçgen hemde eşkenar üçgen");
            }else {
                System.out.println("üçgen ama eşkenar üçgen degil..");

            }


        }else {
            System.out.println("sen üçgen degilsin");
        }


    }//main
}//class
