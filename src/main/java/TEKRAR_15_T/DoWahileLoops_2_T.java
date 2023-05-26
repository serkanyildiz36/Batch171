package TEKRAR_15_T;

import java.util.Scanner;

public class DoWahileLoops_2_T {

    public static void main(String[] args) {

        /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("biri sayı giriniz");
            int num = input.nextInt();

            if (num >= 100) {
                System.out.println("kazandınız");

            } else {
                System.out.println("kaybettiniz");
                break;
            }

        } while (true);


    }//main
}//class
