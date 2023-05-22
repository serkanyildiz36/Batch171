package day04scannerwrapper;

public class WrapperClass {
    public static void main(String[] args) {
//pirimitiv     :  char       - boolean    - byte   - short  -   int   - long   -   float   - double
//

        //wrapper class lar non- pirimitiv dir.o yüzden memoryde çok yer kaplarlar.

        //wrapper Class :  Character  -Boolean       -Byte  - Short    -Integer  -Long   -    Float -  Doıble


// n yazıp . koyarsanız hiç method göremessiniz pirimitivler method içermez
        int n = 12;

//m yazıp nokta kayarsanız bir çok method görebilirsiz çünkü wraper classlar method içerir
        Integer m = 12;

        byte p = 33;
        Byte r = 44;
//ör: short data taype inin minimum ve maximum degerlerini kod yazarak bulunuz
        short maxSohrt = Short.MAX_VALUE;
        System.out.println("maxSohrt = " + maxSohrt);


        short minSohort = Short.MIN_VALUE;
        System.out.println("minSohort = " + minSohort);


        //ör 2. int data taypının minimum bayte data degerinin toplamının bulunuz
        int intmin = Integer.MIN_VALUE;
        byte baytmaxValueb = Byte.MAX_VALUE;
        System.out.println(intmin + baytmaxValueb);
//ör 3:pirimitiv int i wrapper ıntegere a çeviriniz.
//Autoboxing: pirimitiv olan data taypı non-pirimitive çevirmenin adı.


        int num = 12;
        Integer wrapperNum = 12;
        //ör 4: wrapper Bayt i pirimitiv bayta çeviriniz
//Unboxing: wrapır non-pirimitivi ,pirimitive çeivrme adı


        Byte k = 12;
        System.out.println(k);
        byte pirimitivek = k;
        System.out.println(pirimitivek);

//ör 5:pirimitiv char i wrapper Character e çeviriniz
        char initial = 'm';
        Character initialWrapper = initial;

        //ör 6:Wrapper Booleani pirimitiv boolean a çevirniz
        Boolean isolwrapper = true;
        boolean isoldpirimitiv = isolwrapper;


    }//main

}//class
