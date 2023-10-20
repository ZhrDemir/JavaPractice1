package week_07;

public class P02_obje {

    public static void main(String[] args) {

        System.out.println(P01_static.kilo);
        // System.out.println(P01.yas);  static değil

    P01_static obj = new P01_static();
        System.out.println(obj.yas);
        System.out.println(obj.isim);
        System.out.println(P01_static.kilo);

    P01_static obj2= new P01_static();
        obj2.isim = "Zehra";
        obj2.yas = 45;
        System.out.println(obj2.isim);
        System.out.println(obj2.yas);

    }
}
