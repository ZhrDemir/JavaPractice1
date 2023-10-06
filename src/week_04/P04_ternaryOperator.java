package week_04;

import java.util.Scanner;

public class P04_ternaryOperator {
    /*
Kullanicidan notunu alin 50 veya daha buyukse "Sinifi Gectin", 50’den
kucukse "Maalesef kaldin" yazdirin.
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen yıl sonu notunu giriniz: ");
        double not = scan.nextDouble();
        System.out.println(not>=50 ? "Sınıfı"+not+ " ile geçtiniz" : " Maalesef kaldınız");






    }
}
