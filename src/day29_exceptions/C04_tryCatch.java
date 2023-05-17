package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_tryCatch {

    // Kullanicidan toplanmak uzere sayi alin
    // kullanici tamsayi girmezse hata mesaji verip yeniden tamsayi isteyin
    // kullanici islemi bitirmek icin Q veya q`ya basacaktir
    // kullanici islemi bitirdiginde
    // kac tane gecerli sayi girdigini ve bu sayilarin toplaminin kac oldugunu yazdirin.

    public static void main(String[] args) {

        int sayi = 0;
        int toplam = 0;
        int sayac = 0;
        boolean sayiIste = true;
        String tercih = "";

        Scanner scanner = new Scanner(System.in);

        while (sayiIste) {

            System.out.println("Lutfen toplanmak uzere tam sayi giriniz.\nBitirmek icin Q ya basiniz");

            try { // normal giris icin calisacak kodlar
                sayi = scanner.nextInt();
                toplam += sayi;
                sayac++;

            } catch (InputMismatchException e) { // exception durumunda calisacak kodlar
                tercih = scanner.next();
                // kullanici yanlis giris yaptiginda veya Q`ya bastiginda burasi calisacak
                if (tercih.equalsIgnoreCase("q")) {
                    sayiIste = false; // yada direkt break yapariz

                } else {
                    System.out.println("Toplanmak icin tam sayi yazmalisiniz");
                }
            }
        }
        System.out.println("Toplam " + sayac + " adet sayi girdiniz.\nToplamlari : " + toplam);
    }


}
