package SORUBANKASI_01;

import java.util.Scanner;

public class örnek_01 {
    public static void main(String[] args) {

        long startTime = System.nanoTime(); // Başlangıç zamanını kaydet

        Scanner scan=new Scanner(System.in);

        System.out.println("hangi kahveyi istersiniz\n1.Türk kahvesi\n2.Filtre Kahve\n3.Espresso");

        String hangiKahve = scan.nextLine();

        hangiKahve = hangiKahve.toLowerCase().replaceAll("\\s", "") ;


        System.out.println("süt eklememmizi istermisiniz.(evet veya hayır olarak cevaplayınız");



        System.out.println("Süt eklememizi ister misiniz ? (Evet veya Hayır olarak cevaplayınız):   ");
        String sut = scan.nextLine();

        sut = sut.toLowerCase().replaceAll("\\s", "") ;





    }//main
}//class
