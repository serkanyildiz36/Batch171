package day04scannerwrapper;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {

        //kulanıcıdan iki sayı alıp dört işlem yapan ve işlemlerin sonuçlarını ekrana yazdıran kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println(" iki sayı giriniz...");
        double FirstNumber = input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println(FirstNumber + secondNumber);

        System.out.println(FirstNumber - secondNumber);

        System.out.println(FirstNumber * secondNumber);

        System.out.println(FirstNumber / secondNumber);


    }//main
}//class
