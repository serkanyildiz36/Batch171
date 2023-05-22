package TEKRAR_09;

import java.util.Scanner;

public class IfStatments03T {

    public static void main(String[] args) {
        //Ornek : Verilen karakter buyuk harf ise ekrana "Buyuk harf" yazdiran
        // kucuk harf ise "Kucuk Harf" yazdiran kodu olusturunuz


        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir karekter giriniz");
        char ch = input.next().charAt(0);

        //1yol
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Büyük harf..");
        }
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("küçük harf");
        }


//2yol ///// ikinci yol tfsiye edlir*****************
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("büyük harf...");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("küçük harf...");
        } else {
            System.out.println("harf degil....");
        }










    }//main
}//class