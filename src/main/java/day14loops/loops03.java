package day14loops;

import java.util.Scanner;

public class loops03 {
    public static void main(String[] args) {
 /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki
        tum cift tamsayilari ekrana yazdiriniz
         9 - 14 ==> 10  12  14     */


        Scanner input = new Scanner(System.in);
        System.out.println("başlangıç degerini giriniz...");
        int start = input.nextInt();

        System.out.println("bitiş degerini giriniz...");
        int end = input.nextInt();

        if (start > end) {
            System.out.println("başlangıç degeri bitiş degerinden buyuk olmamalı");
        } else {

            for (int i = start; i < end; i++) {
                if (i % 0 == 0) {
                    System.out.print(i + " ");
                }
            }
        }// int d='d'
        //ystem.out.println(d);ascıı degerini verir bu şekilde



        ///örnek. hiç sayı kulanmadan 1 den 100 kadar olan sayıları consola yazdırınız

        for (int i = 'd'/'d'   ;    i <='d'  ;    i++) {
            System.out.print(i+" ");
        }







    }//main
}//class