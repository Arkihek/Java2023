package day22_stringBuilder_accessModifier;

public class C05_AccessModifier {

    protected C05_AccessModifier (){

    }

    private String privateStr;
    String defaultStr;
    protected String protectedStr;
    public String publicStr;

    private static int privateStaticSayi;
    static int staticSayi;
    protected static int protectedStaticSayi;
    public static int publicStaticSayi;

    private void privateMethod(){

    }
    void defaultMethod(){

    }
    protected void protectedMethod(){

    }
    public void publicMethod(){

    }
    private static void privateStaticMethod(){

    }
    static void defaultStaticMethod(){

    }
    protected static void protectedStaticMethod(){

    }
    public static void publicStaticMethod(){

    }

    public static void main(String[] args) {
        // tum static class uyeleri direk kullanilabilir

        //static olmayan tum class uyeleri icin obje lazim
        C05_AccessModifier obj = new C05_AccessModifier();
        System.out.println(obj.defaultStr);

        obj.publicStaticMethod();

        // static class uyelerini obje uzerinden kullanmaya gerek yoktur.
        // ama kullanmak istersek java itiraz etmez

    }

    public void classUyeKullanimi(){
        // static olan veya olmayan tum class uyeleri kullanilabilir

        System.out.println(privateStaticSayi);
        System.out.println(privateStr);

        publicStaticMethod();
        publicMethod();


    }

}
