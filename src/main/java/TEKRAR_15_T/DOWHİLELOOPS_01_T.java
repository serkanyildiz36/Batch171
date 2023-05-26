package TEKRAR_15_T;

public class DOWHİLELOOPS_01_T {

    public static void main(String[] args) {

/*while loop kalibi
baslangic degeri

 while(loop calisma kurali ){

    calisacak kodlar

    artirma/azaltma
 }*/

/*
do while loop kalibi
baslangic degeri
        do{
            calisacak kodlar
            artirma/azaltma
        }while(loop calisma kurali);
*/
//örnek1: 5 dahil den 3 dahil e kadar
// tüm tamsayuıları consola yazdırın

        int i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i > 2);

//2yol
        int a = 5;
        while (a < 2) {

            System.out.println(a);

            a--;

        }


    }//main
}//CLASS
