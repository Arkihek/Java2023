package day11_mehodOverloading_whleLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        // Kullanicidan toplanmak uzere sayilar alin
        // toplam 500 olur veya gecerse deger almayi durdurup
        // kav sayi girildigini ve toplamin kac oldugunu yazdirin

        Scanner scanner = new Scanner(System.in);


        int sayac = 0;
        int toplam = 0;
        int sayi = 0;

        while (toplam<500){

            System.out.println("Toplanmak icin tam sayi giriniz");
            sayi = scanner.nextInt();
            sayac++;
            toplam+=sayi;

        }
        System.out.println(sayac + " adet sayinin toplami : " + toplam);


    }
}
