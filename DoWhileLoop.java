package day12loops;

public class DoWhileLoop {
    public static void main(String[] args) {

        //while loop için "zero execution" mümkündür

        int i = 1;
        while (i<1){
            System.out.println("While Loop");
            i++;
        }

        //do-while loop kullandığımızda loop body içindeki kod en az bir kere çalışır.
        // Yani do-while loop için  "zero execution" mümkün değildir.
        int k = 1;
        do {
            System.out.println("Do While");
            k++;
        }while (k<1);

        //Ex 1 : Bir ondalik sayinin ondalık kısmındaki rakamlarının toplamını bulunuz.

        double sayi = 24.5673;
        String str = String.valueOf(sayi);
        //regex için nokta kullınınca "\\." olarak kullanınız.
        String decimalPart = str.split("\\.")[1];
        System.out.println(decimalPart);

        int num =Integer.valueOf(decimalPart);
        int sum = 0;
        do {
            sum = sum + num%10;

            num = num/10;

        }while (num >0);

        System.out.println(sum);



























    }
}


