package day15;

public class DoWhileLoop01 {
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


        int a = 5;
        do{
            System.out.println(a);
            a--;
        }while (a>2);

//1 yol wihle loop


        int i =1;
        while (i<1){

            System.out.println("sen bir while loopsun...");
            i++;
        }



        //2yol do while loop
        int k=1;
        do {
            System.out.println("sen bir while loopsun...");
            k++;
        }while (k<1);











    }//main
}//class
