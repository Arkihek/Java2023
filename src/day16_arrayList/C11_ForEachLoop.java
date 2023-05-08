package day16_arrayList;

import java.util.Scanner;

public class C11_ForEachLoop {
    public static void main(String[] args) {
        // Soru 4- Kullanicidan bir cumle ve bir harf alin,
        // harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        // kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        // java
        //  1- split ile "" parcaliyoruz sonra array haline getiriyoruz
        //  2- for each loop ile harfler teker teker kontrol edilir
        //  3- istenilen harfe denk gelindiginde sayac bir arttirilir
        //  4- sayac 0 ise "harf cumlede kullanilmamis" sifirdan fazla ize kackere kullanildigi yazdirilir.


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String str = scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String arananHarf = scan.next();
        // String str = "Java ile her sey cok kolay";
       // String arananHarf = "a";
        int sayac = 0;
        //1- split ile "" parcaliyoruz sonra array haline getiriyoruz
        String[] arr = str.split("");

        //  2- for each loop ile harfler teker teker kontrol edilir
        for (String each : arr
        ) {
            //3- istenilen harfe denk gelindiginde sayac bir arttirilir
            if (each.equals(arananHarf)) {
                sayac++;
            }
        }
        //  4- sayac 0 ise "harf cumlede kullanilmamis" sifirdan fazla ize kackere kullanildigi yazdirilir.
        if (sayac==0){
            System.out.println("harf cumlede kullanilmamis");
        }else {
            System.out.println("Aranan harf cumle icinde " + sayac + " kere kullanilmis");
        }

    }
}
