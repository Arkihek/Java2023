package day16_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C09_ForEachLoop {
    public static void main(String[] args) {

        //   Soru 3- Verilen String bir array’deki her bir elementi kontrol edip,
        // - Kelimenin uzunlugu cift sayi ise ilk yarisini
        // - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        //   yeni bir listeye ekleyip yazdirin.

        String[] arr = {"araba","kelam","Mehmet","ihsan"};

        isimManipulasyonMethodu(arr);

    }

    public static void isimManipulasyonMethodu(String[] arr) {

        // Manipule edilen kelimeleri eklemek icin
        List<String> manipuleKelimeler = new ArrayList<>();
        // arr icindeki butun kelimelere tek tek ulasmak
        for (String each : arr
        ) {
            // mehmet // kelimenin uzunlugu cift sayi ise - meh - alicaz
            if (each.length() % 2 == 0){
                manipuleKelimeler.add(each.substring(0,each.length()/2));

                }else { // araba // Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini aliyoruz
                manipuleKelimeler.add(each.substring((each.length()-1)/2));
            }

        }
        System.out.println(manipuleKelimeler);

    }
}
