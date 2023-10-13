package week_05;

public class P07_tekrarsızString {
    public static void main(String[] args) {
        //verilen String'deki kullalanilan harfleri
       // kelimeyi ve tekrarsiz halini yazdirip
      // kelimede kullanilan farkli harf sayisini yazdırın


        String metin = "Have a nice day";
        String islenecekMetin = metin.replaceAll("\\W","");
        System.out.println(islenecekMetin);

        // \\W  harf dışındaki herşey
        // \\s space leri yok eder
        // replaceAll da

        String tekrarsizMetin = islenecekMetin.substring(0,1);// ilk harfi aldık H

        for (int i = 1; i <islenecekMetin.length() ; i++) {
            if (!tekrarsizMetin.contains(islenecekMetin.substring(i, i + 1))) {
                System.out.print(", " + islenecekMetin.substring(i, i + 1));
                tekrarsizMetin += islenecekMetin.substring(i, i + 1);



            }
        }

        System.out.println(" ");
        System.out.println("metin :" + metin);
        System.out.println("tekrarsız metin : "+ tekrarsizMetin);
        System.out.println("tekrarsiz harf sayısı :" + tekrarsizMetin.length());
    }
}
