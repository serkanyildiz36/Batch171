package day04scannerwrapper;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
//kulanıcıdan adresini alınız ve ekrana yazdırınız.
        Scanner input=new Scanner(System.in);
        System.out.println(" lütfen adresinizi giriniz...");

    //nextLine() methodu kulanıcıdan öok keliimeli string almak için kullanılır
       String adres =input.nextLine();
        System.out.println(adres);


    }//main
}//class
