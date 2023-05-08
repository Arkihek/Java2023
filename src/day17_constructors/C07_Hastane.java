package day17_constructors;

public class C07_Hastane {
    /*
        Biz gorunur bir constructor olusturdugumuzda
        Java default constructor`i siler

        Biz gorunur constructor olusturmadan once
        default constructor`i kullanarak olusturulan objeler
        CTE verir.

        Boyle bir soruna sebep olmamak icin
        gorunur bir constructor olusturdugumuzda
        default constructor`in islevini yapan
        parametresiz bir constructor da olustururuz.
     */
    public C07_Hastane(){
        System.out.println("Parametresiz constructor");
    }

    public C07_Hastane(String isim){
        System.out.println("Isim parametreli constructor");
    }
    @Override
    public String toString() {
        return "C07_Hastane Objesi ==> " +
                "personelIsmi = " + personelIsmi +
                ", personelAdresi = " + personelAdresi +
                ", personelTelefonu = " + personelTelefonu +
                ", personelTuru = " + personelTuru ;

    }

    static String hastaneAdi = "Yildiz Hastanesi";
    static String hastaneTelefonu = "05415415454";

    String personelIsmi = "Isim belirtilmedi";
    String personelAdresi = "Adres belirtilmedi";
    String personelTelefonu = "Telefon belirtilmedi";
    String personelTuru = "Personel turu belirtilmedi";

    public int maas(){

        switch (personelTuru){
            case "Doktor":
                return 5000;
            case "Hemsire":
                return 3000;
            case "BasHemsire":
                return 4000;
            default:
                return 1900;
        }
}
}
