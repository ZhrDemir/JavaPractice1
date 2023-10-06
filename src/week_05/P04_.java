package week_05;

import java.util.Scanner;

public class P04_ {
    public static void main(String[] args) {

        /*
         * Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
         * döngüden çıkılsın
         *
         * Bugün hava oldukca güzel.-> 2
         *
         *
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle yazınız ");
        String cumle = scan.nextLine();

        int sayac = 0;

        for (int i = 0; i < cumle.length() ; i++) {
            if (cumle.toUpperCase().charAt(i)=='A'){
                sayac++;
            }
            if (cumle.toUpperCase().charAt(i)=='C'){
                break;
            }

        }
        System.out.println("Cümlenizde c harfine kadar "+ sayac + " tane a harfi vardır.");








    }
}
