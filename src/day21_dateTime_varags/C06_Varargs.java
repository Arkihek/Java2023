package day21_dateTime_varags;

public class C06_Varargs {

    public static void main(String[] args) {

        // iki tamsayiyi toplayip yazdiran bir method olusturun
        topla(15, 4);
        topla(1, 4, 5);
        topla(1, 5, 6, 7);
        // topla(1, 5, 6, 7,9);
        // topla(5,6,7,8,9,1,5,64,5,4,78);
        // topla(5,6,7,8,9,1,5,64,5,4,78,8,9,77,8,7,4,1);
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("Sayilarin toplami : " + (sayi1 + sayi2 + sayi3 + sayi4));
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("Sayilarin toplami : " + (sayi1 + sayi2 + sayi3));
    }

    private static void topla(int sayi1, int sayi2) {
        System.out.println("Sayilarin toplami : " + (sayi1 + sayi2));
    }
}
