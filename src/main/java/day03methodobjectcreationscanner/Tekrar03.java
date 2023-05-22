package day03methodobjectcreationscanner;

import static day03methodobjectcreationscanner.MethodCreation01.printConsole;

public class Tekrar03 {

    public static void main(String[] args) {

        double kup = kuphesaplama(5);
        System.out.println("kup = " + kup);

        pirint("java is easy");
        //Ornek 2 ikinci yol: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.

        String str = "kars";
        pirintConsole(str);

//Ornek 3: Verilen iki tam sayiyi carpan ve sonucu ekrana yazdiran methodu olusturup kullaniniz.
        int a = 3;
        int b = 5;
        carpamaYap(a, b);
//*******************************************
        //Ornek 4: Verilen bir tamsayinin karesini hesaplayip console a yazdiran methodu olusturup kullaniniz.
        int sayı = 5;
        karesiniAll(sayı);

    }//main******************************************************************************************************

    private static void karesiniAll(int sayı) {
        System.out.println(sayı * sayı);
    }


    private static void carpamaYap(int a, int b) {
        System.out.println(a * b);
    }

    private static void pirintConsole(String str) {
        System.out.println(str);
    }

    //ör:1 verilen bir ondalık sayının küpünün hesapşayan bir method oluşturup kulanınız

    static double kuphesaplama(double a) {
        return a * a * a;
    }

    //Ornek 2: Girilen bir kelimeyi ekrana yazdiran bir method olusturup kullaniniz.
    public static void pirint(String str) {

        System.out.println(str);
    }




















}//clas***********************************************************************************************************
