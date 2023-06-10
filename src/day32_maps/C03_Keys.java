package day32_maps;

import java.util.Map;
import java.util.Set;

public class C03_Keys {

    public static void main(String[] args) {
        // her class`da map ile islem yapabilmek icin
        // bir map olusturmak ve ogrencileri eklemek zorundayiz
        // MapMethod`lar class`inda bir map olusturup,
        // ogrencileri ekleyip bize donduren bir method olusturalim

        /*

        Map<Integer,String> ogrenciMap1 = new HashMap<>();
        System.out.println(ogrenciMap1); // {}

        ogrenciMap1.put(101,"101 ogrenci");
        ogrenciMap1.put(102,"102 ogrenci");
        ogrenciMap1.put(103,"103 ogrenci");

        System.out.println(ogrenciMap1); // {101=101 ogrenci, 102=102 ogrenci, 103=103 ogrenci}

         */

        Map<Integer, String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);
        // {101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Cem-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM, 106=Sevgi-Can-10-K-MF}

        // Map`deki tum key`leri yazdirin

        System.out.println(ogrenciMap.keySet()); // [101, 102, 103, 104, 105, 106]

        // bu seti kaydetmek istersek

        Set<Integer> keySeti = ogrenciMap.keySet();

        System.out.println(keySeti); // [101, 102, 103, 104, 105, 106]

        /*
        keySeti`ndeki ogrenci numaralarini asagidaki formatta yazdirin

            1- 101
            2- 102
            3- 103
            4- 104
         */

        int siraNo = 1;
        for (Integer eachKey : keySeti
        ) {
            System.out.println(siraNo + "- " + eachKey);
            siraNo++;
        }

        // tum ogrencilerin isim ve soyisimlerini
        // bir liste olarak yazdiran bir method olusturun

        MapMethodlar.tumOgrenciListesiYazdir(ogrenciMap);


    }
}
