package TEKRAR_10;

import java.util.Scanner;

public class Nestedıf02_T {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz...");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        boolean ucgenmi =
                a + b > c && c > Math.abs(a - b) &&
                        a + c > b && b > Math.abs(a - c) &&
                        b + c > a && a > Math.abs(b - c);

if (a<=0 || b<=0 || c<=0){
    System.out.println("geçerli kenar uzunlugu giriniz");
}

        if (ucgenmi) {

            if (a==b && b==c && a==c ) {
                System.out.println("eşkenar üçgen");

            } else if ( a==b  || b==c|| a==c) {
                System.out.println("ikiz kenar üçgen");

            } else {
                System.out.println("çeit kenar üçgen");

            }


        } else {
            System.out.println("uçgen degil");
        }


    }//main
}//class
