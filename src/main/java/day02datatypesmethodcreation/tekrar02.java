package day02datatypesmethodcreation;

import java.nio.channels.ScatteringByteChannel;

public class tekrar02 {


    public static void main(String[] args) {

//1: şehir ismi için bir varıble oluşturun önce ankara sonra izmir degerlerini atayıp ekrana yazdırın

        String cityName = "Ankara";
        System.out.println(cityName);
        cityName = "Izmır";
        System.out.println(cityName);

        // örnej 2; şehir plaka kodu için bir variable oluşturun önce 34 sonra 35 deger
        //   atauıp console yazdırınız
        byte plaka = 34;
        System.out.println(plaka);
        plaka = 36;
        System.out.println(plaka);
//örnek3:başarılı mı sorusu için bir variable oluşturun ve önce "false sonrada turue degerini atayıp ekrana yazdırın

        boolean başarılı = false;
        System.out.println(başarılı);

        başarılı = true;
        System.out.println(başarılı);

        //Ornek : Ulke ismi icin bir variable olusturun ve ekrana yazdirin

        String ulkeismi = "TURKİYE";
//****************************************************************************************        System.out.println(ulkeismi);

        //ör1: toplama işlemi yapan bir method oluşturun ve kulanınız
        int sonuc = toplamayap(3, 5);
        System.out.println(sonuc);
//**********************************************

        long carpmasonucu = carpmayap(5, 20);
        System.out.println(carpmasonucu);
//**********************************************

        int carpvetoplasonuc = carpvetopla(5, 7, 8);
        System.out.println(carpvetoplasonuc);
        //birde bu şekilde yapılır   System.out.println(carpvetopla(5, 7, 8););
//**************************************************************
        int d_alansonuc = d_alan(7, 8);

        System.out.println(d_alansonuc);
//***************************************************

      int d_cevre =  d_cevre(7,8);
        System.out.println(d_cevre );

    }//main


    public static int toplamayap(int a, int b) {
        return a + b;
    }

    //*********************************************
    //ör2:2 sayıyı çarpma işlemi yapan bir method oluşturun ve kulanın
    protected static long carpmayap(int a, int b) {
        return a * b;
    }

    //**********************************************
    //ör3: verilen 3 sayıdan ilk ikisini carpan ve ucuncu sayı ile toplayan methodu oluşturun ve kulanın.
    private static int carpvetopla(int a, int b, int c) {

        return a * b + c;
    }

    //1 Diktörgenin alanı hesaplayan methodu oluşturun ve kulanınız
    public static int d_alan(int a, int b) {
        return a * b;
    }
    // 2 çevresini de hesaplayıp methodu oluşturun ve kulanınız

    protected static int d_cevre(int a, int b) {
        return 2*(a+b);
    }


}//clas
