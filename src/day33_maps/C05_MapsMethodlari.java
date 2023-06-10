package day33_maps;

import day32_maps.MapMethodlar;

import java.util.Map;

public class C05_MapsMethodlari {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        ogrenciMap.put(110,"Ihsan-Yilmaz-12-A-MF");
        ogrenciMap.put(101,"Ayse-Yan-12-A-MF");
        // map`e element ekler,
        // eklenen key zaten map`de varsa eski value`yu yeni value olarak update eder

        ogrenciMap.replace(102,"Aysegul-Lan-11-A-MF");
        // bu haliyle put ile ayni islemi goruyor

        ogrenciMap.replace(103,"Ali-Cem-11-K-TM","Nazli-Can-9-K-TM"); // var olan degerde dogru veri girdik
        ogrenciMap.replace(104,"Ayse-Cem-10-H-MF","Hasan-Cem-12-E-MF"); // var olan degerde yanlis veri girdik
        // verilen  key`in value`su benim dedigim gibi ise degistirir
        // benim dedigim gibi degilse degistirmez
        System.out.println(ogrenciMap);

        System.out.println(ogrenciMap.getOrDefault(105, "Bu ogrenci map`de yok"));
        System.out.println(ogrenciMap.getOrDefault(120, "Bu ogrenci map`de yok"));
        System.out.println(ogrenciMap.get(120)); // null
        // getOrDefault() : aranan key varsa value`sunu dondurur
        //                  aranan key yoksa tanimladigimiz default degeri dondurur
        //                  get`ten farki bulamadigimizda null degeri degil default degeri dondurmesidir

        System.out.println(ogrenciMap.containsKey(105)); // true
        System.out.println(ogrenciMap.containsValue("Ayse")); // false
        System.out.println(ogrenciMap.containsValue("Sevgi-Cem-11-M-TM")); // true
        // containsValue, bir butun olarak value`leri kontrol eder
        // value icindeki String`leri kontrol etmez
        // birebir map`deki value`lerle eslesen varsa true donder

        ogrenciMap.putIfAbsent(120,"Nurhayat-Zam-12-M-TM");
        ogrenciMap.putIfAbsent(102,"Ahmet-Yan-10-M-TM");
        System.out.println(ogrenciMap);



    }
}
