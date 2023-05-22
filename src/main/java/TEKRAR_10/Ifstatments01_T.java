package TEKRAR_10;

import java.util.Scanner;

public class Ifstatments01_T {
    public static void main(String[] args) {
        //Example:  Verilen bir sayinin pozitif, negatif veya notr
        // oldugunu kontrol eden kodu yazinizif
        Scanner iput = new Scanner(System.in);
        System.out.println("lütfen sayı giriniz...");
        int num = iput.nextInt();


        if (num > 0) {
            System.out.println("pozitif...");
        } else if (num < 0) {
            System.out.println("Negatif");
        } else {
            System.out.println("Nötür...");

        }




    }//main
}//CLASS
