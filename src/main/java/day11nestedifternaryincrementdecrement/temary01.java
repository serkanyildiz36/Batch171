package day11nestedifternaryincrementdecrement;
import java.util.Scanner;
public class temary01 {
    public static void main(String[] args) {
        //ternary statment :
        //örnek: sayı ondan küçük ise consola küçük yazdırın, degilse küçük degil yazdırın
int num= 12;

//---------------ternary çözümü--------------------
  //            conditon   ?     condinton true ise çalışır  :    condition falsi ie çalışır
  String sonuc= num<10      ?   "küçük"                       :   "küçük degil"               ;

        System.out.println(sonuc);

        //örnek2: sayı çift ise consola çift yazdırın, tek ise consola tek yazdırın

     //----------if else çözümü------------
         int k=13;
         if (k%2==0){
             System.out.println("çift");
         }else {
             System.out.println("tek");
         }
        //---------------ternary çözümü--------------------
      String result=  k%2==0 ? "çift"  : "tek";
        System.out.println(result);

//*************ör: sayı sıfırdan biyükse pozitif degilse ekrana pozitif degildir yazın***************************
        int a=5;
        System.out.println(  a>0  ? "pozitiftir"  :" pozitif degildir");

        String resultt= num>0 ? "pozitif" :"pozitif degildir";
        System.out.println(resultt);

        //örnek4:kulanıcıdan iki sayı alınız buyuk olmayan
        // kuçuk veya eşit olan sayıyı yazdırınız


        Scanner input =new Scanner(System.in);
        System.out.println("iki sayı giriniz..");

        double first =input.nextDouble();
        double second=input.nextDouble();
        //1. yol if else cözümü
        if (first<second){
            System.out.println(first);
        }else {
            System.out.println(second);
        }
//2 yol çüzümü-----------ternary çözümü--------------------

      double result2=  first<second  ?  first : second ;
        System.out.println(result2);

    }//main
}//class
