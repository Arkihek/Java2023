package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_tryCatch {
    public static void main(String[] args) {
        // Kullanicidan 2 tam sayi alin
        // Kullanici tam sayi girmezse hata mesaji verip yeniden sayi isteyin
        // ilk sayiyi ikinciye bolun
        // ve sonucun tamsayi kismini yazdirin


        Scanner scan = new Scanner(System.in);

        boolean sayiIste = true;
        int sayi1 = 0;

        while (sayiIste) {

            try {
                scan = new Scanner(System.in);
                System.out.println("Lutfen bolunecek tam sayiyi giriniz : ");
                sayi1 = scan.nextInt();
                sayiIste = false;

            } catch (InputMismatchException e) {
                String temp = scan.next();
                System.out.println("Hatali giris yaptiniz tam sayi degeri girmelisiniz");
            }
        }


        sayiIste = true;
        int sayi2 = 0;

        while (sayiIste) {

            try {
                scan = new Scanner(System.in);
                System.out.println("Lutfen bolecek tam sayiyi giriniz : ");
                sayi2 = scan.nextInt();
                sayiIste = false;

            } catch (InputMismatchException e) {
                String temp = scan.next();
                System.out.println("Hatali giris yaptiniz tam sayi degeri girmelisiniz");
            }
        }

        try {
            System.out.println("Iki sayinin bolumu : " + sayi1/sayi2);

        } catch (ArithmeticException e) {

            System.out.println("Sifira bolunmez");
        }


    }
}
