package day19_staticKeyword_passByValue;

public class C02 {

    static String staticV = "Java";
    String isimInst = "Sevda";

    public static void main(String[] args) {

        C02 obj1 = new C02();

        System.out.println(obj1.isimInst); // Sevda
        System.out.println(obj1.staticV); // Java
        obj1.isimInst = "Ihsan";
        System.out.println(obj1.isimInst); // Ihsan

        C02 obj2 = new C02();

        System.out.println(obj2.isimInst); // Sevda
        System.out.println(obj2.staticV); // Java

        obj2.isimInst = "Ayse";
        obj2.staticV = "Hava";

        System.out.println(obj1.isimInst); // Ihsan
        System.out.println(obj1.staticV); // Hava
        System.out.println(obj2.isimInst); // Ayse
        System.out.println(obj2.staticV); // Hava
        System.out.println(staticV); // Hava


    }
}
