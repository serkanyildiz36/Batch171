package day05concatinationoperatorstypecasting;

public class TypeCasting {
    /*
    Numeric primitve data type larinin birbirine donusturulmesine "Type Casting " denir
    Numeric (sayisal) Data typelar  byte  -  short   -   int  -   long    -   float   -  double-
     */
    //Note 1: Kucuk data typelarini buyuk data typelarina cevirmeyi java otomatik olarak yapar
    //bu isleme "AutoWidening" (otomatik genisletme) denir.

        //Note 2: Buyuk data typelarini kucuk data typelarina cevirmek riskli bir istir, java bu riskli isi otomatik olarak yapmaz
        // bu islemi kod yazanlardan bekler.
        //Bu isleme "ExplicitNarrowing" (Aciktan Daraltma) denir

    public static void main(String[] args) {
        //byte data type ini int data type ina cevirinz
        byte age = 13;
        int ageInt = age;//AutoWidening

        //int data typeini short data type ina ceviriniz

        int weight=312;
        short weightShort = (short)weight;//Explicit Narrowing

//int data taypını float data taypına çeviriniz
        int population=7000;
        float populationFloat =population;
        System.out.println(population);//7000

        //double data taypının sohort data taype ina ceviriniz
        double number=12.99;
        System.out.println(number);
        short numbershort=(short)number;
          // exampıle
        short num=260;
        System.out.println(num);//260

        byte numByte=(byte)num;
        System.out.println(numByte);//4
//note
        //Donusum yaptigimiz sayi(260) donuseceginiz data type inin sinirlari disinda ise java kullandiginiz sayi ile mod islemi yapar ve mod isleminin
        //sonucu sizin yeni degeriniz olur





    }//main

}//class

