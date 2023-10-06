package week_05;

import java.util.Scanner;

public class P01_forLoop {
    public static void main(String[] args) {

        // sayacı ritmik ilerleyen döngü işlemlerinde FORLOOP kullanılır
        // sayaç ritmik değilse WHİLE kullanılır
        //  döngüye en az bir kere girilecekse DO WHİLE kullanılır.




       /*
SORU:Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
dahil) 7 ila bolunebilen sayilari yazdirin.
 */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir pozitif tam sayı giriniz:");
        int sayi = scan.nextInt();

        System.out.println("Girdiğiniz sayıya kadar olan 7 ile bölünen sayılar : ");
        for (int i = 1; i <=sayi ; i++) {
            if (i %7 == 0){
                System.out.print(i + "-");
            }
        }
        System.err.println("");// KIRMIZI YAZDIRIR

        System.err.println("=========== İŞLEM TAMAMLANDI ============");

    }
}
