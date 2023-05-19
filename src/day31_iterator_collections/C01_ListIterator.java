package day31_iterator_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C01_ListIterator {

    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(3);
        sayilar.add(9);

        System.out.println(sayilar); // [5, 12, 3, 9]

        // index kullanmadan listenin tum elementlerini kalici olarak 2 ekleyin

        ListIterator lit = sayilar.listIterator();

        Integer sayi = 0;
        while (lit.hasNext()) {

            sayi = (Integer) lit.next();
            lit.set(sayi + 2);

        }
        System.out.println(sayilar); // [7, 14, 5, 11]

        // iterator kullanarak list`in elementlerini sondan basa dogru yazdirin
        // Yukaridaki islemden dolayi iterator en sonda

        while (lit.hasPrevious()) {

            System.out.print(lit.previous() + " ");

        }

        // iterator`u nerede birakirsak orada kalir
        // basta oldugundan emin olmak isterseniz
        // ya yeni bir iterator olusturursunuz
        // veya loop body`si bos olan bir while loop ile en basa kadar gidersiniz

        // ornegin iterator`i en sona goturelim

        while (lit.hasNext()) {
            lit.next();
        }

        System.out.println("\n" + lit.previousIndex()); // 3
        System.out.println(lit.nextIndex()); // 4

    }
}
