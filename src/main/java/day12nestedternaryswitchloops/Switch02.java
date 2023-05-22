package day12nestedternaryswitchloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //Example 1: Ay numarasini soyleyince, numarasi verilen ay'dan baslayip 12.aya kadar tum aylarin isimlerini
        //           yazdiran kodu yaziniz.
        //           8 ==> August - September - October - November - December

        Scanner input = new Scanner(System.in);
        System.out.println("başlangıç ayın kaçıncı ay oldugunu giriniz");

        int ay = input.nextInt();


        switch (ay) {
            case 1:
                System.out.println("january");
            case 2:
                System.out.println("february");
            case 3:
                System.out.println("march");
            case 4:
                System.out.println("april");
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("agust");
            case 9:
                System.out.println("september");
            case 10:
                System.out.println("october");
            case 11:
                System.out.println("november");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("geçerli ay numaarası giriniz..");
        }


        /*
        Note : "switch" condition parantezi icinde String, int, byte, short, char kullanilabilir
        Note :  "switch" condition parantezi icinde long, boolean, float, double kullanilamaz.

         */









    }//main
}//class
