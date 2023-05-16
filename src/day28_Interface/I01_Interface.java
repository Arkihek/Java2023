package day28_Interface;

public interface I01_Interface {
    /*
        Interface`ler class`degildir
        Interface full abstraction sagladigi icin
        Interface`in deklarasyonunda abstract yazmamiza gerek yoktur
        java otomatik olarak Interface`leri abstract olarak tanimlar

        Ayni sekilde Interface`ler icerisinde olusturulan method`lar icinde
        public veya abstract yazmaya gerek yoktur
        Java tum method`lari public ve abstract olarak kabul eder

        Interface`ler child class`lar icin bir Sablon ozelligi tasir
        To Do List ==> yapilacaklar listesi
     */

    int SAYI = 20;
    // Java`da statik ve final variable isimleri buyuk harf ile olusturulur



    public abstract void method1();
    abstract int method2();
    public String method3();
    // double method4();


}
