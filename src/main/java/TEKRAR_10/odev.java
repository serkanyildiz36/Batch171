package TEKRAR_10;

import java.util.Scanner;

public class odev {
    public static void main(String[] args) {
      /*
    Homework
    1)Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
    //ve kullaniciya uygun mesaj veren kodu yaziniz

    2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
    //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....

    3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
    //  1==> January, 2 ==> February .....

*/
        //soru bir ve çözüm
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen passowordu giriniz");
        String parola = input.nextLine();

        if (parola.equals("pwd123!")) {
            System.out.println("parolanız dogru");
        } else {
            System.out.println(" lütfen dogru parola giriniz");
        }
//soru iki ve çözüm*******************--------------------------///////////////////////////////

        //2)Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
        //  Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....


        Scanner haftanıngünleri = new Scanner(System.in);
        System.out.println("lütfen gün ismini giriniz");
        String gün = haftanıngünleri.next();

        if (gün.equalsIgnoreCase("pazar")) {
            System.out.println(1);
        } else if (gün.equalsIgnoreCase("pazartesi")) {
            System.out.println(2);

        } else if (gün.equalsIgnoreCase("salı")) {
            System.out.println(3);

        } else if (gün.equalsIgnoreCase("çarşamba")) {
            System.out.println(4);
        } else if (gün.equalsIgnoreCase("perşembe")) {
            System.out.println(5);
        } else if (gün.equalsIgnoreCase("cuma")) {
            System.out.println(6);
        } else if (gün.equalsIgnoreCase("cumartes")) {
            System.out.println(7);
        } else {
            System.out.println("hatalı gün ismi girdiniz");
        }

        //3soru  3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
        //  1==> January, 2 ==> February .....

        Scanner ay = new Scanner(System.in);
        System.out.println("lütfen bulundugunuz ayın rakamsaldegerini giriniz");
        int numay = ay.nextInt();

        if (numay==1){
            System.out.println("January");
        } else if (numay==2) {
            System.out.println("February");

        }else if (numay==3) {
            System.out.println("February");

        }else if (numay==4) {
            System.out.println("February");

        }else if (numay==5) {
            System.out.println("February");

        }else if (numay==6) {
            System.out.println("February");

        }else if (numay==7) {
            System.out.println("February");

        }else if (numay==8) {
            System.out.println("February");

        }else if (numay==9) {
            System.out.println("February");

        }else if (numay==10) {
            System.out.println("February");

        }else if (numay==11) {
            System.out.println("February");

        }else if (numay==12) {
            System.out.println("February");

        }else  {
            System.out.println("lütfen 1 ile 12 arasında sayı giriniz");

        }


    }//main
}//class
