package week_04;

import java.util.Scanner;

public class P08_stringManipulation {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı ve soyadınızı aralarında bir boşluk olacak şekilde girin");
            String name = scan.nextLine();
            String name2 = "TARIK YIGIT";

            if (name.equalsIgnoreCase(name2)){ // Doğru giriş yapıldı
                System.out.println("Doğru giriş yapıldı");
            }else System.out.println("Yanlış giriş yapıldı");

        if (name == name2){  // Yanlış giriş yapıldı
            System.out.println("Doğru giriş yapıldı");
        }else System.out.println("Yanlış giriş yapıldı");

// equals ile == arasındaki fark
 //       equals ıgirilen değerin referansına bakar.

        System.out.println("**************");

        String name3 = new String("Tarık Yıgıt");
        if (name.equals(name3)){ // yanlış giriş yapıldı
            System.out.println("Doğru giriş yapıldı");
        }else System.out.println("Yanlış giriş yapıldı");

        System.out.println("Girilen isim : " + name);
        System.out.println("Girilen ismin uzunluğu : " + name.length());// 1 den başlar saymaya space i de sayar.
        System.out.println(name.substring(4,7));
        System.out.println(name.substring(5));





    }
}
