package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {
        //Ex 1: Asagidaki sekli ekrana yazdıran kodu yazınız.

        /*       ****
                 ****
                 ****
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Satır sayisni giriniz");
        int satir = scan.nextInt();
        System.out.println("Sutun sayisini giriniz");
        int sutun = scan.nextInt();
        System.out.println("Bir karakter seçiniz");
        char c = scan.next().charAt(0);

        for (int i = 1; i < satir + 1; i++) {


            for (int k = 1; k < sutun + 1; k++) {
                System.out.print(c);
            }

            System.out.println();
        }

        //Ex: 2 Asagidaki sekli ekrana yazdıran kodu yazınız.
        /*
                  1
                  1 2
                  1 2 3
                  1 2 3 4
                  1 2 3 4 5
        */

        for (int i = 1 ; i<6 ; i++){

            for (int k = 1; k<=i; k++){
                System.out.print(k + " ");
            }

            System.out.println();

        }

    //EX 3: Asagidaki sekli cizen kodu yaziniz
            /*
                      * * * *
                      * * *
                      * *
                      *

             */


        for (int i = 1 ; i<5 ; i++){

            for (int k = 4; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }




    }

}
