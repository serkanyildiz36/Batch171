package TEKRAR_11;

import java.util.Scanner;

public class NestedIf01_T {
    public static void main(String[] args) {
                 /*
       Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

       Eger calisan kadin ise;
        60 yasindan buyukse "Emekli Olabilir "yazdirin

       Eger calisan erkek ise;
        65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
    */

        Scanner input = new Scanner(System.in);
        System.out.println("cinsiyetinizi giriniz");
        String cinsiyet = input.next();

        System.out.println("yaşınızı giriniz");
        int yaş = input.nextInt();

if (yaş<0 || yaş>120){
    System.out.println("lütfen yaşınızı 0 ile 120 arasında giriniz");
}else if (cinsiyet.equalsIgnoreCase("kadın")) {
            if (yaş>60) {
                System.out.println("emekli olabilir");
            }else {
                System.out.println("çalışmalı");
            }
        }else if (cinsiyet.equalsIgnoreCase("erkek")) {
            if (yaş>65) {
                System.out.println("emekli olabilir");
            }else{
                System.out.println(" kesinlikle çalışmalıdır");
            }
        }else{
            System.out.println("tanımlı degil...");
        }





    }//main
}//class
