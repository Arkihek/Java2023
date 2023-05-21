package day31_iterator_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C06_SetSoru {

    public static void main(String[] args) {

        /*
            Verilen bir array`den tekrar eden elementleri silip uniqe
            elementlerden olusan halini array`e kaydedin
         */

        int[] sayilar = {1,2,3,3,1,54,5,6,4,3,2,2,1,5,2,3,54,5,1,2,3,7,6,45,7,84,4,5,67,8,9};

        // set dublication`a izin vermediginden bir set olusturup tum elementleri set`e ekleyelim

        System.out.println(Arrays.toString(sayilar)); // [1, 2, 3, 3, 1, 54, 5, 6, 4, 3, 2, 2, 1, 5, 2, 3, 54, 5, 1, 2, 3, 7, 6, 45, 7, 84, 4, 5, 67, 8, 9]

        Set<Integer> sayilarSet = new HashSet<>();

        for (Integer each:sayilar
             ) {
            sayilarSet.add(each);
        }
        System.out.println(sayilarSet); // [1, 2, 3, 67, 4, 5, 6, 7, 8, 9, 45, 84, 54]
        // Array`i bu elementlerle guncelleyelim

        sayilar = new int[sayilarSet.size()]; //
        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]


        int index = 0;
        for (Integer each: sayilarSet
             ) {
            sayilar[index] = each;
            index++;
        }
        System.out.println("Array`in son hali : " + Arrays.toString(sayilar)); // [1, 2, 3, 67, 4, 5, 6, 7, 8, 9, 45, 84, 54]
    }
}
