package day17_constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class C01_Constructors {
    String str = "Constructors";
    int sayi = 10;
    static boolean isHappy=true;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String>                                         isimler      =      new           ArrayList<>();

        // Olusturmak istedigimiz datanin turu               Obje ismi    =      keyword       Constructor

        // Constructor bir class`dan obje olusturmamiz icin kullandigimiz ozel bir java yapisidir
        // Constructor method`a benzer ama method degildir.
    }
    public static void staticMethod(){
        System.out.println("C01 static method calisti");
    }
    public void staticOlmayanMethod(){
        System.out.println("C01 static olmayan method calisti");
    }
}
