package TEKRAR_01_06;

public class tekrar06 {
    public static void main(String[] args) {
//*********************TEKRAR07>>>>>(10.05.2023)*************************
 /*
    Numeric primitve data type larinin birbirine donusturulmesine "Type Casting " denir
    Numeric (sayisal) Data typelar   byte  <  short  <   int  <  long < float <  double
     */
        int kg = 700;
        byte kgbyt = (byte) kg;
        System.out.println(kgbyt);

        //int data taypını float data taypına çeviriniz
        int topluluk = 7000;
        System.out.println(topluluk);

        float toplulukf = topluluk;
        System.out.println(topluluk);

        //double data taypının sohort data taype ina ceviriniz
        double number = 12.99;
        System.out.println(number);

        short yshrtd = (short) number;
        System.out.println(yshrtd);

        short num = 260;
        System.out.println(num);//260

        byte numbyt = (byte) num;
        System.out.println(numbyt);
//***************SwapValues **************************
        //Swap : Yer degistirmek 1.kap Patates 2. kap Domates ==> swap => 1.Kap Domates  2. kap Patates
        int a = 12;
        int b = 5;
        int temp = 0;//temp boş kavanoz
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
//2yol
        int elma = 12;
        int armut = 5;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);
        elma = elma + armut;
        armut = elma - armut;
        elma = elma - armut;
        System.out.println("elma = " + elma);
        System.out.println("armut = " + armut);
//********************SitringManipulations01**************
        //String bir non-pirimitiv bir data tayp dır ve aynı zamanda bir classdır.
        String s = "Java is easy";
        //ör1:"s"Stringindeki tüm cahareterleri büyük harf yapınız
        String sUpper = s.toUpperCase();//büyük harfe dönüüştür=toUpperCase
        System.out.println(sUpper);

        //Ornek2:"s" Stringindeki tum characterleri kucuk harf yapiniz
        String slover = s.toLowerCase();
        System.out.println(slover);///toLowerCase=küçük harfe dönüştür

        //Ornek3: "s" Stringindeki ilk characteri aliniz
        char ilkhrf = s.charAt(0);
        System.out.println(ilkhrf);

        //Ornek4: "s" stringindeki bastan ikinci ve sondan ikinci characteri aliniz ve ekrana yazdiriniz
        char ikihrf = s.charAt(1);
        System.out.println(ikihrf);
        char soniki = s.charAt(10);
        System.out.println(soniki);
        System.out.println("" + ilkhrf + soniki + ikihrf);

        //Ornek 5: "s" string inde kullanilan character sayisini bulunuz
        int slength = s.length();
        System.out.println(slength);

        //ör6:"s" string indeki ilk 4 cahreteri alınız
        // s.substring(0,4); bu kulanımda ilk indeks dahildir ikinci indeks hariçtir
        String sub1 = s.substring(0, 4);
        System.out.println(sub1);

        //ör7:"s" string indeki is kelimesi alınız.
        String sub2 = s.substring(5, 7);
        System.out.println(sub2);

        //ör8:"s" Stringindeki easy kelimesi
        String sub3 = s.substring(8, 12);
        System.out.println(sub3);
        //ikinci yol
        String sub33 = s.substring(5);
        System.out.println(sub33);

        //ornek9 :"s" Stringinde "money kelimesini var olup olmadıgını kontırol ediniz
        boolean varmı = s.contains("money");
        System.out.println(varmı);//false

        boolean varmı1 = s.contains("Java");
        System.out.println(varmı1);//ture

        boolean varmı2 = s.contains("");
        System.out.println(varmı2);

        //ör10:"s" Stringinde belli bir harfle başlayıp başlaamadıgını kontırol ediniz
       boolean isstart=  s.startsWith("J");
        System.out.println(isstart);

        //ör11:"s" Stringinde 5 .index dahil olmak üzere bu indezten itibaren i
        // karekteri ile başlayıp başlamadıgını kontırol ediniz

            boolean strtwith=   s.startsWith("i",4);//"i"=5 true
        System.out.println(strtwith);

    }//main
}//class
