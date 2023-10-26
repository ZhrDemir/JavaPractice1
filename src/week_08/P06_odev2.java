package week_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06_odev2 {
    public static void main(String[] args) {
        /*

        Soru-2:
Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
tamsayilari bir liste olarak bize donduren bir method olusturun.

         */

        bolenSayilar();







    }

    private static void bolenSayilar() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen pozitif tam sayi giriniz.");
        int sayi = scanner.nextInt();

        List<Integer> yeniList = new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0){
                yeniList.add(i);
            }
        }
        System.out.println(yeniList);
    }
}
