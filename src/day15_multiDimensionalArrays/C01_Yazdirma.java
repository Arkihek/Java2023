package day15_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Yazdirma {
    public static void main(String[] args) {

        /*
            MDA`de yazdirma islemi yaparken
            yazdirmak istedigimizin ne olduguna bakmamiz gerekir
            - Element ise direk yazdirabiliriz
            - Tek katli bir array ise Arrays.toString() kullanabiliriz
            - MDA ise Arrays.deepToString() kullanmaliyiz
         */

        int[][] arr = {{1, 5, 9}, {3, 4}, {2, 8, 1, 2}, {10}};

        System.out.println(arr[0][0]); // 1

        // System.out.println(arr[3][2]); // ArrayIndexOutOfBoundsException

        System.out.println(arr.length); // 4

        System.out.println(arr[2].length); // 4

        System.out.println(arr[3].length); // 1

        // arr[2][1].length  bir element oldugu icin length`i olmaz

        System.out.println(arr[2]); // [I@48140564  referansi yazdirdi. Cunku element degil array`i yazdirdik
        System.out.println(Arrays.toString(arr[2])); // [2, 8, 1, 2]

        System.out.println(arr); // [[I@58ceff1
        System.out.println(Arrays.toString(arr)); // [[I@7c30a502, [I@49e4cb85, [I@48140564, [I@2133c8f8]
        System.out.println(Arrays.deepToString(arr)); // [[1, 5, 9], [3, 4], [2, 8, 1, 2], [10]]
    }
}
