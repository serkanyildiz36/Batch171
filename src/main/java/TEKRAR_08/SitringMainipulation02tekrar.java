package TEKRAR_08;

public class SitringMainipulation02tekrar {
    public static void main(String[] args) {

        //Ornek :  Bir string in belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz
        //         abc@gmail.com   ===> gmail

        //Ornek 1:  Bir string in belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz
        //      abc@gmail.com   ===> gmail

        String a = "  abc@gmail.coma";

        int startingındex = a.indexOf('@') + 1;
        int endingındex = a.indexOf('.');

        String companyName = a.substring(startingındex, endingındex);
        System.out.println("companyName = " + companyName);

        //Ornek 2:Verilen iki string in birbirinin aynisi olup olmadigini kontrol eden kodu yaziniz

        String h = "ali can";
        String i = "Ali Can";

        boolean result = h.equals(i);
        System.out.println("result = " + result);

        //Java da Memory kullanimi
        /*
        java da iki tane memory vardir
        1)Stack Memory ==> small
            a)Kucuk memorydir
            b)Primitive leri ve Non-Primitivelerin adreslerini (reference) tutar

        2) Heap Memory ==> Huge
            a)Buyuk memory dir
            b)Non-Primitive datalari icerir
            ==>Java heap memory de yerlestirilen tum Non-primitive datalar icin bir adres olusturur
            ve bu adresi stack memory de saklar
         */

        /*
        Note: String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
        Neden kullaniriz?
        Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar,
        ikiside ayni ise stringler esittir de. ama biz code yazarken genellikle Stringlerin adressleri ile degil
        degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz

        "equals()" methodu ise iki string i karsilastirirken sadece degerlerine bakar. degerleri ayni ise bu iki string
        esittir der, degerler farkli ise bu iki string farklidir der ki bu bizim kod yazarken ihtiyac duyudugumuz seydir

         */

        String s = "tom";
        String t = "TErry";
        String r = new String("tom");


        System.out.println(s == t);//false çünkü adresler ve degerler farklı
        System.out.println(s.equals(t));// false degerler farklı
        System.out.println(s == r);//false çünkü adresler faklı
        System.out.println(s.equals(r));//true çünkü degerlere bkar s ve r nin degerler aymı oldugunda n
        //---------------------------------------------------------------------------------------------------
//  //Ornek 3:Verilen iki string in birbirinin aynisi olup olmadigini  büyük harf kücük harf dikkate almadan
//  kontrol eden kodu yaziniz

        String j = "ali can";
        String k = "Ali Can";

        boolean result3 = j.equalsIgnoreCase(k);
        System.out.println(result3);


    }//main
}//class
