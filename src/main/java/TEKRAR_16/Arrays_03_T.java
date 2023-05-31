package TEKRAR_16;

import java.util.Arrays;

public class Arrays_03_T {
    public static void main(String[] args) {


        //Ornek 1: Integer bir array olusturunuz, icine 6 tane eleman yerlestiriniz.
        // Bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int ages[] = new int[6];
        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;

        System.out.println(Arrays.toString(ages));


        //1yol
        //sort() methodu array deki elemanlari kucukten buyuge dizer
        Arrays.sort(ages);

        System.out.println(Arrays.toString(ages));
        System.out.println(ages[0]+ages[ages.length-1]);


//2yol
    int minimum =ages[0];


        for (int w : ages  ) {
         minimum= Math.min(minimum,w);



        }





    }//main
}//class
