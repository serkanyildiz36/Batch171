package TEKRAR_08;

import java.util.Scanner;

public class ödev {
    public static void main(String[] args) {


        /*
   Homework

    /*Homework
    1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
    2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
    3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
    4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
    console a yazdirin
    5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun

    Note 1: Once canli oturum sirasinda cozulen ornekleri yapiniz
    Note 2: Tum sorulari dinamik kodlarla cozulmelidir
    Note 3: Birbirinizin cozumlerini inceleyerek tavsiyede bulunabilir yada yardim isteyebilirsiniz

     */

        //1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz

        String k = "sarıkamışın dogal güzelligi 12 ay boyunca bulunur";
        System.out.println(k.replaceAll("[0-9]", "").length());


        // 2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki
        // tum karakterleri console a buyuk harflerle yazdiriniz


        String k1 = "sarıkamışın dogal güzelligi 12 ay boyunca bulunur";
        int ilksonkarekter = k1.length() - 1;
        String sonuç = k1.substring(1, ilksonkarekter).toUpperCase();
        System.out.println(sonuç);

        // 3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz

        String zozan = "yayladki bağ evi";

        int ilkkarekterindex = zozan.charAt(0);
        System.out.println(ilkkarekterindex);

        int sonkarekterindex = zozan.length() - 1;
        int sonindex = zozan.charAt(sonkarekterindex);
        System.out.println(sonkarekterindex);
        System.out.println(ilkkarekterindex + sonkarekterindex);


        // 4) Tek kelimeli bir sehir ismi icin string variable olusturun ve
        // sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
        // console a yazdirin

        String s = "sarıkamış";

        String ilkharfbüyük = s.toUpperCase().charAt(0) + s.toLowerCase().substring(1);
        System.out.println(ilkharfbüyük);

       /* 5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun    */


        Scanner input = new Scanner(System.in);
        System.out.println("lütfen passwordunuzu giriniz");
        String parola = input.nextLine();


//  a)En az 6 character olsun

        boolean parola1 = parola.length() > 5;
        System.out.println("en az 6 karekter varmı " + parola1);
        
      //  b)En az bir tane buyuk harf olsun
      boolean bhrf=  parola.replaceAll("[^A-Z]","").length()>0;

        System.out.println("bhrf = " + bhrf);


        //  c)En az bir tane kucuk harf olsun
        boolean kharf=parola.replaceAll("[^a-z]","").length()>0;
        System.out.println("kharf = " + kharf);

       // d)En az bir tane rakam olsun
boolean rakam=parola.replaceAll("[^0-9]","").length()>0;
        System.out.println("rakam = " + rakam);


    }//main
}//class
