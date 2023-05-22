package day04scannerwrapper;

import java.util.Scanner;

public class Scanner01 {

    public static <Sitring> void main(String[] args) {

//örnek: kulanıcıdan ilk ismini ve soy ismini alıpi ikisini aynı satırda ekrana yazdırınız?
//1.adım:scanner class dan bir obje oluştur.
        Scanner input = new Scanner(System.in);// bu sabit oluşturulmuş


        //2.adım.:kulanıcıya ne idtedigimize dair meja veriniz
        System.out.println("ilk isminizi giriniz");
//next methodu kulanıcıdan tek kelimelik string almak için kulanılır.
//3:adım: uygun method'u kullanarak kulanıcının verdigi datay'ımemory ye yerleştirecegiz.

        String firstName = input.next();

//**************************************************
        System.out.println("Soy isminizi giriniz..");
        String lastName = input.next();

        System.out.println(firstName +" "+ lastName);//+" "+ araya boşluk bırak mak için


    }//maiı


}//class
