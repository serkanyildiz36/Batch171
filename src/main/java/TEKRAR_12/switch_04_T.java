package TEKRAR_12;
import java.util.Scanner;
public class switch_04_T {
    public static void main(String[] args) {

  /*             Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yazdiriniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen ülke ismi giriniz");
        String ülkeismi = input.nextLine();
        switch (ülkeismi.toLowerCase()) {

            case "america":
                System.out.println("us");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "turkey":
                System.out.println("TR");
                break;
            case "ındıa":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spaın":
                System.out.println("ES");
                break;
            case "bulgarıa":
                System.out.println("BG");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("girilen ülke tanumlı degil");


        }//switch
    }//main
}//class
