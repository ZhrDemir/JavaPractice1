package week_08_2;

import java.util.ArrayList;
import java.util.List;

public class P01 {
    public static void main(String[] args) {


    /*
Verilen String bir array'deki her bir elementi kontrol edip,
- Kelimenin uzunlugu cift sayi ise ilk yarisini
- Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
yeni bir listeye ekleyip yazdirin.
 */

        String[] isimler = {"ayça", "fikret", "esra", "azim", "beytullah"};
        List<String> yeniList = new ArrayList<>();

        for (String each:isimler
             ) {
            if (each.length()%2==0){
                yeniList.add(each.substring(0,each.length()/2));
            }else {
                yeniList.add(each.substring((each.length()-1)/2));
            }
        }
        System.out.println(yeniList);

    }







}
