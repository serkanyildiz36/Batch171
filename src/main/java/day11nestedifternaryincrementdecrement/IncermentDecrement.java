package day11nestedifternaryincrementdecrement;

public class IncermentDecrement {
    public static void main(String[] args) {
        int a = 5;
        System.out.println(a);
        a = a + 2;

        System.out.println(a);
        a += 2;
        System.out.println(a);

        //Ornek : Bir tane integer variable olusturun ve onu iki sekilde 5 artirin.

        int b = 10;
        System.out.println(b);
        b = b + 5;
        System.out.println(b);
        b += 5;
        System.out.println(b);

        //Decrement1

        int c = 8;
        System.out.println(c);
        c = c - 3;

        System.out.println(c);
        c -= 3;
        System.out.println(c);

        //Increment 2

        int d = 6;
        System.out.println(d);//6
        d = d * 2;
        System.out.println(d);//12
        d *= 2;
        System.out.println(d);//24

        //Decrement 2

        int e = 24;
        System.out.println(e);
        e = e / 2;
        System.out.println(e);
        e /= 2;
        System.out.println(e);

        //"1" ile increment artırma

        int f = 12;
        //f=f+1; fazla kulanma*****
        //f+=1;    fazla kulanma   ******
        f++;


        //"1" ile decrement azltma

        int h = 10;
        // h=h-1;
        // h-=1;
        h--;

        //"post-increment" ve "pre-increment"


        int i =10;
         int k= i++;//post incerement sonra deger artırma
        System.out.println(i);// i satırı sonunda artırıldıgı için 11 olur
        System.out.println(k);// i artırılmadan k sepetine konuldugu için 10 olur


         int m =15;
        System.out.println(m);

         int n=++m;//pre incerement
        System.out.println(n);


        //Ornek
        int p = 17;
        int r = p--;
        System.out.println(p);
        System.out.println(r);


        int s = 20;
        int t = --s;
        System.out.println(s);//19
        System.out.println(t);//19

 /*
   1)Increment artirmak demektir, decrement azaltmak demektir.
   2) Increment toplama ve carpma ile, decrement cikarma ve bolme ile yapilabilir
                a)i=i+5;
                b)i+=5;
                c)eger 1 ile artirma ==> i++
                note:bu c sikki sadece 1 artirmak icin kullanilir
                a)i=i-5;
                b)i-=5;
                c)eger 1 ile azaltma ==> i--
                note:bu c sikki sadece 1 azaltmak icin kullanilir
         */





    }//main
}//class
