package TEKRAR_07;

import java.util.Scanner;

public class tekrar07 {
    public static void main(String[] args) {

/////////// DAY08 /*/*/*/*/*/*/*/*/*/*/*/*/*//*/*/*/*/*/*/*/*/*/*/

        //Ornek1: "t" stringindeki tum rakamlari "*" ceviriniz

        //Note:Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz
        //Note:Bir grup datayi degistirmek icin replaceAll()kullanilir
        /*
                        Meshur Regex
           1)Tum  rakamlar ==> [0-9]
           2)Tum kucuk harfler==> [a-z]
           3)Tum buyuk harfler==> [A-Z]
           4)Tum kucuk ve buyuk harfler==> [a-zA-Z]
           5)Tum harfler ve rakamlar ==>[a-zA-Z0-9]
           6)Tum noktalama isaretleri==>\\p{Punct}
           7)Tum sesli harfler ==> [aeiouAEIOU]
             Tum x,q,w harfleri     ==> [xqw]i
           8)Kucuk harflerden farkli tum characterler ==>[^a-z]
           9)Tum harflerden farkli tum characterler ==>  [^a-zA-Z]
           10) sdace space karakteeri==>//s
           space karekteri hariç ==>//S
           sadece rakamlar==>//d
           rajamlar hariç==>//D
         */
        String t = "Ali 13 yasindadir!...";

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...

//ör2: t sitringindeki tüm rakamları ve harfleri "!" e ceviriniz
        String t2 = t.replaceAll("[a-zA_Z0-9]", "!");
        System.out.println(t2);

//ör3:""t" stringindeki tüm sesli harfleri "?" eceviriniz
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);

        //Ornek 4:  "t" stringindeki kucuk harfler disindaki tum characterleri "<>" ceviriniz
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        //ör5:  "t" stringindeki tüm  harfler disindaki tum characterleri "+" ceviriniz

        String t5= t.replaceAll("[^a-zA-Z]","+");
        System.out.println(t5);

        //ör6:"t" stringindeki space dışındaki tüm karekterleri "?" çeviriniz

        String t6=t.replaceAll("[^ ]","?");
        System.out.println("t6 = " + t6);

        //ör7:"t" stringindeki sesli harfler dısındaki tüm carakterleri "&" e ceviriniz
  String t7=t.replaceAll("[^aeiouAEIOU]","&");
        System.out.println(t7);

    }//main

    public static class tekrarStringManipilations02 {
        public static void main(String[] args) {
           /*
            Ornek:
                Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
                    1) En az 8 charcter olsun
                    2) Space characteri passwordde olmasin
                    3) En az bir buyuk harf olsun
                    4) En az bir kucuk harf olsun
                    5) En az bir rakam olsun
             */

            Scanner input = new Scanner(System.in);
            System.out.println("lütfen passwordunuzu giriniz..");
            String pwd = input.nextLine();

            //  1) En az 8 charcter olsun
            boolean first = pwd.length() > 7;
            System.out.println("first " + first);

            //  2) Space characteri passwordde olmasin
            boolean second = !pwd.contains(" ");
            System.out.println("second = " + second);

            //  3) En az bir buyuk harf olsun
            //Note:Buyuk harf olmayanlari sil
            //     kalan character sayisina bak
            //     character sayisi sifir ise buyuk harf yok demektir
            //      sifirdan buyuk ise buyuk harf var demektir
            boolean third = pwd.replaceAll("[^A-Z]", "").length() > 0;//methodları aynı satırda yan yana kullanmya chain denir
            System.out.println("third = " + third);

               //  4) En az bir kucuk harf olsun
            boolean fourth = pwd.replaceAll("[^a-z]", " ").length() > 0;
            System.out.println("fourth = " + fourth);

            //5) En az bir rakam olsun

           boolean  rakam = pwd.replaceAll("[^0-9]"," ").length()>=0;
            System.out.println("rakam = " + rakam);

        }//main
    }//class
}//class
