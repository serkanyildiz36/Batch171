package day08stringmanipulationmemoryusageifstat;

public class StringManipulation01 {
    public static void main(String[] args) {
        //ör1: bir String im hç cahrecter içermediğini boş string oldıgunu kontrol eden kodu yazınız
        //1.yol length metodu ile çözüm
        String str = "";
        boolean result1 = str.length() == 0;
        System.out.println("String bos mu?" + result1);

        //2.yol
        //java bir methodu oluşturmuşsa o methodu kulanmak en iyisidir.
        boolean resul2 = str.isEmpty();
        System.out.println("is Empty?" + resul2);

        //ör 2:bir String in space hariç hiçbir cahraceter içermedigini kontrol eden kodu yazın

        String t = "     ";
//1.yol
        boolean result3 = t.replace("", "").length() == 0;
        System.out.println(result3);

//2yol:
        boolean result4 = t.replace(" ", "").isEmpty();
        System.out.println(result4);


        //3 yol:
        boolean result5 = t.isBlank();
        System.out.println(result5);
        //isBlank() methodu sadece space iceren String ler icin true verir, space disinda bir character var ise false verir
        //isBlank() methodu bos stringler icin de true verir
        //isBlank() methodu space + hic birsey icin true verir
        //isEmpty() methodu sadece hic birsey icin true verir.

        //ör 3: bir string de a - i- e cahracterleini ilk görünumlerinin indexleri toplamini ekrana yazdırınız

        //"java is easy to learn"==>  1+5+8=14
        //0123456789.....


        String r = "java is easy to learn";
        int idxA = r.indexOf('a');
        System.out.println(idxA);//1


        int idxI = r.indexOf('i');//5
        System.out.println(idxI);

        int inde = r.indexOf('e');
        System.out.println(inde);//8

        System.out.println(idxA + idxI + inde);//14

//ör4: bir stringde ki java kelimesini ilk olarak kacıncı index te kullanıldıgını gösteren kodu yazınız
        //"Ah java vah java sensiz olmuyor java"
        //indexof() "java" kulanımında siz java kelimesinin ilk görünümundeki ilk harfin yani j index ini almış olursunuz

        String u = "Ah java vah java sensiz olmuyor java ";
        int idxj = u.indexOf("java");
        System.out.println(idxj);//3

        int idxjava = u.indexOf("java");
        System.out.println(idxj);

       // ör5:  bir string de a - i- e cahracterleini son görünumlerinin indexleri toplamini ekrana yazdırınız
        String v = "java is easy to learn";

        int idxofa= v.lastIndexOf('a');
        System.out.println(idxofa);

      int idxofe=v.lastIndexOf('e');
        System.out.println(idxofe);

         int idxofi=v.lastIndexOf('i');
        System.out.println(idxofi);

        System.out.println(idxofa+idxofe+idxofi);

        //Note : lastIndexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 verir.

    }//main
}//clas
