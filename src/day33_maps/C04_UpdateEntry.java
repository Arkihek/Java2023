package day33_maps;

import day32_maps.MapMethodlar;

import java.util.Map;

public class C04_UpdateEntry {

    public static void main(String[] args) {

        // ogrenci map`indeki tum soy isimleri buyuk harfe cevirin

        Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();

        System.out.println(ogrenciMap);

        ogrenciMap = MapMethodlar.soyisimleriBuyukHarfYap(ogrenciMap);

        System.out.println(ogrenciMap);
    }
}
