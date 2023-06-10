package day33_maps;

import day32_maps.MapMethodlar;

import java.util.Map;

public class C03_UpdateEntry {
    public static void main(String[] args) {
        // ogrenci map`inden yilsonu sinif arttirin
        // 12. siniftakiler icin sinif bilgisi olarak mezun yazin
        // mezun yazan varsa bir islem yapilmayacak

        Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();

        ogrenciMap.put(110,"ilknur-Yul-12-K-Say");
        ogrenciMap.put(111,"Esad-Han-Mezun-K-Say");

        System.out.println(ogrenciMap);

        ogrenciMap = MapMethodlar.yilSonuSinifArttir(ogrenciMap);

        System.out.println(ogrenciMap);
    }
}
