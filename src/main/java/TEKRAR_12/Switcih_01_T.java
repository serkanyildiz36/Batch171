package TEKRAR_12;

public class Switcih_01_T {
    public static void main(String[] args) {
        //1. yol
        String dayname = "tuesday";

        if (dayname.equalsIgnoreCase("sunday")) {

            System.out.println(1);
        } else if (dayname.equalsIgnoreCase("monday")) {
            System.out.println(2);
        } else if (dayname.equalsIgnoreCase("tuesday")) {
            System.out.println(3);
        } else if (dayname.equalsIgnoreCase("wednesday")) {
            System.out.println(4);
        } else if (dayname.equalsIgnoreCase("tuhursday")) {
            System.out.println(5);
        } else if (dayname.equalsIgnoreCase("firiday")) {
            System.out.println(6);
        } else if (dayname.equalsIgnoreCase("saturday")) {
            System.out.println(7);
        } else {
            System.out.println("lütfen geçerli gün griniz");
        }

        //2.yol:

        switch (dayname.toLowerCase()) {
            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wendeday":
                System.out.println(4);
                break;
            case "tuhursday":
                System.out.println(5);
                break;
            case "firiday":
                System.out.println(6);
                break;

            case "saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("lütfen grçerli gün ismi yazınız...");

        }


    }//main
}//class
