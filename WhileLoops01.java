package day12loops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        //3 ten 10 a kadar tam sayıları aynı satirda ekrana yazdıran kodu yazdırınız

        int i =3;

        while (i<11){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
        //Ex 2: 17 den 4 e kadar çift sayıları ekrana aynı satırda yazdıran kodu yazınız

        int s = 17;

        while (s>3){
            if (s%2==0){
                System.out.print(s + " ");
            }

            s--;

        }
        System.out.println();
        //13 ten 67 ye kadar olan sayıların toplamını veren kodu yazınız

        int sayi = 13;
        int sum = 0;

        while (sayi<68){

            sum = sum + sayi;
            sayi++;

        }System.out.println(sum);

        //Ex 4: Size verilen bir tam sayının rakamları toplamını ekrana yazdıran kodu yazınız.

        int num = 123456789;
        //num = Math.abs(num); negatif sayı için
        int rakamTop = 0;

        while (num>0){
            rakamTop = rakamTop + num%10;
            num = num/10;
        }System.out.print(rakamTop);

        //Ex 5: kullanıcadan aldığınız bir sayının çarpım tablosunu ekrana yazdırınız.

        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("Carpim Tablosu Icin Bir Sayı Giriniz");
        int x = scan.nextInt();
        int n = 1;

        while (n<11){

            System.out.println(x + "x" + n + "=" + (x*n));
            n++;
        }









    }
}
