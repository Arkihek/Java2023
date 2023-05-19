package day31_iterator_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {

    public static void main(String[] args) {

        Queue<String> yemekSirasi = new LinkedList<>();

        yemekSirasi.add("Murat");
        yemekSirasi.add("Muhammed");

        // Murat ile Muhammed arasina bir eleman ekleyelim
        // queue ozelliginden dolayi, araya eleman EKLENEMEZ
        // EN SONA EKLER , EN BASTAN SILER

        System.out.println(yemekSirasi); // [Murat, Muhammed]

        System.out.println(yemekSirasi.remove()); // Murat
        // Bastakini siler ve hangisini sildiyse onu bize dondurur

        System.out.println(yemekSirasi); // [Muhammed]

        yemekSirasi.add("Sevda");
        yemekSirasi.add("Veysel");
        yemekSirasi.add("Aysegul");

        System.out.println(yemekSirasi); // [Muhammed, Sevda, Veysel, Aysegul]


    }
}
