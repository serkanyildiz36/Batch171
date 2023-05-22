package TEKRAR_10;

import java.util.Scanner;

public class IfStatment04_T {
    public static void main(String[] args) {
    /*    Example 1:Kullanicidan yas degerini alan ve yasin hangi evrede oldugunu
        asagidaki tabloya gore yazdiran kodu olusturunuz
        0-4 ==> bebek
        5-12 ==> cocuk
        13-20 ==> genc
        21-30 ==> yetiskin
        30 ustu ==> Tanimlanmamis
        Hata Mesaji olarak "Gecerli bir yas giriniz" yazdiriniz         */

        Scanner input=new Scanner(System.in);
        System.out.println("lütfen yaşınızı giriniz");
       int yaş= input.nextInt();


       if (yaş>=0 && yaş<=4){
           System.out.println("bebek");
       } else if (yaş>=5 && yaş<=12) {
           System.out.println("çocuk");
       }else if (yaş>=13 && yaş<=20) {
           System.out.println("genç");
       }else if (yaş>=21 && yaş<=30) {
           System.out.println("yetişkin");
       }else if (yaş>=30) {
           System.out.println("tanımlanmamış");
       } else {
           System.out.println("geçerli bir yaş giriniz");
        }

       ///2 yol:: tafsiye edilir
        if (yaş<0) {
            System.out.println("geçerli bir yaş giriniz");
        } else if (yaş<5) {
            System.out.println("bebek");
        }else if (yaş<13) {
            System.out.println("çocuk");
        }else if (yaş<21) {
            System.out.println("genç");
        }else if (yaş<30) {
            System.out.println("yetişkin");
        }else {
            System.out.println("tanımlanmamış yaş...");
        }


    }//main
}//clas
