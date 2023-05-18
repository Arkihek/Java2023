package day30_exceptions;

import java.util.Scanner;

public class C03_illegalArgumentException {

    public static void main(String[] args) {

        // kullanicidan yasini alip
        // 65`den buyukse emekli olabilecegini yazdirin
        // eger kullanici 20`den kucuk bir yas girerse
        // exception firlatin ve emeklilik islemleri olan kodlari atlayin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas = scan.nextInt();

        try {
            if (yas<20){
                throw new IllegalArgumentException("Yas 20`den kucuk olamaz");
            } else if (yas<65) {
                System.out.println("Emekli olmaniza " +( 65-yas) + " sene var");
            } else {
                System.out.println("Emekli olabilirsiniz");
            }

            System.out.println("Emeklilik islemleri 1");
            System.out.println("Emeklilik islemleri 2");
            System.out.println("Emeklilik islemleri 3");
        /*
            burada da 30 satir emeklilik ile ilgili islemler olsun
         */

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
