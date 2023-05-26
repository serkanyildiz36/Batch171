package TEKRAR_15_T;

import java.util.Scanner;

public class DoWhileloops_03_T {

    public static void main(String[] args) {
/*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */

        Scanner input = new Scanner(System.in);
        int counter=0;
        do {
            if (counter ==4) {
                System.out.println("hesabınız bloke olmuştur");
                break;
            }
            System.out.println("lütfen kulanıcı adınızı giriniz");
            String adı = input.next();

            System.out.println("lütfen parolanızı giriniz");
            String parola = input.next();

            if (adı.equals("admin")&&parola.equals("pwd123")) {

                System.out.println("Hesabınıza hoşgeldiniz");
                break;
            }
counter++;



        } while (true);


    }//main
}//class
