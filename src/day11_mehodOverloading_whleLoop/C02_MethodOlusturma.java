package day11_mehodOverloading_whleLoop;

import java.util.Scanner;

public class C02_MethodOlusturma {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        // Girilen sayinin pozitif tam bolenleri sayisini bulup bize donduren bir method olusturun.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi = scanner.nextInt();
        System.out.println(pozitifBolenSayisiBul(sayi));

        // Verilen sayinin asal olup olmadgini bu methodu kullanarak yazdiralim
        int pbts = pozitifBolenSayisiBul(sayi);
        if (pbts == 2) {
            System.out.println("Verilen sayi asaldir");
        } else {
            System.out.println("Verilen sayi asal degildir");
        }

    }

    public static int pozitifBolenSayisiBul(int sayi) {
        int sayac = 0;
        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        return sayac;
    }
}
