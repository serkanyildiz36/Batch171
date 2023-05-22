package TEKRAR_12;

public class NestedTernary_T {
    public static void main(String[] args) {

 /*    Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
               1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
               2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
 */

        //  c ? T: F ==>  c ? ( c ? T: F):( c ? T: F);
        int year = 1900;

        String result = year % 100 == 0 ? (year %400==0 ? "leap" : "Not Leap") : (year % 4 == 0 ? "leap" : "Not leap");
        System.out.println(result);

    }//main
}//class