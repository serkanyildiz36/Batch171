package day12nestedternaryswitchloops;

import java.util.Scanner;

public class switch03 {
    public static void main(String[] args) {
        //Example 1: Kulanicidan iki sayi ve yapilacak islemi
        //   alan ve +, -, *, /, % islemlerini yapan kodu yaziniz


        Scanner input = new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        System.out.println("yapılacak  işlemi giriniz. +,-,*,/,% dan birini giriniz");
        char opr = input.next().charAt(0);


        switch (opr) {
            case '+':
                System.out.println(a + " + " + b + " = " + (a + b));
                break;
            case '-':
                System.out.println(a + " - " + b + " = " + (a - b));
                break;
            case '*':
                System.out.println(a + " * " + b + " = " + (a * b));
                break;
            case '/':
                System.out.println(a + " / " + b + " = " + (a / b));
                break;
            case '%':
                System.out.println(a + " % " + b + " = " + (a % b));
                break;
            default:
                System.out.println("bu işlem tanımlanmamıştır");

        }//switch
    }//main
}//class
