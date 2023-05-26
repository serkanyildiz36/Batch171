package TEKRAR_14_T;

public class Lops_01_T {


    public static void main(String[] args) {

        //Ornek: Bir String i ters ceviren kodu yaziniz//*** interviw sorusu****
        // "Java" ==> "avaJ"


        //1yol:
        String t = "Java";
        String ters = "";

        for (int i = t.length() - 1; i >= 0; i--) {

            ters = ters + t.substring(i, i + 1);

            System.out.println("loop ==>" + ters);//burd OLUNCA SOUT GİDİŞ YOLUNU GÖSTERİYOR
            // sonuç için sıkopun(parantez) dışımda yazdır
        }
        System.out.println(ters);
//2yol en güzel yol bu

        String u = "Java";
        String ters1 = "";

        for (int i = u.length() - 1; i >= 0; i--) {
            ters1 = ters1 + u.charAt(i);
        }
        System.out.println(ters1);

        //kendim
        String s = "Java";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 0) {
                break;
            }
            System.out.print(s.charAt(i));
        }












        //Ornek 2 Size verilen bir string in palindrome olup olmadigini kontrol eden kodu yaziniz
        //         ey edip adanada pide ye , nalan, kucuk, ada
        //Logic : String i ters cevir sonra da duz hali ile ters halini karsilastir,
        // ayni ise Palindrome dur.

        String duz = " Ey edip adanada pide ye";
        String ters2 ="";

        for (int i =duz.length()-1 ; i>=0 ; i--) {
          ters2=ters2+duz.charAt(i);
        }
        System.out.println(ters2);


        if (duz.equalsIgnoreCase(ters2) ) {


            System.out.println("palidrom olur");
        }else{
            System.out.println("palidrom degildir");
        }










    }//main
}//class
