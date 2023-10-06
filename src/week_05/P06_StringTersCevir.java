package week_05;

import java.util.Scanner;

public class P06_StringTersCevir {
    public static void main(String[] args) {
/*
Kullanicidan bir String isteyin ve String'i tersine cevirip kaydedin ve ters metni yazdırın.
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz");
        String metin = scanner.nextLine();
        String tersmetin = "";

        for (int i = metin.length() ; i >0 ; i--) {
        tersmetin += metin.substring(i-1,i);

        }
          metin = tersmetin;
        System.out.println(metin);
    }
}
