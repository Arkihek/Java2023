package day16_arrayList;

import java.util.List;

public class C03_KullanicidanAlinanIsimlerdenBelliIsimleriYazdirma {
    public static void main(String[] args) {

        // kullanicidan alinan isimlerden olusan Listede 3 harften fazla olan isimleri yazdirin

        List<String> yeniIsim = C02_KullaniciListeOlusturma.listOlusturmaString();

        // Listenin elemanlarina ulasmak icin bir loop
        // listenin elemanlari eger 3 harf veya fazlaysa yazdiran code

        for (int i = 0; i < yeniIsim.size(); i++) {
            if (yeniIsim.get(i).length()>=3){
                System.out.println(yeniIsim.get(i));
            }
        }
    }
}
