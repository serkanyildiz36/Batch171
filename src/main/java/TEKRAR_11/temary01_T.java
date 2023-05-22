package TEKRAR_11;

import java.util.Scanner;

public class temary01_T {
    public static void main(String[] args) {
        //ternary statment :
        //örnek: sayı ondan küçük ise consola küçük yazdırın, degilse küçük degil yazdırın

        int num=2;

        String sonuç=  num<10 ? "küçük "   :"küçük degil";
        System.out.println(sonuç);
//ör: sayı sıfırdan biyükse pozitif degilse ekrana pozitif degildir yazın
int k=13;
if (k%2==0){
    System.out.println("çift sayı");
}else {
    System.out.println("tek sayı");
}
//***************************** ternary çözüm***********************
        String result= k % 2 == 0 ? "çift"  :"tek";
        System.out.println(result);

        //ör: sayı sıfırdan biyükse pozitif degilse ekrana pozitif degildir yazın

        int k2 =36;
         String k2s=  k2>0 ? "pozitif" :"pozitif degildir";
        System.out.println(k2s);

           //örnek4:kulanıcıdan iki sayı alınız buyuk olmayan
            // kuçuk veya eşit olan sayıyı yazdırınız

        Scanner input =new Scanner(System.in);
        System.out.println("lütefen iki sayı giriniz");
       double ilksayı=input.nextDouble();
       double sonsayı=input.nextDouble();
//1yol
        if (ilksayı<sonsayı) {
            System.out.println(ilksayı);
        }else {
            System.out.println(sonsayı);
        }

//2yol ternary

    double sonuç1=  ilksayı<sonsayı   ?  ilksayı :  sonsayı ;
        System.out.println(sonuç1);


    }//main
}//class
