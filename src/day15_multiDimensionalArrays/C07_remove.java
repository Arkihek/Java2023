package day15_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C07_remove {

    public static void main(String[] args) {

        String[] harfler = {"a", "v", "d", "e", "a", "q", "w", "x"};
        List<String> harfList = new ArrayList<>();
        for (int i = 0; i < harfler.length; i++) {
            harfList.add(harfler[i]);
        }
        System.out.println(harfList); // [a, v, d, e, a, q, w, x]

        System.out.println(harfList.remove("v")); // true

        System.out.println(harfList); // [a, d, e, a, q, w, x]

        System.out.println(harfList.remove("i")); //false

        System.out.println(harfList); // [a, d, e, a, q, w, x]

        // remove() unda obje verirsek, bulursa siler ve true dondurur
        // bulamazsa silemedigi icin false dondurur

        System.out.println(harfList.remove(1)); // d

        System.out.println(harfList); // [a, e, a, q, w, x]

       // System.out.println(harfList.remove(25)); //IndexOutOfBoundsException

        // remove() index ile verilirse index liste icinde varsa
        // elemani siler ve sildigi elemani bize dondurur
        // index yoksa exception olusur

        System.out.println(harfList.remove("a"));

        System.out.println(harfList); // [e, a, q, w, x]
    }
}
