package day23_encapesulation_inheritance;

import day22_stringBuilder_accessModifier.C05_AccessModifier;

public class C01_AccessModifierKullanimi extends C05_AccessModifier {

    public static void main(String[] args) {

        // Baska package`daki bir class`dan class uyelerinin
        // sadece public olanlari kullanabiliriz
        // eger bulundugumuz class ile ulasmak istedigimiz class arasinda
        // parent-child iliskisi varsa class uyelerine erisim mumkundur
        System.out.println(C05_AccessModifier.publicStaticSayi);
        C05_AccessModifier.publicStaticMethod();

        C05_AccessModifier.protectedStaticSayi = 10;
        C05_AccessModifier.publicStaticSayi =25;

        System.out.println(C05_AccessModifier.protectedStaticSayi); // 10
        System.out.println(C05_AccessModifier.publicStaticSayi); // 25

        /*
            Access modifier ile erisimi duzenlenen bir class uyesine
            baska class`dan erisebilirsek
            hem deger atamasi yapabilir, hemde o class uyesinin degerini yazdirabiliriz.
         */

    }
}
