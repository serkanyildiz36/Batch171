package TEKRAR_10;

import java.util.Scanner;

public class Ifstatments02_T {
    public static void main(String[] args) {
        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....

        Scanner day = new Scanner(System.in);
        System.out.println("lütfen kaçıncı gün oldugunu giriniz");
        byte num = day.nextByte();


        if (num == 1) {
            System.out.println("sunday= pazar");
        } else if (num == 2) {
            System.out.println("monday=pazartesi");
        } else if (num == 3) {
            System.out.println("Tuesday=salı");
        } else if (num == 4) {
            System.out.println("wednesday= çarşamba");
        } else if (num == 5) {
            System.out.println("Tuhursday=perşembe");
        } else if (num == 6) {
            System.out.println("Firiday=cuma");
        } else if (num == 7) {
            System.out.println("Saturday=cumartes");
        } else {
            System.out.println("lütfen geçerli sayı giriniz 1-7 arasında");
        }


///////////////////////////////////////////////////////////////////
        /*
            Pazartesi -    Monday
            Salı -         Tuesday
            Çarşamba -     Wednesday
            Perşembe -     Thursday
            Cuma -         Friday
            Cumartesi -    Saturday
            Pazar -        Sunday
         */


    }//main
}//clas
