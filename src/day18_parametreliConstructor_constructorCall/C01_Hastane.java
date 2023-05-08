package day18_parametreliConstructor_constructorCall;

public class C01_Hastane {

    public C01_Hastane(){
        System.out.println("Parametresiz constructor");
    }

    public C01_Hastane(String isim){
        System.out.println("Isim parametreli constructor");
    }

    public C01_Hastane(String isim, String adres, String tel, String tur){
        personelIsmi = isim;
        personelAdresi = adres;
        personelTelefonu = tel;
        personelTuru = tur;
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
