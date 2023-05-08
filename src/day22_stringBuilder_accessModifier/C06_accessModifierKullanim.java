package day22_stringBuilder_accessModifier;

public class C06_accessModifierKullanim {

    public static void main(String[] args) {
        // Baska class`daki static class uyelerinden
        // private olmayanlara direk class ismi ile ulasilabilir
        System.out.println(C05_AccessModifier.protectedStaticSayi);
        System.out.println(C05_AccessModifier.staticSayi);

        // Ayni package icinde baska class`daki static olmayan class uyelerinden
        // private olanlar haric tamamina objeyle erisebiliriz

        C05_AccessModifier obj = new C05_AccessModifier();
        System.out.println(obj.defaultStr);
        obj.protectedMethod();


    }
    void baskaClassdanKullanimMethodu(){
        C05_AccessModifier.defaultStaticMethod();
        System.out.println(C05_AccessModifier.staticSayi);

        C05_AccessModifier obj = new C05_AccessModifier();
        System.out.println(obj.defaultStr);

    }
}
