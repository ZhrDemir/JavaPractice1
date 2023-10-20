package week_07;

public class P01_static {

    String isim = "Murat";
    int yas=43;

    static double kilo = 70.4;

    public static void main(String[] args) {

        System.out.println(kilo);

    }

    public void staticOlmayan(){
        System.out.println(kilo);
        System.out.println(yas);
        System.out.println(isim);
    }

}
