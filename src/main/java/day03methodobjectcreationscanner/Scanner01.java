package day03methodobjectcreationscanner;


import java.util.Scanner;
//java nın util kütüphanesinde sccanner class da import edildi.import alıp getirme

public class Scanner01 {

    //kulanıcıdan data alıp kodlarımızda kullanmayı sağlar.scanner class
    public static void main(String[] args) {

        //1.adım:scanner class tan object oluştur.
        Scanner input = new Scanner(System.in);
        //2.adım: kulanlanıcıya ne istediginizi dair mesaj veriniz

        System.out.println("lütfen yaşınızı giriniz");
//3.adım:uygun methodu kulanarak kulanıcının verdigi datayı memory e yerleştiriniz.
      Byte age=  input.nextByte();
        System.out.println("age = " + age);


    }//main****************************************************************


}//class*************************************************
