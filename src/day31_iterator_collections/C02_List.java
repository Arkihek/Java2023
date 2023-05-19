package day31_iterator_collections;

import java.util.LinkedList;
import java.util.List;

public class C02_List {

    public static void main(String[] args) {

        List<String> liste = new LinkedList<>();
        System.out.println("Bos liste hash kod : " + liste.hashCode()); // Bos liste hash kod : 1

        liste.add("Esat");
        liste.add("Sevda");
        liste.add("Ilknur");
        liste.add("Seyma");

        System.out.println(liste); // [Esat, Sevda, Ilknur, Seyma]
        System.out.println("Dort elementten sonra liste hash kod : " + liste.hashCode()); // Dort elementten sonra liste hash kod : -1101225127

        liste.add(2,"Nurhayat");

        System.out.println(liste); // [Esat, Sevda, Nurhayat, Ilknur, Seyma]
        System.out.println("Bes elementten sonra liste hash kod : " + liste.hashCode()); // Bes elementten sonra liste hash kod : 1127796735

        List<String> liste2 = new LinkedList<>();
        liste2.add("Yusuf");
        liste2.add("Esat");
        liste2.add("Ilknur");
        liste2.add("Murat");

        System.out.println(liste2); // [Yusuf, Esat, Ilknur, Murat]

        System.out.println(liste.retainAll(liste2)); // true

        System.out.println("Liste son hali "+liste); // [Esat, Ilknur]
        // ortak elemanlar kalir, digerlarini siler



    }
}
