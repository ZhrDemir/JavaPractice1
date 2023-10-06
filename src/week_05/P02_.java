package week_05;

import java.util.Scanner;

public class P02_ {
    public static void main(String[] args) {
/*
Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin
 */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen başlangıç değeri için pozitif tam sayı giriniz:");
        int basSayi = scan.nextInt();

        System.out.println("Lütfen bitiş değeri için pozitif tam sayı giriniz:");
        int bitisSayi = scan.nextInt();
        int toplam = 0;

        if (basSayi>bitisSayi) {
            System.out.println("===== Başlangıç değeri bitiş değerinden büyük olamaz ====");
        }else {
            for (int i = basSayi; i <=bitisSayi ; i++) {
                       toplam+=i;

        }
        }System.out.println("Girdiğiniz aralıktaki sayıların toplamı : " + toplam);


    }
}
