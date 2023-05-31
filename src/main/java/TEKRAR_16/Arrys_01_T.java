package TEKRAR_16;

import java.util.Arrays;

public class Arrys_01_T {
    public static void main(String[] args) {

        int a = 13;
        //Bu yapinin icinde sadece bir tane data depolanabilir.
        //Ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        //Bir yapinin icinde coklu data depolayabilme icin java Array yapisini olusturmustur

        // array nasıl oluşturulur?
        String stdNames[] = new String[5];
        System.out.println(Arrays.toString(stdNames));

        //Arrayler console a nasil yazdirilir?
        //toString() methodu nu kullanmadan sadece array ismi ile yazdirirsaniz java o Array in adresini yazdirir
        System.out.println(Arrays.toString(stdNames));

           /*
        Arrayler diger collectionlardan cok cok daha hizlidir (superfast).
        Arrayler diger collectionlardan daha az memory kullanirlar
         */
        //array e elaman nasıl eklenir


        stdNames[2] = "Benna";
        stdNames[3] = "abdullah";
        stdNames[4] = "recep";
        stdNames[0] = "ekim";
        stdNames[1] = "serkan";
        System.out.println(Arrays.toString(stdNames));

//Arra' da specific bir eleman nasıl alınır?

        System.out.println(stdNames[3]);
        System.out.println(stdNames[4]);
        System.out.println(stdNames[2]);

//örnek 1. Arraydeki her elemaın sonuna "!" işareti koyarak ekrana yazdırınız.
//  lenght stringlerde meyhod parantezli Arraylarde ise parantezsiz çalışır.
        for (int i = 0; i <stdNames.length ; i++) {

            System.out.println(stdNames[i]+"!");

        }//for













    }//main
}//class
