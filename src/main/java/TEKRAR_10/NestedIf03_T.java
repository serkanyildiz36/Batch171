package TEKRAR_10;

import java.util.Scanner;

public class NestedIf03_T {
    public static void main(String[] args) {
  /*
                    Password'un ilk harfi buyuk harf ise
                        'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                        Adana ==> Gecerli
                    Passwordun ilk harfi kucuk harf ise
                        'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                        zehirli ==> Gecerli         */
       /*
                    Password'un ilk harfi buyuk harf ise
                        'A' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                        Adana ==> Gecerli
                    Passwordun ilk harfi kucuk harf ise
                        'z' olursa "gecerli password" yazdirin degilse "gecersiz password" yazdirin
                        zehirli ==> Gecerli         */

        Scanner input = new Scanner(System.in);
        System.out.println("passwordunuzu giriniz");
        String pwd = input.nextLine();

        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {
            if (pwd.charAt(0) == 'A'){
                System.out.println("geçerli password");
            }else{
                System.out.println("geçersiz password çünkü buyuk harf A degil");
            }

        } else if (pwd.charAt(0) >= 'a' && pwd.charAt(0) <= 'z') {



        if (pwd.charAt(0) == 'z'){
            System.out.println("geçerli password");
        }else{
            System.out.println("geçersiz password çünkü buyuk harf z degil");
        }

        }
        else{
            System.out.println("ilk karekter harf olmalıdır");
        }


    }//main
}//class