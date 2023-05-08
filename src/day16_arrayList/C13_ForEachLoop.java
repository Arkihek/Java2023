package day16_arrayList;

import java.util.List;
import java.util.Scanner;

public class C13_ForEachLoop {

    public static void main(String[] args) {

        /*
            Stringlerden olusan bir list icindeki kelimelerden a harfi iceren kelimeleri yazdirin
         */
        // daha onceden hazirladigimiz kullanici liste olusturma methoduyla listeyi olusturuyoruz.
        List<String> liste = C02_KullaniciListeOlusturma.listOlusturmaString();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        String arananHarf = scanner.next();

        for (String each : liste
             ) {
            if (each.contains(arananHarf)){
                System.out.println(each);
            }
        }
    }
}
