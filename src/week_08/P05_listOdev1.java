package week_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05_listOdev1 {
    public static void main(String[] args) {


/*
Soru-1:
Kullanicidan istedigi kadar isim alip, Q'ya bastiginda girdigi isimleri bize
liste olarak dondurecek bir method olusturun.


 */

        isimleriGetir();

    }

    private static void isimleriGetir() {

        boolean flag= true;
        List<String> isimler = new ArrayList<>();

        do {

            System.out.println("Lütfen isim girin.Q'ya basarak listeleyebilirsiniz.");
            Scanner scanner = new Scanner(System.in);
            String isim = scanner.nextLine();

            if (!isim.equalsIgnoreCase("q")) {
                isimler.add(isim);
            } else {
                System.out.println(isimler);
                flag = false;
            }
        }    while (flag) ;




    }


}
