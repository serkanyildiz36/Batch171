package TEKRAR_13;

public class TEKRAR_03_T {

    public static void main(String[] args) {

        //Ornek 1 : Verilen bir string de kucuk harfleri console a yazmayiniz
        //"Pwd12?Ab" ==> P12?A
        String s = "Pwd12?Ab";//bA?21
        for (int i = s.length() - 1; i >= 0; i--) {

            if (s.charAt(i) == 'd') {//küçük harfleri seçtim
                break;
            }
            System.out.print(s.charAt(i));
        }


        String s1 = "Pwd12?Ab";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z') {// kucuk harfleri seçtim
                continue;
            } else {
                System.out.print(ch);
            }

        }

        //note :Break ile continue arasindaki fark nedir?
        //"break" ile switch parantezinin disina cikmak icin ve loop u kirmak icin kullanilir
        //continue ise loop yaparken bazi istenen elemanlari isleme sokmamak icin kullanilir
        //continue keywordu bir loop taki gecerli iteration i sonlandirip sizi increment/decrement parta goturur





    }//main
}//CLASS
