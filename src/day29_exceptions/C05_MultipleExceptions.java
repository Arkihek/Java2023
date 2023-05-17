package day29_exceptions;

import java.util.Scanner;

public class C05_MultipleExceptions {

    /*
        Eger birden fazla exception olusma ihtimali varsa
        ve bu exception`lar arasinda parent-child iliskisi yoksa
        3 farkli yaklasim kullanabiliriz

        1- iki farkli exception ihtimali icin iki farkli try-catch olusturabiliriz
        2- 1 try 2 catch blogu olusturabiliriz
        3- 2 exception`i kapsayan tek bir exception varsa onu kullanarak 1 try - 1 catch ile sorunu cozerim

     */

    public static void main(String[] args) {

        // Elimizde input olarak verilmis bir String ve sayilardan olusan bir array var

        String str = "Java her seyi dusunmus";
        int[] sayilar = {1,2,4,5,1,2,3,6,8,5,4};

        // Kullanicidan 0 veya pozitif bir tamsayi isteyin
        // verilen tamsayiyi index olarak kullanip
        // String ve Array`den o index`deki harf ve sayiyi yazdirin


        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen index olarak 0 veya pozitif bir tamsayi giriniz : ");
        // Kullanici duzgun tamsayi girecek kabul edelim
        int index = scan.nextInt();

        // 1. Yontem
        // iki farkli exception ihtimali icin iki farkli try-catch olusturabiliriz

        /*
        System.out.print("Istenen index`deki degerler : ");

        try {
            System.out.print(str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.print("Verilen index String`in sinirlari disindadir.");
        }

        try {
            System.out.print(sayilar[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print(" Verilen index Array`in sinirlari disindadir.");
        }
         */

        // 2. Yontem
        // 1 try birden fazla catch oldugunda
        // bir catch calisinca otekilere bakmaz (If - else if - else gibi)


        /*
        try {
            System.out.print("Istenen index`deki degerler : " + str.charAt(index) + sayilar[index] );
        } catch (StringIndexOutOfBoundsException e) {
            System.out.print("Verilen index String`in sinirlari disindadir.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print(" Verilen index Array`in sinirlari disindadir.");
        }
         */

        // 3. Yontem
        // bu cozumde detay`a bakmadigimiz icin
        // iki exception`i da kapsayacak genel bir aciklama yazabiliriz

        try {
            System.out.print("Istenen index`deki degerler : " + str.charAt(index) + sayilar[index] );
        } catch (RuntimeException e) { // daha da genis olan Exception`da denebilir
            System.out.print("Verilen index input`un sinirlari disindadir.");
        }

    }
}
