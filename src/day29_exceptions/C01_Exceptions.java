package day29_exceptions;

import java.util.Scanner;

public class C01_Exceptions {
    public static void main(String[] args) {

        // Kullanicidan 2 tam sayi alip
        // ilk sayiyi ikinciye bolun
        // ve sonucun tamsayi kismini yazdirin


        /*
            kodlarimizi yazarken
            kullanici tarafindan yapilabilecek hatalari
            ONGOREBILIYORSAK Java`ya ongorebildigimiz hata
            ihtimalleri icin yapmasi gerekenleri soyleyebiliriz

            ornegin asagidaki bolme isleminde kullanicinin
            0 girme ihtimalini if else ile handle edebiliriz.

            Ancak tum sorunlari if else ile cozmek mumkun degildir
            ornegin istenen data turune uygun olmayan bir input girilmesini
            if-else ile cozemeyiz

            Java ONGORULEBILIR hatalari cozebilmemiz icin
            exception interface`ini olusturmustur.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bolunecek tam sayiyi giriniz : ");
        int sayi1 = scan.nextInt();
        System.out.println("Lutfen bolecek tam sayiyi giriniz : ");
        int sayi2 = scan.nextInt();

        if (sayi2==0){
            System.out.println("Sifira bolunmez");
        }else {
            System.out.println("Iki sayinin bolumu : " + sayi1/sayi2);
        }

    }
}
