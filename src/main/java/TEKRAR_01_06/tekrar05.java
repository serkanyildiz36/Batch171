package TEKRAR_01_06;

public class tekrar05 {
    public static void main(String[] args) {

        //primitive     : char    - boolean - byte - short - int   - long - float -double
        //Wrapper Class : Character - Boolean - Byte - Short -Integer- Long - Float -Double

        //Ornek 2: int data type nin minimum degeri ile byte data type inin maximum degerleri toplamini bulunuz.

        int intmin = Integer.MIN_VALUE;
        byte bytemax = Byte.MAX_VALUE;
        System.out.println(bytemax + intmin);////-2147483521

        //pirimitiv     :  char       - boolean    - byte   - short  -   int   - long   -   float   - double
        //wrapper class lar non- pirimitiv dir.o yüzden memoryde çok yer kaplarlar.

        //wrapper Class :  Character  -Boolean       -Byte  - Short    -Integer  -Long   -    Float -  Doıble


        //Ornek 3: Primitive int i Wrapper Integer a ceviriniz.(AutoBoxing)*****
        int num = 12;
        Integer Wrapernum = num;
        System.out.println("Wrapernum = " + Wrapernum);

        //kendi örnegim
        boolean b1 = true;
        Boolean hayır = b1;
        System.out.println("hayır = " + hayır);

        //Ornek 4: Wrapper Byte i primitive byte a ceviriniz(Unboxing)

        Byte k = 12;
        System.out.println(k);
        int pirimitivk = k;
        System.out.println(pirimitivk);

        //Ornek 5: Primitive char i Wrapper Character e ceviriniz(Autoboxing)
        char c = 's';
        Character wraperc = 'c';
        System.out.println(wraperc);

        //Ornek 6: Wrapper Boolean i primitive boolean a ceviriniz(Unboxing)
        Boolean wrapperb = true;
        boolean pirimitivb = wrapperb;
        System.out.println(pirimitivb);
//**************** day05tekrar***************************
        //Ornek 1: Bir string ve iki integer variable olusturun.
        // String degeri ile Integer larin toplamini console a yazdiirin
        String s = "elma";
        int a = 10;
        int b = 11;
        System.out.println(a + b + s);//birleştirme(Concatination) denir sitring bir işlem ile sayısıal bir işlemin birleştirilmesi.

// ör 2:   size String olarak verilen iki fiyatın toplamını ekrana yazdırınız

        String shirt = "2300";
        String shos = "5200";
        int fiyattoplamı = Integer.valueOf(shirt) + Integer.valueOf(shos);
        System.out.println(fiyattoplamı);

//ör 3:size String olarak verilen iki fiyatın toplamını ekrana yazdırınız
/*
        String tv = "$1100";
        String radıo = "$300";
        System.out.println(tv + radıo);

        int toplam = Integer.valueOf(tv) + Integer.valueOf(radıo);
        System.out.println(toplam);
        //valueOf() methoud kullanilirken sadece rakam olan karakterler kullanilmalidir.
*/
        boolean first = 3 < 5;
        System.out.println(first);
        boolean second = 2 + 3 != 5;
        System.out.println(second);
        boolean thrid = 2 + 3 * 5 >= 19;
        System.out.println(first + "-" + second + "-" + thrid);//true false false

        System.out.println(first && second);
        System.out.println(first || second || thrid);

        int inta = 'k';
        System.out.println(inta);

        int unlem = '!';
        System.out.println(unlem);
        //Herhangi bir character'in ASCII degerini bulmak icin o karakteri "int" data type inda bir variable icine koyunuz
        char c1 = 'k';
        char c2 = '?';
        System.out.println(c1 + c2);

        int cc = '?';
        System.out.println(cc);

        int c11 = 'k';
        System.out.println(c11);
//*****************************************************************

        //Numeric primitve data type larinin birbirine donusturulmesine "Type Casting " denir
        //Numeric (sayisal) Data typelar  byte  -  short   -   int  -   long    -   float   -  double-
        //Note 1: Kucuk data typelarini buyuk data typelarina cevirmeyi java otomatik olarak yapar
        //bu isleme "AutoWidening" (otomatik genisletme) denir.
        //Note 2: Buyuk data typelarini kucuk data typelarina cevirmek riskli bir istir, java bu riskli isi otomatik olarak yapmaz
        // bu islemi kod yazanlardan bekler.
        //Bu isleme "ExplicitNarrowing" (Aciktan Daraltma) denir

        //byte data type ini int data type ina cevirinz
        byte age = 13;
        int ageint = age;//autowidening

        //int data typeini short data type ina ceviriniz
        int weight = 312;
        short weghtshort = (short) weight;//explicit narrowing




    }//main
}//class

