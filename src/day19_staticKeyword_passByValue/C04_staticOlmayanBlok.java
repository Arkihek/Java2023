package day19_staticKeyword_passByValue;

public class C04_staticOlmayanBlok {

    public static void main(String[] args) {
        System.out.println("Main method calisti");

        C04_staticOlmayanBlok obj1 = new C04_staticOlmayanBlok();
        C04_staticOlmayanBlok obj2 = new C04_staticOlmayanBlok();
        C04_staticOlmayanBlok obj3 = new C04_staticOlmayanBlok();
    }
    static {
        System.out.println("static blok calisti");
    }

    {
        /*
            static olmayan kod bloklari objelere baglidir
            her obje olusturuldugun statik olmayan blok tekrar calisir

            statik blok ise sadece 1 kere class ilk calismaya basladiginda calisir
         */
        System.out.println("static olmayan kod blogu calisti");
    }
}
