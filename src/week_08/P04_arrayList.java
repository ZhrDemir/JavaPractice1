package week_08;

import java.util.ArrayList;
import java.util.List;

public class P04_arrayList {
    public static void main(String[] args) {

/*
        Verilen String bir listede istenmeyen harf iceren elementleri silip, kalan
        kismini list olarak bize donduren bir method olusturun
*/

        List<String> kelimeler = new ArrayList<>();

        kelimeler.add("elma");
        kelimeler.add("armut");
        kelimeler.add("ananas");
        kelimeler.add("muz");
        kelimeler.add("ayva");
        kelimeler.add("portakal");
        System.out.println("Listemiz : " + kelimeler);
        System.out.println(istenmeyenHarfiSil(kelimeler,"e"));


    }

    private static List<String>  istenmeyenHarfiSil(List<String> kelimeler, String istenmeyenHarf) {

    List<String> yeniList = new ArrayList<>();
        for (int i = 0; i < kelimeler.size() ; i++) {
            if (!kelimeler.get(i).contains(istenmeyenHarf)){
                yeniList.add(kelimeler.get(i));
            }
        }






        return yeniList ;


    }
}
