package day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_get {

    public static void main(String[] args) {

        // eger uzun bir liste olusturmak istiyorsak
        // bir array olusturup
        // loop ile tum elementleri olusturdugumuz list`e ekleyebiliriz

        int[] sayilar = {3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6};
        List<Integer> sayiList = new ArrayList<>();

        for (int i = 0; i < sayilar.length; i++) {
            sayiList.add(sayilar[i]);
        }
        System.out.println(sayiList); // [3, 5, 6, 3, 1, 2, 5, 7, 5, 3, 4, 2, 3, 5, 6]

        String[] harfler = {"a", "v", "d", "e", "a", "q", "w", "x"};
        List<String> harfList = new ArrayList<>();
        for (int i = 0; i < harfler.length; i++) {
            harfList.add(harfler[i]);
        }
        System.out.println(harfList);// [a, v, d, e, a, q, w, x]
        System.out.println(harfList.get(3)); // e
        System.out.println(harfList.get(0)); // a
        System.out.println(harfList.get(harfList.size() - 1)); // x son elementi yazdirdik

        System.out.println(sayiList.get(0)); // 3
    }
}
