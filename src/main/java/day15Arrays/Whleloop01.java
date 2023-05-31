package day15;

public class Whleloop01 {
    public static void main(String[] args) {

//Kalibini olusturalim
        /* for kalibi
        for (baslangic degeri ;  loop calisma kurali   ;  artirma / azaltma) {
            calisacak kodlar
        }
        */
        //while loop kalibi
/*
        baslangic degeri
        while(loop calisma kurali ){
            calisacak kodlar

            artirma / azaltma
        }*/

        //örnek 3 ten 6 kadar tamsayıları konsola yazdırın

//1yol
        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
//2yol  : wihile loop

        int i = 3;
        while (i < 7) {

            System.out.print(i + " ");
            i++;
        }
        System.out.println();


        //örnek 2: 23 ten on ikeye kadar çift tamsayıları konsola yazdırın


        int k = 23;
        while (k > 11) {
            if (k%2==0){

                System.out.print(k+" ");
            }
            k--;
        }
        System.out.println();
 //örnek 3. 6 dan 19 kadar tek sayıları consola yazdırın
        int s=6;
        while (s<20) {
            if (s % 2 != 0) {
                System.out.print(s + " ");

            }
           s++;
        }//while

    }//main
}//class
