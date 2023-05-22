package day07stringmanipilationns01;

public class StringManipulations01 {

    public static void main(String[] args) {

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
           space karekteri hariç ==>S
           sadece rakamlar==>//d
           rajamlar hariç==>D

         */
        String t = "Ali 13 yasindadir!...";

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);//Ali ** yasindadir!...

//ör2: t sitringindeki tüm rakamları ve harfleri "!" e ceviriniz
        String t2 = t.replaceAll("[a-zA-Z0-9]","!" );
        System.out.println(t2);


//ör3:""t" stringindeki tüm sesli harfleri "?" eceviriniz
    String t3 = t.replaceAll("aeiouAEIOU","?");
        System.out.println(t3);

        //Ornek 4:  "t" stringindeki kucuk harfler disindaki tum characterleri "<>" ceviriniz
        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);//<>li<><><><>yasindadir<><><><>

       //ör5:  "t" stringindeki tüm  harfler disindaki tum characterleri "+" ceviriniz
    String t5=t.replaceAll("^a-zA-Z","+");
        System.out.println(t5);

        //ör6:"t" stringindeki space dışındaki tüm karekterleri "?" çeviriniz
     String t6=   t.replaceAll("[^]","?");
        System.out.println(t6);

        //ör7:"t" stringindeki sesli harfler dısındaki tüm carakterleri "&" e ceviriniz

       String t7= t.replaceAll("^aeiouAEIOU","&");
        System.out.println(t7);

    }//main
}//class

