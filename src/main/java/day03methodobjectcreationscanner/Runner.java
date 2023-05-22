package day03methodobjectcreationscanner;

public class Runner {
                       //homework

    //icinde isim ve yas varibale lari ile teach methodu bulunan
    // bir Teacher objecti olusturun ve obje uzerinde bu ozellikleri kullanini

    public static void main(String[] args) {

        //object nasıl oluşturulur.
        //Constractor javada ojeleri oluşturmak için kulanılan bir özel methodtur.
        //new keyvord sıfırdan yeni bir object oluşturmak için kulanılır.

        //class ismi +object ismi   +   Assigment operatörü +  "new" keywordu+ Constructor

        Car myCar = new Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hereket();
        myCar.dur();

//*****************************************************
        Student alican = new Student();


        System.out.println("alican.name = " + alican.name);
        System.out.println("alican.adress = " + alican.adress);
        System.out.println("alican.grade = " + alican.grade);

        alican.study();
        alican.feed();


    }//main**********************************************************

    public static class Car {
        //variable oluşturma pasif özellikler
        public String model = "Tesla";
        public int fiyat = 20000;

        //method larını oluşturalım aktif özellikleri.
        //return taype void oldugun da method içinde return keyvordu kulanılmaz.
        public void hereket() {
            System.out.println("Tesla cok hızlı hareket eder..");
        }

        public void dur() {

            System.out.println("cok guvenli bir sekilde durur..");

        }


    }
}//clas

/*

//Object nasil olusturulur
//new keywordu sifirdan yeni bir object olusturmak icin kullanilir
//Constructor java da objeleri olusturmak icin kullanilan ozel bir methodtur
//Class ismi  +  Object ismi  +  Assignment Operator +  "new" keywordu  +  Constructor
    day03methodobjectcreationscanner.Runner.Car             myCar               =               new            day03methodobjectcreationscanner.Runner.Car();

        System.out.println("myCar.fiyat = " + myCar.fiyat);
        System.out.println("myCar.model = " + myCar.model);

        myCar.hareket();
        myCar.dur();

        Student aliCan = new Student();


        System.out.println("aliCan.name = " + aliCan.name);
        System.out.println("aliCan.adress = " + aliCan.adress);
        System.out.println("aliCan.grade = " + aliCan.grade);
        aliCan.study();
        aliCan.feed();
 */