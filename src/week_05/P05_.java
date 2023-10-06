package week_05;

import java.util.Scanner;

public class P05_ {
    public static void main(String[] args) {

        // kullanıcıdan 5 adet sayı isteyiniz
        // bu sayılardan 5 ile 10 arasındakiler hariç diğerlerinin toplamını yazın

        Scanner scan = new Scanner(System.in);


        int sayi = 0;
        int toplam=0;

        for (int i = 1; i <=5 ; i++) {
            System.out.print(i + " . sayıyı giriniz:  ");
            sayi = scan.nextInt();

            if (sayi >= 5 && sayi <= 10) {
                 continue;
            }
            toplam += sayi;
        }
        System.out.println("toplam = " + toplam);










    }
}
