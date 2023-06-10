package day32_maps;

import java.util.Collection;
import java.util.Map;

public class C04_Values {

    public static void main(String[] args) {

        Map<Integer, String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        /*
        {
        101=Ali-Can-11-H-MF,
         102=Veli-Cem-10-K-TM,
          103=Ali-Cem-11-K-TM,
           104=Ayse-Can-10-H-MF,
            105=Sevgi-Cem-11-M-TM,
             106=Sevgi-Can-10-K-MF
             }
         */

        // tum ogrencilerin sadece value`larini yazdirin

        Collection<String> valuesOgrenci = ogrenciMap.values();
        System.out.println(valuesOgrenci);
        /*
         [Ali-Can-11-H-MF,
         Veli-Cem-10-K-TM,
         Ali-Cem-11-K-TM,
         Ayse-Can-10-H-MF,
         Sevgi-Cem-11-M-TM,
         Sevgi-Can-10-K-MF]
         */

        // Istenen siniftaki tum ogrencilerin isim ve soyisimlerini yazdirin

        MapMethodlar.istenenSiniftakiOgrencileriYazdir(ogrenciMap, 11);

    }
}
