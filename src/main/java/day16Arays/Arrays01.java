package day16Arays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a =13;
        //Bu yapinin icinde sadece bir tane data depolanabilir.
        //Ama biz code yazarken bir yapinin icinde coklu data depolama ihtiyaci hissederiz
        //Bir yapinin icinde coklu data depolayabilme icin java Array yapisini olusturmustur


        //Array nasil olusturulur?
        String stdNames [] = new String [5];

        //Arrayler console a nasil yazdirilir?
        //toString() methodu nu kullanmadan sadece array ismi ile yazdirirsaniz java o Array in adresini yazdirir
        System.out.println(Arrays.toString( stdNames));


        /*
        Arrayler diger collectionlardan cok cok daha hizlidir (superfast).
        Arrayler diger collectionlardan daha az memory kullanirlar
         */

        //Array e eleman ekleme nasil yapilir?
        stdNames[2]="Benna";
        stdNames[3]="Abdullah";
        stdNames[4]="Recep";
        stdNames[0]="Ekim";
        stdNames[1]="Ailana";

        System.out.println(Arrays.toString( stdNames));//[Ekim, Ailana, Benna, Abdullah, Recep]

        //Array'den specific bir elemani nasil aliriz?
        System.out.println(stdNames[3]);//Abdullah
        System.out.println(stdNames[4]);//Recep
        System.out.println(stdNames[0]);//Ekim

        //Ornek 1: Arraydeki her elemanin sonuna "!" isareti koyarak ekrana yazdiriniz.
        // length() string lerde method (parantezli), arraylerde ise parantezsiz yazilir(method degil)
        //  0       1       2       3       4
        //[Ekim, Ailana, Benna, Abdullah, Recep]


        for (int i = 0; i <stdNames.length ;            i++) {
            System.out.println(stdNames[i]+"*");

        }



    }//main
}//class

