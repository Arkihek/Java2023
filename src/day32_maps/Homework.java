package day32_maps;

import java.util.Map;

public class Homework {




    public static void main(String[] args) {

        // verilen soyisme sahip tum ogrencileri yazdirin

        Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();
        System.out.println(ogrenciMap);

        MapMethodlar.soyisimIleOgrenciYazdir(ogrenciMap,"cem");

        // verilen subedeki tum ogrencileri yazdirin

        MapMethodlar.subeIleOgrenciYazdir(ogrenciMap,"H");

        // verilen sinif ve subedeki tum ogrencileri yazdirin

        MapMethodlar.sinifVeSubeIleOgrenciYazdir(ogrenciMap,"10","H");


    }

}
