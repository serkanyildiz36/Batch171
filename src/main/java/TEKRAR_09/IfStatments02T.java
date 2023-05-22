package TEKRAR_09;

import java.util.Scanner;

public class IfStatments02T {
    public static void main(String[] args) {
        //Ornek: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu konsola yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
//1yol
        int num = input.nextInt();

        if (num % 2 == 0) {
            System.out.println("çift syı..");
        }
        if (num % 2 != 0) {
            System.out.println("tek sayı...");
        }
//2yol

       if (num%2==0){
           System.out.println("çift sayı...");
       }else {
           System.out.println("tek sayı....");
       }





    }//main
}//class
