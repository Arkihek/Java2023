package day33_maps;

import java.util.Map;
import java.util.TreeMap;

public class C07_Compute {

    public static void main(String[] args) {

        Map<String, Integer> harfKullanimSayilari = new TreeMap<>();

        harfKullanimSayilari.put("A", 20);
        harfKullanimSayilari.put("K", 10);
        harfKullanimSayilari.put("C", 25);
        harfKullanimSayilari.put("M", 23);
        harfKullanimSayilari.put("Z", 32);

        System.out.println(harfKullanimSayilari); // {A=20, C=25, K=10, M=23, Z=32}

        // A`nin degerini 2 katina cikarin

        Integer eskiDeger = harfKullanimSayilari.get("A");
        harfKullanimSayilari.put("A", eskiDeger * 2);

        System.out.println(harfKullanimSayilari); // {A=40, C=25, K=10, M=23, Z=32}

        // B varsa degerini 3 arttirin
        if (harfKullanimSayilari.containsKey("B")) {
            eskiDeger = harfKullanimSayilari.get("B");
            harfKullanimSayilari.put("B", eskiDeger + 3);
        }
        System.out.println(harfKullanimSayilari); // {A=40, C=25, K=10, M=23, Z=32}

        /*

            Java var olan veya olmayan key`lerin
            value`leri uzerinde islem yapmak icin
            ozel iki method gelistirmistir

            bu method`lar functional programing (Lambda) kullanarak calisir
         */

        harfKullanimSayilari.compute("A", (k, v) -> 2 * v);
        System.out.println(harfKullanimSayilari); // {A=80, C=25, K=10, M=23, Z=32}

        // B varsa degerini 3 arttirin

        harfKullanimSayilari.computeIfPresent("B", (K, v) -> v + 3);
        harfKullanimSayilari.computeIfPresent("M", (K, v) -> v + 3);
        System.out.println(harfKullanimSayilari); // {A=80, C=25, K=10, M=26, Z=32}

        // Eger B yoksa degeri 5 olarak ekleyin

        harfKullanimSayilari.putIfAbsent("B", 5);
        harfKullanimSayilari.putIfAbsent("A", 5);

        System.out.println(harfKullanimSayilari); // {A=80, B=5, C=25, K=10, M=26, Z=32}

        // Eger D yoksa degeri 12 olarak ekleyin

        harfKullanimSayilari.computeIfAbsent("D", v -> 12);
        harfKullanimSayilari.computeIfAbsent("C", v -> 7);

        System.out.println(harfKullanimSayilari); // {A=80, B=5, C=25, D=12, K=10, M=26, Z=32}


    }
}
