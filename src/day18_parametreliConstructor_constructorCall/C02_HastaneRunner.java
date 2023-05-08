package day18_parametreliConstructor_constructorCall;

public class C02_HastaneRunner {

    public static void main(String[] args) {

        C01_Hastane per1 = new C01_Hastane();

        System.out.println(per1);
        per1.personelIsmi = "Ihsan";
        per1.personelAdresi = "Atakum";
        per1.personelTelefonu = "541541541";
        per1.personelTuru = "Hemsire";

        System.out.println(per1);

        //  Bir obje olusturuldugunda o objenin ozelliklerini atama yapmazsak
        //  class'daki ilk degerleri alacaktir
        //  eger o objenin kendine ozgu degerleri olmasini istiyorsak
        //  ATAMA yapmaliyiz


        C01_Hastane per2 = new C01_Hastane("Adem","Cankaya","50040030011","Doktor");

        System.out.println(per2);

        C01_Hastane per3 = new C01_Hastane("Murat","Fatsa","5055648997","Doktor");

        System.out.println(per3);
    }
}
