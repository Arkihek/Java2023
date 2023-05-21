package day31_iterator_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class C05_Set {

    public static void main(String[] args) {
        // Uniqe bir list = set

        Set<String> sinifList = new HashSet<>();

        sinifList.add("Sahra");
        sinifList.add("Sevda");

        System.out.println(sinifList); // [Sevda, Sahra]


        sinifList.add("Sevda");
        System.out.println(sinifList.add("Sevda")); // false
        System.out.println(sinifList); // [Sevda, Sahra]


    }
}
