package day20_passByValue_immutableClasses;

public class C01_PassByValue {
    public static void main(String[] args) {

        int sayi = 20;

        System.out.println("Method call sonucu : " + method1(sayi));
        System.out.println("Method call sonrasi sayi : " + sayi);

    }

    public static int method1(int sayi){

        sayi = 25;
        System.out.println("Method1 icinde sayi : " + sayi);

        return sayi;
    }
}
