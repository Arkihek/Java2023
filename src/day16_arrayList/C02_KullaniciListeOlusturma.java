package day16_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C02_KullaniciListeOlusturma {

    public static void main(String[] args) {

        // kullanicidan alinan isimleri listeye kaydeden bir method olusturun.

        System.out.println(listOlusturmaString());

    }
        // method stringlernden olusan bir list dondurecek "List<String>"
    public static List<String> listOlusturmaString(){

        Scanner scan = new Scanner(System.in);
        // loop sayisi bilinmiyorsa do while veya while loop kullanilir
        // kullanici isim yerine 0 girince program dursun

        String kullaniciGirdisi = "";
        List<String> isimler = new ArrayList<>();

        // kullaniciGirdisi "0" a esit olmadigi surece loo[ devam etsin
        while (!kullaniciGirdisi.equalsIgnoreCase("0")){
            System.out.println("Lutfen olusturmak istediginiz List icin bir isim girin. Bitirmek isterseniz 0`a basin");
            kullaniciGirdisi = scan.next();
            // eger kullaniciGirdisi 0`a esit degilse listeye ekleme yap
            if (!kullaniciGirdisi.equalsIgnoreCase("0")){
                isimler.add(kullaniciGirdisi);
            }


        }return isimler;
    }

}
