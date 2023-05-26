package TEKRAR_15_T;

public class whileLoops01_T {
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
            System.out.print(i);
        }
        System.out.println();
//2yol
        int i = 3;
        while (i < 7) {
            System.out.print(i);
            i++;
        }
        System.out.println();

        //örnek 2: 23 ten on ikeye kadar çift tamsayıları konsola yazdırın

        int k = 23;
        while (k > 11) {
            if (k % 2 == 0) {

                System.out.print(k + " ");
            }
            k--;
        }//while


        System.out.println();
        //örnek 3. 6 dan 19 kadar tek sayıları consola yazdırın

        int t = 6;
        while (t < 20) {

            if (t%2!=0){

                System.out.print(t+" ");
            }
            t++;
        }//while


    }//main
}//class
