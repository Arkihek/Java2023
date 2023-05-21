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

        System.out.println(yemekSirasi.poll()); // Muhammed

        System.out.println("poll`dan sonra : " + yemekSirasi); // poll`dan sonra : [Sevda, Veysel, Aysegul]

        Queue<String> liste2 = new LinkedList<>();

        // liste2.remove(); // CTE NoSuchElementException
        System.out.println(liste2.poll()); // null

        yemekSirasi.offer("Firdevs");
        System.out.println(yemekSirasi); // [Sevda, Veysel, Aysegul, Firdevs]
        // eger kapasitesi sinirlamasi yoksa add() ile ayni islemi yapar

        System.out.println(yemekSirasi.peek()); // Sevda
        System.out.println(yemekSirasi); // [Sevda, Veysel, Aysegul, Firdevs]
        System.out.println(liste2.peek()); // null
        // Bastaki elementi silmeden bize dondurur
        // Eger queue bos ise null dondurur

        System.out.println(yemekSirasi.element()); // Sevda
        // System.out.println(liste2.element()); // CTE NoSuchElementException
        // Bastaki elemnti silmeden bize dondurur, bos liste olursa CTE olur




    }
}
