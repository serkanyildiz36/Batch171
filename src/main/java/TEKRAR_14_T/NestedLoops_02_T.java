package TEKRAR_14_T;

import java.util.Scanner;

public class NestedLoops_02_T {
    public static void main(String[] args) {
 /*
              Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
                    X X X X X
                    X X X X X
                    X X X X X        */

        Scanner input = new Scanner(System.in);

        System.out.println("stır(rov)  sayısını giriniz");
        int row = input.nextInt();

        System.out.println("sutun(column)  sayısını giriniz");
        int column = input.nextInt();

        for ( int i=1 ;  i<=row ; i++ ) {

            for (int k = 1; k <=column ; k++) {
                System.out.print("x ");
            }
            System.out.println();
        }
/*
 for ( int i=1 ;  i<=5; i++ ) {

            for (int k = 1; k <=5 ; k++) {
                System.out.print("x ");
            }
            System.out.println();
        }

 */

    }//main
}//class
