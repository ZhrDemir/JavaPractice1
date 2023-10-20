package week_06;


import java.util.Scanner;

public class WiseT127Market {
     /*
   *
  ====================WISE T127 MARKET===================================
ilk programa girildiginde bizi bir menu karsilasin bu secenekler
  1 ŞARKÜTERİ ÜRÜNLERİ
  2 MANAV ÜRÜNLERİ
  3 MARKET ÜRÜNLERİ
  secime gore ,
  4-urunleri listele ve
  5-fiyatlari gelsin
  6-sonunda fis yazdırsın
    */

    static Scanner scan = new Scanner(System.in);
    static String urunAdi ="";
    static int urunKodu;
    static double urunFiyati ;
    static int urunMiktari ;
    static double toplam ;
    static String sepet="" ;
    static boolean ekUrun =false;

    public static void main(String[] args) {

        girisEkrani();







    }

    private static void girisEkrani() {
        System.out.println("====================WISE T127 MARKET===================================");
        System.out.println("====================H O Ş G E L D İ N İ Z ==================================");
        System.out.println("--------------------------------MENÜ---------------------------");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz!");
        System.out.println("1-Manav Ürünleri \n2-Şarküteri Ürünleri \n3-Market Ürünleri\n4-Fiş Yazdırma \n5-Çıkış ");
        int secim = scan.nextInt();

        if (!(secim>=1 && secim<=5)){
            System.out.println("Yanlış bir giriş yaptınız. Tekrar deneyiniz!");
            girisEkrani();
        }else {
            switch (secim){
                case 1:
                     manav();
                     break;
                case 2:
                    sarkuteri();
                    break;
                case 3:
                    market();
                    break;
                case 4:
                    fisYazdir();
                    break;
                case 5:
                    cikis();


            }
        }

    }
    private static void manav() {
        System.out.println("-----------Manav Reyonuna Hoşgeldiniz-----------");
        System.out.println("Lütfen almak istediğiniz ürünün ürün kodunu (UK) giriniz!");
        System.out.println("Elma Fiyatı : 25₺ UK: 11 \nYerli Muz Fiyatı: 40₺ UK: 12 \nDomates Fiyatı: 20₺ UK: 13" +
                                   " \nÇilek Fiyatı:100₺ UK: 14 \nKarnabahar Fiyatı: 60₺ UK: 15 ");

        while (!ekUrun){
            urunKodu = scan.nextInt();
            if (urunKodu>=11 && urunKodu<=15){
                System.out.println("Kaç kg alacaksınız: ");
                urunMiktari = scan.nextInt();
                switch (urunKodu){
                    case 11:
                        urunAdi="Elma";
                        urunFiyati = 25;
                        break;
                    case 12:
                        urunAdi="Yerli Muz";
                        urunFiyati = 40;
                         break;
                    case 13:
                        urunAdi="Domates";
                        urunFiyati = 20;
                        break;
                    case 14:
                        urunAdi="Çilek";
                        urunFiyati = 100;
                        break;
                    case 15:
                        urunAdi="Karnabahar";
                        urunFiyati = 60;
                        break;

                }
                toplam = urunFiyati*urunMiktari;
                System.out.println(urunMiktari + "kg "+ urunAdi + " toplam fiyatı: "+ toplam + "₺ dir.");

                sepet += urunAdi + " " +urunMiktari+ "kg = "+ toplam + "₺ ";
                System.out.println("Toplam sepet tutarı : "+ sepet);
                System.out.println("Başka bir ürün eklemek isterseniz ürün kodunu girin.\n Ana Menüye dönmek için 0 tuşuna basınız.");
            } else if (urunKodu == 0) {
                girisEkrani();
            }  else {
                System.out.println("Yanlış bir giriş yaptınız. Tekrar deneyiniz!");

            }

        }


    }
    private static void sarkuteri() {
        System.out.println("----------Sarküteri Reyonuna Hoşgeldiniz------------");
        System.out.println("Lütfen almak istediğiniz ürünün ürün kodunu (UK) giriniz!");
        System.out.println("Kıyma Fiyatı : 250₺ UK: 21 \nPeynir Fiyatı: 400₺ UK: 22 \nSüt Fiyatı: 120₺ UK: 23" +
                " \nYumurta Fiyatı:90₺ UK: 24 \nYoğurt Fiyatı: 150₺ UK: 25 ");

        while (!ekUrun){
            urunKodu= scan.nextInt();
            if (urunKodu>=21 && urunKodu<=25){
                System.out.println("Ne kadar alacaksınız? ( kg / lt / koli )");
                urunMiktari = scan.nextInt();
                switch (urunKodu) {
                    case 21:
                        urunAdi = "Kıyma";
                        urunFiyati = 250;
                        System.out.println(urunMiktari + " kg/lt/koli " + urunAdi + " fiyatı : " + urunMiktari * urunFiyati + " ₺ dir.");
                        break;
                    case 22:
                        urunAdi = "Peynir";
                        urunFiyati = 400;
                        System.out.println(urunMiktari + " kg/lt/koli " + urunAdi + " fiyatı : " + urunMiktari * urunFiyati + " ₺ dir.");
                        break;
                    case 23:
                        urunAdi = "Süt";
                        urunFiyati = 120;
                        System.out.println(urunMiktari + " kg/lt/koli " + urunAdi + " fiyatı : " + urunMiktari * urunFiyati + " ₺ dir.");
                        break;
                    case 24:
                        urunAdi = "Yumurta";
                        urunFiyati = 90;
                        System.out.println(urunMiktari + " kg/lt/koli " + urunAdi + " fiyatı : " + urunMiktari * urunFiyati + " ₺ dir.");
                        break;
                    case 25:
                        urunAdi = "Yoğurt";
                        urunFiyati = 150;
                        System.out.println(urunMiktari + " kg/lt/koli " + urunAdi + " fiyatı : " + urunMiktari * urunFiyati + " ₺ dir.");
                        break;

                }
                   urunFiyati=urunMiktari*urunFiyati;
                   toplam+= urunFiyati;
                System.out.println("Oluşan Sepet Tutarı : "+toplam);

                sepet+= urunAdi + " fiyatı: "+urunFiyati+" ₺";
                System.out.println("Başka bir ürün almak isterseniz lütfen kodunu giriniz.\nAna menüye dönmek için 0'a basınız.");

            }else if (urunKodu==0){
                girisEkrani();
            }
        }
























    }
    private static void market() {
        System.out.println("----------Market Reyonuna Hoşgeldiniz------------");
    }

    private static void fisYazdir() {
        System.out.println("----------Fiş Yazdırılıyor------------");
    }

    private static void cikis() {
        System.out.println("----------Çıkış Yapılıyor------------");
        System.exit(0);
    }






}
