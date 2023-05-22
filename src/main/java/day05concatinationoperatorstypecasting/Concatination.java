package day05concatinationoperatorstypecasting;

public class Concatination {
    public static void main(String[] args) {

        //Ornek 1: Bir string ve iki integer variable olusturun.
        // String degeri ile Integer larin toplamini console a yazdiirin

        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(s + a + b);//elma1011
        System.out.println(s + (a + b));//elma21
        System.out.println(s + a * b);//elma110
        System.out.println(a + b + s);//21elma
        System.out.println(a + s + b);//10elma11


// java da "+" sembolu iki sayı arasında kulanılırsa toplama işlemi olur.
        //java da "+" sembolu iki sitring arasında veya bir string ve bir sayı aarasında kulanılırsa "concatination" işlemi olur.
        //Concatination işlemlerinde java matematik teki işlem önceligini kulanir.
        /*
       Matematikte islem onceligi
        1)once uslu sayilar
        2)Parantez ici islemler yapilir
        3)Carpma ve Bolmeler yapilir
        4)Toplama ve cikarmalar yapilir
        5)Ayni oncelikli olanlarda soldan saga baslanir
         */


   // ör 2:   size String olarak verilen iki fiyatın toplamını ekrana yazdırınız.***********

      String shirt="2300";
      String sohoz="5200";
      // Integer.valuef() string degerini integer a cevirir
        System.out.println(shirt+sohoz);
     int toplamfiyat=   Integer.valueOf(shirt)+Integer.valueOf(sohoz);

        System.out.println(toplamfiyat);//7500

//ör 3:size String olarak verilen iki fiyatın toplamını ekrana yazdırınız
      /*  String tv="$1100";
        String radıo="$300";
        System.out.println(tv+radıo);
        int totalPirice=Integer.valueOf(tv)+Integer.valueOf(radıo);
        System.out.println(totalPirice);
*/
        //Note : valueOf() methodu tum karakterleri rakam olan String leri sayilara cevirir
        //Eger valueOf() methodu kullanilirken Stirng in icine rakam olmayan bir karakter koyarsaniz hata alirsiniz
        //valueOf() methoud kullanilirken sadece rakam olan karakterler kullanilmalidir.




    }//main
}//class
