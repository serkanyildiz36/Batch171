package TEKRAR_12;

import java.util.Scanner;

public class Switch_02_T {
    public static void main(String[] args) {
        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           8 ==> August - September - October - November - December


        Scanner input = new Scanner(System.in);
        System.out.println(" lütfen ayın bulundugu sayıyı giriniz");
        int ay = input.nextInt();

        switch (ay){
            case 1:
                System.out.println("january");
            break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("marc");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("julay");
                break;
            case 8:
                System.out.println("agust");
                break;
            case 9:
                System.out.println("sebtember");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("desember");
                break;
            default:
                System.out.println("geçerli ay numarası veriniz");
        }














    }//main
}//class
