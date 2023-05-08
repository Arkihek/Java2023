package day20_passByValue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C04_ImmutableClasses {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase()); // JAVA CANDİR

        System.out.println(str); // Java Candir

        str.toLowerCase();
        str.replace("a","e");
        str.repeat(4);

        System.out.println(str); // Java Candir

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(4);
        sayilar.add(3);
        sayilar.add(2);


        System.out.println(sayilar); // [4, 3, 2]

        sayilar.set(0,10);

        System.out.println(sayilar); // [10, 3, 2]

    }
}
