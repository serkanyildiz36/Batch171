package day04scannerwrapper;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        // rakamlarin toplamini yazdiran kodu yaziniz.

        Scanner input = new Scanner(System.in);
        System.out.println("5 basamaklı bir sayı giriniz");
        int number = input.nextInt();

        //bir sayinin son rakamini alabilmek icin o sayiyi 10 a bolup kalani almaliyiz
        // % => modulus operator solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir
        // dolayisiyla %10 her zaman bize birler basamaginda bulunan sayiyi verir
        //bir tamsayiyi bir tamsayiya bolerseniz java sonucu kesinlikle tamsayi yapar
        //java  bu durumda yuvarlama yapmaz, ondalik kismi iptal eder
        //dolayisiyle bir tamsayiyi 10 a bolersek birler basamagini silmis oluruz


        //son rakamı al
        int birlerBasamagı = number % 10;
        //sayıkucult
        number = number / 10;

        //sonda ikinci rakamı al
        int sondanikinci = number % 10;
        number = number / 10;

        //sondan ucuncu rakamı al
        int sondanucuncurakamıal = number % 10;
        number = number / 10;

        //sondan dördüncürakamı al
        int sondanDördüncürakamıal = number % 10;
        number = number / 10;//sayıyı kçült burası sayıyı on bölmek demek

        //sondan beşinci rakamı al
        int sondanBeişincirakm = number % 10;//son rakam oldugu için küçültme ye gerek yok

        System.out.println(sondanBeişincirakm + sondanDördüncürakamıal + sondanikinci + birlerBasamagı);



/*
    Homework
    1) Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
     ornegin => 3,5,7 icin ortalama (3+5+7)/3=5
    2) Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
     ornegin => 312 icin 3+1+2=6


    */
    }//main
}//class