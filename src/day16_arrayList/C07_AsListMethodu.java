package day16_arrayList;

import java.util.Arrays;
import java.util.List;

public class C07_AsListMethodu {
    public static void main(String[] args) {

        Integer[] arr = {1,3,5};

        // verilen bir array`i liste cevirmek icin for loop olusturup liste eklemeyi tavsiye ediyoruz

        // yinede gormek adina asList methodunu kullanalim

        List<Integer> arraydenList = Arrays.asList(arr);

        System.out.println("Array : " + Arrays.toString(arr)); // [1, 3, 5]
        System.out.println("Arrayden list : " + arraydenList); // [1, 3, 5]

        // olusturulan listeye ekleme cikartma yapilabilmeli

        // arraydenList.add(5); // UnsupportedOperationException
        // arraydenList.remove(1); // UnsupportedOperationException

        arr[0] = 23;
        System.out.println("Array : " + Arrays.toString(arr)); // [23, 3, 5]
        System.out.println("Arrayi degistirdekten sonra list : " + arraydenList); // [23, 3, 5]

        /*
        Bir arrayi listeye cevirirken asList methodunu kullanmanin iki ana negatif yonu vardir:

        1- asList methodu ile olusturulan liste, esnek bir yapiya sahip degildir. Ekleme veya cikartma yapamayiz
        2- Kaynak array degistirildigi zaman, otomatik olarak bu arrayden olusturulan liste de degisir
         */

    }
}
