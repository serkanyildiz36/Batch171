package day10ifstatments;

import java.util.Scanner;

public class Ifstatments01 {
    public static void main(String[] args) {
        //Example:  Verilen bir sayinin pozitif, negatif veya notr
        // oldugunu kontrol eden kodu yazinizif
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("pozitiftir");
        } else if (num < 0) {
            System.out.println("negatif");

        }else {
            System.out.println("notr");
        }


    }//main
}//class
