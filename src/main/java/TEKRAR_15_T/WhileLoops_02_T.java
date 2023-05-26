package TEKRAR_15_T;

import java.util.Scanner;

public class WhileLoops_02_T {

    public static void main(String[] args) {
        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30*/
        Scanner input = new Scanner(System.in);
        System.out.println("çarpım tablosu için lütfen bir sayı giriniz");
        int num = input.nextInt();

        int i = 1;
        while (i < 11) {
            System.out.println(num + " x " + i + " = " + num * i);
            i++;
        }

//wxample2: verilen bir stringde her harfin sonrasına
// "*" sembolunu ekleyiniz

        // java==>j*a*v*a*
        Scanner input2 = new Scanner(System.in);
        System.out.println("bir kelime giriniz");
        String word = input2.next();
        String newword = "";

        int k = 0;

        while (k < word.length()) {

            newword = newword + word.charAt(k) + " x ";
            k++;
        }
        System.out.println(newword);

        //Example 3: Bir string deki tekrarsiz karakterleri
        // console a yazdiriniz.
        // kertenkelle  ==> rtn
        // indexOf("k") ==> 0  farkli, tekrarli
        // lastIndexOf("k") ==> 6

        // indexOf("r") ==> 2  ayni ise tekrarsiz
        // lastIndexOf("r") ==> 2

        String s = "kertenkelle";
        String sonuç = "";
        int a = 0;
        while (a < s.length()) {
            char ch=s.charAt(a);

            if (s.indexOf(ch)==s.lastIndexOf(ch)) {
sonuç=sonuç+ch;
            }
            a++;
        }
        System.out.println(sonuç);

    }//main
}//class