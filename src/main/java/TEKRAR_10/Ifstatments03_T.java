package TEKRAR_10;

import java.util.Scanner;

public class Ifstatments03_T {
    public static void main(String[] args) {

//Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.
        //Example 1: Ay isimleri girilince kacinci ay oldugunu yazan kodu yaziniz.
        // January ==> 1  ,  February ==>2

        Scanner ay = new Scanner(System.in);
        System.out.println("lütfen ay ismini giriniz ");
        String ayismi = ay.next();


        if (ayismi.equals("january")) {
            System.out.println(1);
        } else if (ayismi.equalsIgnoreCase("February")) {
            System.out.println(2);
        } else if (ayismi.equalsIgnoreCase("March")) {
            System.out.println(3);
        } else if (ayismi.equalsIgnoreCase("April")) {
            System.out.println(4);
        } else if (ayismi.equalsIgnoreCase("May")) {
            System.out.println(5);
        } else if (ayismi.equalsIgnoreCase("june")) {
            System.out.println(6);
        } else if (ayismi.equalsIgnoreCase("july")) {
            System.out.println(7);
        } else if (ayismi.equalsIgnoreCase("Agust")) {
            System.out.println(8);
        } else if (ayismi.equalsIgnoreCase("Septenber")) {
            System.out.println(9);
        } else if (ayismi.equalsIgnoreCase("October")) {
            System.out.println(10);
        } else if (ayismi.equalsIgnoreCase("Novemver")) {
            System.out.println(11);
        } else if (ayismi.equalsIgnoreCase("December")) {
            System.out.println(12);
        } else {
            System.out.println("geçerli sayı giriniz");
        }


    }//main
}//class
//İngilizce Ay İsimleri
//Ocak - January
//Şubat - February
//Mart - March
//Nisan - April
//Mayıs - May
//Haziran - June
//Temmuz - July
//Ağustos - Agust
//Eylül - September
//Ekim - October
//Kasım - November
//Aralık -December