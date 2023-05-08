package day12_doWhileLoop_scope;

public class C06_ClassLevelVariables {

    /*
        Bir class`in tamaminda gecerli variable`lar olusturmak istersek
        bu variable`lari class levelda olustururuz.
        Yani class`in icinde ama method`larin disinda olustururuz.

        Bu variable`larin en ustte olmasi sart degildir
        ancak genel kullanimda class level variable`lar
        class`in en ust kisminda olusturulur.

        class level variable`lar static ve static olmayan (instance) seklinde
        iki farkli sekilde olusturulabilir.

        static variable`lar static klubune uye olduklari icin
        tum method`lara gidebilir ve tum method`lardan kullanilabilirler.

        instance variable`lar static olmadiklari icin
        bu defa karar verici olarak method`lar devreye girer
     */

    static int sayi = 10;   // static variable -- class level
    String str = "java";    // instance variable -- class level


    public static void main(String[] args) {
        sayi = 20;
        System.out.println(sayi); // 20

        // System.out.println(str);
        // static olmayan bir variable, static alandan kullanilamaz
    }

    public static void staticMethod() {
        sayi = 30;
        // str = "tava";
        // static olmayan bir variable, static alandan kullanilamaz
    }

    public void staticOlmayanMethod() {
        sayi = 40;
        str = "hava";
        // method static degil, variable da static degil


    }


}
