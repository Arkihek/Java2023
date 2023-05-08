package day11_mehodOverloading_whleLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {

        // kullanicidan toplanmak uzere pozitif tamsayilar isteyin
        // kullanici 0'a basana kadar isleme devam edin
        // kullanici sifira bastiginda
        // girdigi pozitif tamsayi adedini ve toplamini yazdirin
        // kullanici negatif sayi girerse uyari verin ve o sayiyi adet'e eklemeyin

        Scanner scanner = new Scanner(System.in);

        int sayi = 1; // 0 dersek islem biteceginden burada 0 dan farkli bir deger kullandik
        int sayac = 0;
        int toplam = 0;

        while (sayi != 0) {
            System.out.println("Lutfen toplanmasini istediginiz pozitif bir tam sayi giriniz. \nIslemi bitirmek icin 0`a basiniz.");
            sayi = scanner.nextInt();

            if (sayi>0){
                toplam += sayi;
                sayac++;
            } else if (sayi<0) {
                System.out.println("Pozitif tam sayigirmelisiniz");
            }
        }
        System.out.println(sayac + " adet girilen pozitif tamsayinin toplami : " + toplam);

    }
}
