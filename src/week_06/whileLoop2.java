package week_06;

import java.util.Scanner;

public class whileLoop2 {
    public static void main(String[] args) {

        /*
          sayinin sayı degerlerinin toplamini while loop ile yapinız.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir tam sayı giriniz ");
        int sayi = scanner.nextInt();
        int toplam = 0;

        while (sayi !=0 ){
            toplam += sayi%10;
            sayi /= 10;
        }
        System.out.println("Sayımızın sayı değerleri toplamı = " + toplam);









    }
}
