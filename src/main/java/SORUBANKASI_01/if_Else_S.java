package SORUBANKASI_01;

import java.util.Scanner;

public class if_Else_S {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen bir pozitif  sayı giriniz");
        int a = scan.nextInt();

        if (a>9 && a<100) {

            System.out.println("elma");

        }if (a>99 && a<1000){

            System.out.println("armut");

        }if( !(a>99 && a<1000) && !(a>9 && a<100)){
            System.out.println("karpuz");
        }



























    }//main
}//class
