package day28_Interface;

public interface I03_BodyOlanMethod {

    /*
        Interface`deki tum method`lar public ve abstract`tir.
        (yazsak da yazmasak da)

        Java kendisine gelen talepler dogrultusunda
        Interface`e sonradan eklenen bazi method`lari
        eski class`larin implement etme zorunlulugu olmamasini saglamistir.

        Bunun icin method deklarasyonuna
        default veya static keyword eklenirse
        method`un body`si olabilir ve
        child class`larin impelement etme mecburiyeti olmaz

        Burada kullanilan defaukt keyword
        access modifier degildir
        method5`de de gorulecegi uzere public access modifier`dan
        sonra yazilmistir.

        (Bu default`un 6. farkli kullanimidir)
        Switch
        Class level
        default constructor
        Access modifier
        default super

        Ayni sekilde static keyword`de kismen farkli bir kullanima sahip
        child class`dan static olarak olusturdugumuz method6`ya direk ulasamiyoruz
        sadece interfaceAdi.methodAdi seklinde ulasabiliriz
     */

    public abstract void method1();
    abstract int method2();
    public String method3();
    double method4();

    public default void method5(){

    }
    public static int method6(){  // static methodlar override edilemez
        return 3;
    }

}
