package day17_constructors;

public class C06_HastaneRunner {
    public static void main(String[] args) {

        C05_Hastane per1 = new C05_Hastane(); // parametresiz constructor calisti

        System.out.println(per1.personelIsmi); // Isim belirtilmedi
        System.out.println(per1.personelTelefonu); // Telefon belirtilmedi
        System.out.println(per1.personelAdresi); // Adres belirtilmedi
        System.out.println(per1.personelTuru); // Personel turu belirtilmedi
        System.out.println(per1.maas()); // 1900

        per1.personelIsmi = "Ihsan";
        per1.personelAdresi = "Atakum";
        per1.personelTelefonu = "159357258";
        per1.personelTuru = "Doktor";

        System.out.println(per1.personelIsmi); // Ihsan
        System.out.println(per1.personelTelefonu); // 159357258
        System.out.println(per1.personelAdresi); // Atakum
        System.out.println(per1.personelTuru); // Doktor
        System.out.println(per1.maas()); // 5000


    }
}
