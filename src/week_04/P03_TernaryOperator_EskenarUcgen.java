package week_04;

import java.util.Scanner;

public class P03_TernaryOperator_EskenarUcgen {
    public static void main(String[] args) {

        /*
1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
"Eskenar ucgen" yazdirin, degilse "Eskenar degil" yazdirin.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen incelediğiniz üçgenin kenar uzunluklarını giriniz");
        System.out.print("1.kenar: ");
        double kenar1 = scan.nextDouble();
        System.out.print("2.kenar: ");
        double kenar2 = scan.nextDouble();
        System.out.print("3.kenar: ");
        double kenar3 = scan.nextDouble();

        // ? ---> ise :---> değilse

        System.out.println(kenar1>0 && kenar2>0 && kenar3>0 ? kenar1==kenar2 && kenar1==kenar3 ? "Üçgen EŞKENAR ÜÇGEN dir"
                :"Üçgen eşkenar üçgen değildir"
                : "Yanlış değer girdiniz");






    }
}
