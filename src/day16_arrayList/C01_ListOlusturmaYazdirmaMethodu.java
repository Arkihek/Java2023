package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_ListOlusturmaYazdirmaMethodu {
    public static void main(String[] args) {

        // olusturulan bir listeyi yazdiran bir method olusturma egzersizi

        List<String> isimler = new ArrayList<>();
        isimler.add("Ahmet");
        isimler.add("Murat");
        isimler.add("Muhammed");
        isimler.add("Sefa");
        isimler.add("Erhan");

        // method call : method cagirma
        listYazdirma(isimler);
    }

    // sadece konsola yazi yazdirilacaksa void return type kullanilir
    public static void listYazdirma(List<String> isimler) {
        System.out.println(isimler);

    }

}
