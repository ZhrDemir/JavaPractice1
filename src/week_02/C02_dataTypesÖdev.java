package week_02;

public class C02_dataTypesÖdev {
    public static void main(String[] args) {

         /*
    byte:Sadece tam sayı değerler alır. 8bit
    short: Sadece tam sayı değerler alır. 16bit
    int: sadece tam sayı değerler alır. 32bit
    long: sadece tam sayı değerler alıyor. 64 bit
    float: ondalıklı sayıları tanımlarız. (sonuna f koyarız)
    double: ondalıklı sayıları tanımlar.
    byte<short<int<long<float<double
    boolean: mantıksal ifadeler. false ve true
    char: tek karakter alır. ASCII karakterler kullanılır. diğerleri tek tırnak içinde yazılır.
     */
        byte b1 = Byte.MAX_VALUE;
        System.out.println("BYTE Maks. = " + b1);
        byte b2 = Byte.MIN_VALUE;
        System.out.println("b2 = " + b2);

        short sh1 = Short.MAX_VALUE;
        System.out.println("sh1 = " + sh1);
        short sh2 = Short.MIN_VALUE;
        System.out.println("sh2 = "+ sh2);

        int i1 = Integer.MAX_VALUE;
        System.out.println("i1 = " + i1);
        int i2 = Integer.MIN_VALUE;
        System.out.println("i2 = " + i2);

        long l1 = Long.MAX_VALUE;
        System.out.println("l1 = " + l1);
        long I2 = Long.MIN_VALUE;
        System.out.println("I2= " + I2);

        float f1 = Float.MAX_VALUE;
        float f2 = Float.MIN_VALUE;
        System.out.println("f2 = " + f2);
        System.out.println("f1 = " + f1);

        double d1 = Double.MAX_VALUE;
        double d2 = Double.MIN_VALUE;
        System.out.println("d2 = " + d2);
        System.out.println("d1= " + d1);

        char c1 = 'm';
        System.out.println("c1 = " + c1);

        char c2 = 67;
        System.out.println("c2 = " + c2);

        String name = "Tarık";
        System.out.println("Name = " + name);

    }
}
