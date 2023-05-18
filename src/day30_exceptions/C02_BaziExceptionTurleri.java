package day30_exceptions;

public class C02_BaziExceptionTurleri {
    public static void main(String[] args) {

        String str1 = null; // null bir deger degil pointer`dir.

        // System.out.println(str1.concat("JAVA")); // NullPointerException

        // StringIndexOutOfBoundsException
        // ArrayIndexOutOfBoundsException

        String a = "34" ; // 34a yazarsak valueof() bunu sayiya ceviremez ve exception firlatir
        String b = "55" ;
        // a ve b variable`larindaki sayilarin toplamini yazdirin

        int sonuc = Integer.valueOf(a)+Integer.valueOf(b); // NumberFormatException
        System.out.println(sonuc); // 89

        String str = "Nasil ama";
        Object obj = str;
        Integer sayi = (Integer) obj; // ClassCastException

        // FileNotFoundException
        // IOException
        // RunTimeException
        // Exception
        // ArithmeticException
        // InputMisMatchException

    }
}
