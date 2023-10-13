package week_06;

public class whileLoop3 {
    public static void main(String[] args) {

/*
2 basamklı 7 ile bölünebilen pozitif tam sayıları while Loop ile yazdırınız.
 */
        int sayi = 10;
        String sayilar = "";
        while (sayi<100){
            if (sayi%7==0){
                sayilar += sayi + ", ";
                // System.out.print(sayi + " ");
            }
            sayi++;

        }
        System.out.println("İki basamaklı 7 ile bölünebilen sayılar : " + sayilar.substring(0,sayilar.length()-2));

    }
}
