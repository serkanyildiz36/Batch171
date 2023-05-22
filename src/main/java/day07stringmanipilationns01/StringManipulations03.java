package day07stringmanipilationns01;

public class StringManipulations03 {

    public static void main(String[] args) {

//Ornek 1: Bir string in bas ve sonunda space character i varsa siliniz
        String s = "     Ali Can    ";
        //trim() method'u bir string in bas ve sonundaki space characterlerini siler, aradaki space'lere dokunmaz
     String sTrimmed=   s.trim();
        System.out.println(sTrimmed);

//ör2:aşagıdaki fiyatları verilen örünlerin toplam fiyatlarını bulunuz
        //string tv ="$456.99"; String laptop="$875.99"==>456.99+1332.98

        String tv ="$456.99";
        String laptop="$875.99";

        String tv2= tv.replace("$","");
        System.out.println(tv2);

        String laptop2=laptop.replace("$","");
        System.out.println(laptop2);

  Double totalpirince =  Double.valueOf(tv2)+Double.valueOf(laptop2);

//ör3:verilen ismi ilk isminin ilk harfini ve soyisminin ilk hafini yazdırınız
        //"Ali Can"==> AC
        String name = "  aLİ cAN";

        char first = name.trim().toUpperCase().charAt(0);
        System.out.println(first);//A

        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);//split kesmek anlamında kelimeyi ikiye biler
        System.out.println("" + first + last);//AC






    }//main
}//class
