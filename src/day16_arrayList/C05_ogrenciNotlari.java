package day16_arrayList;

import java.util.List;

public class C05_ogrenciNotlari {
    public static void main(String[] args) {

        // ogretmenden alinan ogrenci notlarinin ortalamasini ve
        // kac ogrencinin ortalamainin ustunde not aldigini bize ulastiran bir method yazin

        List<Integer> notlarListesi = C04_KullanicidanIntListOlusturma.listOlusturmaInteger();

        notOrtVeOrtUstOgrenciSayisi(notlarListesi);
        System.out.println(notlarListesi);
    }

    public static void notOrtVeOrtUstOgrenciSayisi(List<Integer> notlarListesi) {

        // not ortalamasi
        // not ortalamasi uzerindeki ogrenci sayisi
        int toplamNot = 0;
        int ortNot = 0;
        int sayac = 0;

        // toplam not hesaplama
        for (int i = 0; i < notlarListesi.size(); i++) {
            toplamNot += notlarListesi.get(i);
        }

        // not ortalamasi hesaplama
        ortNot = toplamNot / notlarListesi.size();

        // Ortalama ustu kac kisi var
        for (int i = 0; i < notlarListesi.size(); i++) {
            if (notlarListesi.get(i)>=ortNot){
                sayac++;
            }
        }


        System.out.println("Siniftaki ogrenci sayisi : "+ notlarListesi.size());
        System.out.println("Sinifin ortalama notu : " + ortNot);
        System.out.println("Sinifta ortalama not ustu ogrenci sayisi : " + sayac);

    }
}
