package day06swapvaluesstringmanipilations;

public class
SitringManipulations01 {
    public static void main(String[] args) {
        //String bir non-pirimitiv bir data tayp dır ve aynı zamanda bir classdır.
        String s = "java is esay";//java kolaydır
        //ör1:"s"Stringindeki tüm cahareterleri büyük harf yapınız

        String supper = s.toUpperCase();
        System.out.println(supper);

        //Ornek2:"s" Stringindeki tum characterleri kucuk harf yapiniz
        String sLower = s.toLowerCase();
        System.out.println(sLower);//java is easy

        //Ornek3: "s" Stringindeki ilk characteri aliniz.
        char firstChar = s.charAt(0);
        System.out.println(firstChar);//J

        //Ornek4: "s" stringindeki bastan ikinci ve sondan ikinci characteri aliniz ve ekrana yazdiriniz
        char secondChar = s.charAt(1);
        char secondLastChar = s.charAt(10);
        System.out.println("" + secondChar + secondLastChar);//as

        //Ornek 5: "s" string inde kullanilan character sayisini bulunuz
        int sLength = s.length();
        System.out.println(sLength);//12

        //ör6:"s" string indeki ilk 4 cahreteri alınız
        // s.substring(0,4); bu kulanımda ilk indeks dahildir ikinci indeks hariçtir
        String ilkdört = s.substring(0, 4);
        System.out.println(ilkdört);

        //ör7:"s" string indeki is kelimesi alınız.
        String iskelimesi = s.substring(5, 7);
        System.out.println(iskelimesi);

        //ör8:"s" Stringindeki easy kelimesi
        String sonkelime = s.substring(8, 12);
        System.out.println(sonkelime);
        //:ikinci yol
        String sub4 = s.substring(8);
        System.out.println(sub4);//easy

        //ornek9 :"s" Stringinde "money kelimesini var olup olmadıgını kontırol ediniz
        boolean kelimevarmı = s.contains("money");
        System.out.println(kelimevarmı);

        //ör10:"s" Stringinde belli bir harfle başlayıp başlaamadıgını kontırol ediniz
        boolean isStart = s.startsWith("java");
        System.out.println(isStart);

        //ör11:"s" Stringinde 5 .index dahil olmak üzere bu indezten itibaren i
        // karekteri ile başlayıp başlamadıgını kontırol ediniz
        boolean başlıyormu= s.startsWith("i",5);
        System.out.println(başlıyormu);//true

    }//main

}//class
/*
STRING METHODLARI

1)toUpperCase() :>Tum harfleri buyuk harfe cevirir.
                 >bize String return eder.
2)toLowerCase() :>tum harfleri kucuk harf yapar.
                 >bize String return eder.
3) charAt() : >Bir String den belli bir index deki characteri almak icin kullanilir.
               >index ile calisir charAt() method u "char"return eder.
4)lenght() : >bir datadaki character sayisini bize verir.
             >int bir deger dondurur.
5)substring(): >iki kullanimi vardir.
               >substring(baslangic,bitis index) i verilirse
               baslangic index i dahil bitis indexi haric yazdirir
               >metnin ortasindan data almamizi saglar
               >substring(beginindex) String in verilen indexten sonra
                sonuna kadar verilmesini saglar
              >bu method bize String dondurur.
6)contains(): >bir data var mi yok mu diye bakar
              >bloolean deger dondurur.

7) startsWith() Metnin bas kisminin istenilen dizi(1 veya
                daha fazla karakter) ile eslesip eslesmedigini
                kontrol eder.Sonucu boolean dir
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