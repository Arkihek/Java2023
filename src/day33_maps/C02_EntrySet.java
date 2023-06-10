package day33_maps;

import day32_maps.MapMethodlar;

import java.util.Map;

public class C02_EntrySet {
      /*
        suana kadar bize bir map verildiginde
        key`lere ogrencimap.keySet() ile,
        value`lere ogrencimap.values() ile ulasabiliyoruz

        Eger hem key hemde value ile islem yapmamiz gerekirse
        mecburen key`lerin bulundugu Set
        ve value`larin bulundugu Collection
        objelerini beraber yonetmemiz gerekiyordu

        Java key ve value`lari birlikte barindirmasi icin
        Entry isimli bir class olusturmustur

        Entry ile key ve value`yu birlikte kullanabilir,
        entry uzerinde yapilan update`leri otomatik olarak map`e isleyebiliriz
        */

      public static void main(String[] args) {

          // ogrenci listesini numara-isim-soyisim-sinif seklinde yazdirin

          Map<Integer,String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();

          MapMethodlar.numaraliTumOgrenciListesiYazdir(ogrenciMap);


      }
}
