package day16_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullanicidanIntListOlusturma {
    public static void main(String[] args) {
        // kullanicidan integer List olusturup donduren bir method olusturun

        System.out.println(listOlusturmaInteger());
    }
    public static List<Integer> listOlusturmaInteger(){
        // kullanicidan sayilar loop icinde alincak, loop sayisi bilinmedigi icin while kullanalim
        // kullanici 0`a basinca loop duracak
        Scanner scanner =new Scanner(System.in);
        int girilenSayi = 4;
        List<Integer> sayilar=new ArrayList<>();

        while (girilenSayi!=0){
            System.out.println("Lutfen sayi giriniz");
            girilenSayi= scanner.nextInt();
            if (girilenSayi!=0){
                sayilar.add(girilenSayi);
            }
        } return sayilar;

    }


}
