package day02datatypesmethodcreation;

public class MethodCreation01 {

/*
 Java da method nasil olusturulur?

    1) main method un disinda classin icinde olusturulur
    2) Access Modifier + return type + method ismi + () + {}

    Olusturulun method lar nasil kullanilir?
    1)Methodu olusturmak methodu calistirmak icin yeterli degildir, Kullanilmak istenen
      method main method unicinden kullanilir
    2) method un ismi + () yazin
        varsa islem yapacaginiz datalari parantezin icine koyun
        bu islem method call (method cagirma) olarak adlandirilir
    3) methodun ismi + parametreler ===> method signature

 */

    public static void main(String[] args) {

        int sonuc = toplamaYap(3, 5);
        System.out.println(sonuc);

//*****************************************************
      long carpmaSonucu = multiply(4,5);
        System.out.println(carpmaSonucu);

//****************************************************************
        System.out.println(firstTwoMultplyThirdAdd(2,3,4));
//***************************************************************


    }//main

//*****************************************************************************************

    //return demek metodhon çagrıldıgı yere bu degeri return et demek
    //ör1: toplama işlemi yapan bir method oluşturun ve kulanınız

    public static int toplamaYap(int a,int b ){
        return a + b;

    }
//***************************************************************
    //ör2:2 sayıyı çarpma işlemi yapan bir method oluşturun ve kulanın

    protected static long multiply(int a, int b){

        return 25*45;

    }
//*****************************************************************
//ör3: verilen 3 sayıdan ilk ikisini carpan ve ucuncu sayı ile toplayan methodu oluşturun ve kulanın.

private static int firstTwoMultplyThirdAdd(int a,int b,int c){

      return a*b+c;

}
//******************************************************************

/*
1 Diktörgenin alanı hesaplayan methodu oluşturun ve kulanınız
2 çevresini de hesaplayıp methodu oluşturun ve kulanınız
 */



}//clas
