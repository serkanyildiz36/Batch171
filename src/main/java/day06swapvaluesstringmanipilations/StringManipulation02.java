package day06swapvaluesstringmanipilations;

public class StringManipulation02 {
    public static void main(String[] args) {
        String s = "learn java earn money";
        //ör1: s stringinin money ile bitip bitmedigini kontırol ediniz
        boolean isend = s.endsWith("money");
        System.out.println(isend);
//ör2:s stringinin money kelimesini dolar kelimesine çeviriniz
        String s1 = s.replace("money", "dolar");
        System.out.println(s1);

        //ör3:s stringinin earn kelimesini win kelimesine çeviriniz
        String s2 = s.replace("earn", "win");
        System.out.println(s2);//lwin java money

        //ör4:s stringinin a harflerini yılıda çeviriniz
       String yıldız= s.replace("a","*");
        System.out.println(yıldız);

        //ör5:s stringin deki n harflerini üç tane "xxx" çeviriniz
        String s4=s.replace("n","xxx");
        System.out.println(s4);

//ör6:s stringin deki e harflerini siliniz
     String s5=   s.replace("e","");
        System.out.println(s5);

        String t = "Ali 13 yaşındadır!...";
        //ör7:"t" stringindeki  tum rakamları "*" ceviriniz.

     String t1= t.replaceAll("[0-9]","*");
        System.out.println(t1);

        /*
  ********** Regex ler ********

   1) Tum rakamlar               ==> [0-9]
   2) Tum kucuk harfler          ==> [a-z]
   3) Tum buyuk harfler          ==> [A-Z]
   4) Tum Kucuk ve buyuk harfler ==> [a-zA-Z]
   5) Tum harfler ve rakamlar    ==> [a-zA-Z0-9]
   6) Tum noktalama isaretleri   ==> \\p{Punct}
   7) Tum sesli Harfler          ==> [aeiouAEIOU]
   8) Tum x,q,w harfleri         ==> [xqw]


  ******* Olumsuz Regex ler ******

   9) Kucuk harflerden farkli tum characterler => [^a-z]
   10 Tum harflerden farkli tum characterler   =>[^a-zA-Z]
 */



    }//main
}//class
/*


8) endsWith () : Metnin belirli bir datayla bitip bitmedigini verir

Bize boolean bir sonuc dondurur
Tek karakterde, coklu karakterde kullanilabilir


9)  replace () : Metnin içerisindeki belirli bir datanin yerine verilen diger datayi yerlestirir
String datayi dondurur.Tekli karakterler ile de coklu String karakterler ile de calisir
Her iki tarafta da "" ya da her iki tarafta da '' kullanilmalidir

10) replaceAll () : Bir grup datayi degistirmek icin kullanilir.
Bir grup data'yi ifade edebilmek icin Regular Expression (Regex) kullanilir.

11) replaceFirst () : replace () ile ayni isi yapmakkla birlikte ilk gordugu datayi degistirir.

12) trim () : Bir String'de bastaki ve sondaki space karakterlerini siler, ortadaki
              space karakterlerine dokunmaz.
13) isEmpty () : String data'nin icerisinde hicbir sey yoksa True dondurur.
                 Java'da space'de bir karakter oldugu icin space varsa False dondurur.


14) isBlank () : ==>space+hiclik ise True dondurur.
                 String bir data'nin bos mu dolu mu olduguna bakar isEmpty'den farki space varsa
                 yine true dondurur.


15) indexOf () : Verilen karakter veya karakterlerin ilk gorunumunun indexini verir.
                 int deger dondurur.
                 Coklu data icin kullanildiginda ilk ngordugu data'nin ilk karakkterinin
                 index'ini verir.
                 Olmayan bir karakterin index'i sorulursa bize -1 dondurur.


16) lastIndexOf () : Verilen String bir data'da istenilen degerin son gorunumunun indexini verir.
                     Olmayan bir karakter sorgulanirsa -1 dondurur.

17) If Statement () : Bazen kodlarin calismasi belirli kosullara baglidir.
                      Mesela cok calisirsam java ogrenecegim. Java ogrenme eylemi
                      cok calisma eylemine baglanmistir.
                      1. eylem gercekklesmeden ikinci eylem gerceklesmez.
                      if() {}
                      () parantez icine sart yazilir. Eger True dondurulurse {} body arasindaki kod calisir
                      aksi halde if body disina cikar class'ta sonraki kodlari okumaya devam eder.

 */

/*
\\s     :space (boşluk)
\\S     :space dışındaki tüm karakterler (buyuk S harfi)
\\w     :harfler ve rakamlar (a-z,A-Z,0-9)
\\W     :harfler ve rakamlar dışındaki tüm karakterler (buyuk W harfi)
\\d     :digits (rakamlar 0-9)
\\D     :rakamlar dışındaki tüm karakterler
 */
