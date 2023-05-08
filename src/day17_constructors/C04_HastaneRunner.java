package day17_constructors;

public class C04_HastaneRunner {

    public static void main(String[] args) {

        /*
            Biz bir obje olusturdugumuzda java once bu constructor`un varligini teyit eder
            Constructor varsa istenen obje olusturulur.
            Obje olusturulunca instance olan butun variable`larin birer kopylarini olusturur
            ve bu objeye iliskilendirilir
            Objeye yeni atama yapmadiginiz muddetce
            objenin olusturuldugu class`daki ilk degerleri kullanilir

            Obje uzerinden static variable`lara ulasmak istedigimizde
            java once obje`ye gider, o objeye ilisiklendirilen bilgilerde
            istenen variable`i bulamazsa, class seviyesinde static variable`lara ulasir

            Static variable`lar class`a baglidir
            ve degistirilirse tum objeler icin degisiklik gecerli olur

         */

        C03_Hastane per1 = new C03_Hastane();

        System.out.println(per1.personelIsmi);
        per1.personelTuru="Doktor";
        System.out.println(per1.maas(per1.personelTuru));


        C03_Hastane per2 = new C03_Hastane();
        System.out.println(per2.personelTuru);

        System.out.println(per1.hastaneAdi); // Yildiz Hastanesi
        per2.hastaneAdi="Java Hastanesi";
        System.out.println(per1.hastaneAdi); // Java Hastanesi

    }
}
