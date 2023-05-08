package day19_staticKeyword_passByValue;

public class C01_static {

    static String staticV = "Java candir";
    String instanceV = "Selenium heyecandir";

    public static void main(String[] args) {
        staticV = "Java hayattir";
        staticMethod();
       // System.out.println(instanceV);
       // staticOlmayanMethod();
    }

    public static void staticMethod(){
        System.out.println("Static method calisti");
        System.out.println(staticV);
    }
    public void staticOlmayanMethod(){
        System.out.println("Static olmayan method calisti");
        System.out.println(staticV);
        staticMethod();
        System.out.println(instanceV);
    }
}
