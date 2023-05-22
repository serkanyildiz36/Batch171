package day10ifstatments;

import java.util.Scanner;

public class IfStatements02 {


    public static void main(String[] args) {
        //Example 1: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kacıncı gün oldugunu giriniz..");
        byte num = input.nextByte();

        if (num == 1) {
            System.out.println("Sundany");
        } else if (num == 2) {
            System.out.println("monday");
        } else if (num == 3) {
            System.out.println("Tuesday");
        } else if (num == 4) {
            System.out.println("wednesday");
        } else if (num == 5) {
            System.out.println("Thurrsday");
        } else if (num == 6) {
            System.out.println("firiday");
        } else if (num == 3) {
            System.out.println("Saturday");
        } else {
            System.out.println("hatalı giriş yaptınız .lütfen 1 ile 7 arasında bir sayı giriniz");
        }


    }//main

}//class
