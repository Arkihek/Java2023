package day33_maps;

import day32_maps.MapMethodlar;

import java.util.Map;

public class C01_Tekrar {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);


        // tum ogrencileri yazdir
        MapMethodlar.tumOgrenciListesiYazdir(ogrenciMap);

        // numarasi verilen bir ogrencinin soyismini update edin
        MapMethodlar.numaraIleSoyisimUpdateEt(ogrenciMap,102,"JanJan");
        System.out.println(ogrenciMap);

        // 110`dan kucuk olan numaralardaki ogrencileri listeleyin
        MapMethodlar.numaraAraligindakiOgrencileriYazdir(ogrenciMap,1,110);

        // istenen siniftaki ogrencileri yazdirin
        MapMethodlar.istenenSiniftakiOgrencileriYazdir(ogrenciMap,10);



    }
}
