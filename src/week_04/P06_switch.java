package week_04;

import java.util.Scanner;

public class P06_switch {
    public static void main(String[] args) {
// Kullanicidan 2 basamakli bir sayi alip, girilen sayiyi yazi ile yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki basamaklı sayı giriniz.");
        int sayi = scan.nextInt();

        if (sayi>=10 && sayi<100){
            int birlerbas = sayi%10;
            int onlarbas = sayi/10;

            switch (onlarbas) {
                case 1:
                    System.out.print("On");
                    break;
                case 2:
                    System.out.print("Yirmi");
                    break;
                case 3:
                    System.out.print("Otuz");
                    break;
                case 4:
                    System.out.print("Kırk");
                    break;
                case 5:
                    System.out.print("Elli");
                    break;
                case 6:
                    System.out.print("Altmış");
                    break;
                case 7:
                    System.out.print("Yetmiş");
                    break;
                case 8:
                    System.out.print("Seksen");
                    break;
                case 9:
                    System.out.print("Doksan");
                    break;

            } switch (birlerbas){

                case 1:
                    System.out.println("bir");
                    break;
                case 2:
                    System.out.println("iki");
                    break;
                case 3:
                    System.out.println("üç");
                    break;
                case 4:
                    System.out.println("dört");
                    break;
                case 5:
                    System.out.println("beş");
                    break;
                case 6:
                    System.out.println("altı");
                    break;
                case 7:
                    System.out.println("yedi");
                    break;
                case 8:
                    System.out.println("sekiz");
                    break;
                case 9:
                    System.out.println("dokuz");
                    break;
            }

        }





    }
}
