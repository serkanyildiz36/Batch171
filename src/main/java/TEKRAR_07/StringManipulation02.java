package TEKRAR_07;

public class StringManipulation02 {
    public static void main(String[] args) {
        String s = "learn Java earn money";
        //ör1: s stringinin money ile bitip bitmedigini kontırol ediniz

        boolean isend = s.endsWith("money");
        System.out.println(isend);

        //ör2:s stringinin money kelimesini dolar kelimesine çeviriniz
        String s1 = s.replace("money", "dollar");
        System.out.println(s1);

        //ör3:s stringinin earn kelimesini win kelimesine çeviriniz
        String s2 = s.replace("earn", "win");
        System.out.println(s2);

        //ör4:s stringinin a harflerini "*" a çeviriniz
        String s3 = s.replace('a', '*');
        System.out.println(s3);

        //ör5:s stringin deki n harflerini üç tane "xxx" çeviriniz
        String s4 = s.replace("n", "xxx");
        System.out.println(s4);

        //ör6:s stringin deki e harflerini siliniz
     String s5=s.replace("e","");// bir karekteri silmek için çift tırnak kullanılır
        System.out.println(s5);

        String t =  "Ali 13 yaşındadır!";
        //ör7:"t" stringindeki  tum rakamları "*" ceviriniz.

              String t1=t.replaceAll("[0-9]","*");
        System.out.println(t1);






    }//main
}//class
