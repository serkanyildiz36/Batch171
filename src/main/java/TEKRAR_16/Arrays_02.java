package TEKRAR_16;

import java.util.Arrays;

public class Arrays_02 {

    public static void main(String[] args) {


        //Ornek 1 :  String array olusturun, icine 5 tane eleman ekleyin, ilk eleman ile
        // son elemanin icerdigi karakter sayilari toplamini ekrana yazdirin/

        String arr[] = new String[5];

        arr[0] = "math";
        arr[1] = "Science";
        arr[2] = "music";
        arr[3] = "English";
        arr[4] = "art";

        System.out.println(Arrays.toString(arr));
        System.out.println(+arr[0].length() + arr[arr.length - 1].length());


        //Ornek 2: String bir array olusturun, icine 5 tane eleman ekleyin,
        // tum elemanlarin icerdigi karakter sayilari toplamini ekrana yazdirin


        String brr[] = new String[5];
        brr[0] = "miami";
        brr[1] = "istanbul";
        brr[2] = "ankara";
        brr[3] = "oslo";
        brr[4] = "kars";

        //1yol
        int totalcahar = 0;
        for (int i = 0; i < brr.length; i++) {
            totalcahar = totalcahar + brr[i].length();
        }
        System.out.println(totalcahar);

        //*******************************************
        //2yol
        System.out.println(Arrays.toString(brr));
        System.out.println(brr[0].length() + brr[1].length() + brr[2].length() + brr[3].length() + brr[4].length());

        //3. yol for each loop (enhanced loop)
        //baslangic degeri, loopun calisma sarti ve increment/decrement kismini kendisi halleder.
        // for-each-loop "Array" lerde ve "collection" larda kullanilir
        /*
        kalibini olusturalim
        for(DataType  w: arr/collection ){
            calisacak kodlar
        }
        */

        int sum = 0;
        for (String w : brr) {
            sum = sum + w.length();
        }
        System.out.println(sum);


        //Ornek 3 Notlar adinda Integer bir array olusturunuz icine 6 tane not yerlestiniz ve not ortalamasini ekrana yazdiriniz

        int notlar[] = new int[6];
        notlar[0]=50;
        notlar[1]=70;
        notlar[2]=60;
        notlar[3]=40;
        notlar[4]=90;
        notlar[5]=80;

        System.out.println(Arrays.toString(notlar));//50 70 60 40 90 80
        int toplam=0;
        for (int w : notlar) {
                 toplam=toplam+w;
        }
        System.out.println(toplam/ notlar.length);


    }//main
}//class
