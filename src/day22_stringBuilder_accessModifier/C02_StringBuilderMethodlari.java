package day22_stringBuilder_accessModifier;

public class C02_StringBuilderMethodlari {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java Candir");

        sb1.append(".");

        System.out.println(sb1); // Java Candir.

        String str = "Bugun hava cok guzel";
        sb1.append(str,5,10);
        System.out.println(sb1); // Java Candir.hava

        sb1.replace(0,4,"Selenium");
        System.out.println(sb1); // Selenium Candir. hava

        sb1.insert(9,"heye");
        System.out.println(sb1); // Selenium heyeCandir. hava

        sb1.delete(20,25);
        System.out.println(sb1); // Selenium heyeCandir.

        System.out.println(sb1.indexOf("C")); // 13
        sb1.deleteCharAt(sb1.indexOf("C"));
        System.out.println(sb1); // Selenium heyeandir.

        sb1.insert(13,"c");
        System.out.println(sb1); // Selenium heyecandir.

        sb1.reverse(); // tersten yazdirir.
        System.out.println(sb1); // .ridnaceyeh muineleS
        sb1.reverse();
        System.out.println(sb1); // Selenium heyecandir.

        StringBuilder sb2 = new StringBuilder("Java Candir");
        System.out.println(sb1.compareTo(sb2)); // 9

        StringBuilder sb3 = new StringBuilder("Bu Java Candir");
        System.out.println(sb1.compareTo(sb3)); // 17

        StringBuilder sb4 = new StringBuilder("Java Candir");
        System.out.println(sb1.compareTo(sb4)); // 4

        StringBuilder sb5= new StringBuilder("Selenium heyecandir.");
        System.out.println(sb1.compareTo(sb5)); // 0

        System.out.println(sb1 == sb5); // false
        System.out.println(sb1 == sb1); // true

        System.out.println(sb1.equals(sb5)); // false
        System.out.println(sb1.equals(sb1)); // true

        /*
            String builder icin == ile equals ayni islevi yapar
            sadece bir sb'i kendisiyle ==, equals() ile karsilastirirsaniz TRUE
            diger durumlarda false doner

            bir sb'in metin olarak baska sb ile ayni olup olmadigini
            kontrol etmek icin compare() kullanilir
            compare()'in sonucu 0(sifir) ise iki metin ayni
            0 degilse iki metin farkli diyebiliriz
         */

        String str2= "Bu Selenium heyecandir.";

        // System.out.println(sb1 == str2); // Java'da farkli non-primitive data turundeki
        // objeler == ile kontrol EDILEMEZ

        System.out.println(sb1.equals(str2)); // Java itiraz etmez ancak sonucu her zaman false verir

        // System.out.println(sb1.compareTo(str2)); // compare() 2 sb'i karsilastirir

    }
}
