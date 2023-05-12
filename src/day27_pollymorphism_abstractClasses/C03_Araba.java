package day27_pollymorphism_abstractClasses;

public abstract class C03_Araba {


    /*
        Parent class`da istedigimiz herhangi bir method`u
        child class`larin TUMU override etmek zorunda kalsin istiyorsak
        o method`u abstract yapariz.

        Eger abstract yapilan bir method tum child class`lar tarafindan
        OVERRIDE edilecekse parent class`daki
        abstract method hicbir zaman CALISMAYACAKTIR
        override edildigi icin guncel olan
        child class`lardaki overriding method`lar calisacaktir
        ozaman abstract method`larin body`ye ihtiyaci YOKTUR.
     */


    abstract void teker();
    abstract void motor();
    abstract void gosterge();
    void guvenlik(){
        System.out.println("Arabalarin guvenlik onlemleri olabilir");
    }
    void klima(){
        System.out.println("Arabalarin klimasi olabilir");
    }

}
