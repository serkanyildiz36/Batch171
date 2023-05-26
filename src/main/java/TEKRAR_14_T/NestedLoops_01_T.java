package TEKRAR_14_T;

public class NestedLoops_01_T {


    public static void main(String[] args) {

           /*
            Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....       */


        for ( int i=1  ;   i<5  ;i++   ) {

            System.out.println("week : "+i);

            for (int k=1; k<3   ;k++) {
                System.out.println("day :"+k);
            }

        }


    }//main
}//class
