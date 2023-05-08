package day22_stringBuilder_accessModifier;

public class C03_StringBuildersVeStringMethodlari {
    public static void main(String[] args) {

        /*
            StringBuilder bazi method`lar String dondurur
            bu method`lar String dondurdugu icin
            String`deki immutability`ye uyarlar
            ve StringBuilder`i degistirmezler

            Bazen de StringBuilder`da olmayan
            ancak String`de olan method`lari kullanmak isteyebiliriz
            bu durumda once StringBuilder`i String`e donusturmek gerekir

            Eger String method`lari kullanarak StringBuilder`i
            kalici olarak degistirmek istersek
                - once toString() yapip String`e ceviririz
                - String olan bu halinde istedigimiz String method`lari ile manipulation yapariz
                - String olan yeni degeri eski StringBuilder`a atama yapariz
                  sb = new StringBuilder(degistirilmisStringHali);
         */

        StringBuilder sb1 = new StringBuilder("Java Candir");

        System.out.println(sb1.substring(5)); // Candir

        System.out.println(sb1); // Java Candir

        System.out.println(sb1.toString().toUpperCase()); // JAVA CANDİR

        System.out.println(sb1); // Java Candir

        // bunu yeni bir StringBuilder`a atayabilir miyiz ?

        // sb1 = sb1.toString().toUpperCase();

        sb1 = new StringBuilder(sb1.toString().toUpperCase());

        System.out.println(sb1); // JAVA CANDİR

        sb1.substring(8,4);

    }
}
