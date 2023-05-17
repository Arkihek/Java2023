package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_tryCatch {
    public static void main(String[] args) {
        // Kullanicidan 2 tam sayi alip
        // ilk sayiyi ikinciye bolun
        // ve sonucun tamsayi kismini yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bolunecek tam sayiyi giriniz : ");

        int sayi1 = 0;
        try {
            sayi1 = scan.nextInt();
        } catch (InputMismatchException e) {

            System.out.println("Hatali giris yaptiniz tam sayi degeri girmelisiniz");

        }

        System.out.println("Lutfen bolecek tam sayiyi giriniz : ");

        int sayi2 = 0;
        try {
            sayi2 = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Hatali giris yaptiniz tam sayi degeri girmelisiniz");
        }


        /*
            Kodumuzu yazarken
            bir exception olusma ihtimali goruyorsak
            sorun cikmasi muhtemel kodumuzu
            try-catch ile cevreleriz(surround)

            try-catch temel 3 bolumden olusur
            1- try blogu : exception olusmasi muhtemel kodlarin konuldugu bolum
            2- catch (Exception e) : catch keyword ve beklenen exception turunu yazdigimiz bolum
            3- catch blogu : ongordugumuz exception olustugunda
                             Calismasini istedigimiz kodlar.

            Kullanicinin yapmasi muhtemel
            hatalari tamamiyle ayiklamak icin
            genis kapsamli dusunup
            tum ihtimalleri cozmek gerekir.



         */


        try {
            System.out.println("Iki sayinin bolumu : " + sayi1/sayi2);

        } catch (ArithmeticException e) {

            System.out.println("Sifira bolunmez");
        }

    }
}
