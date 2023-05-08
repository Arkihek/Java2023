package day13_arrays;

public class C08_ArraydeElemanArama {
    public static void main(String[] args) {
        //Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        String[] sinifListesi = {"Saida", "Isa", "Asil", "Kubra", "Elif"};
        String arananIsim = "isa";

        arrayElemanBul(sinifListesi,arananIsim);
    }
    public static String[] arrayElemanBul(String[] sinifListesi, String arananIsim){
        int sayac = 0;

        for (int i = 0; i < sinifListesi.length; i++) {
            if (sinifListesi[i].equalsIgnoreCase(arananIsim)){
                sayac++;
            }
                 }if (sayac==0){
                     System.out.println("Aradiginiz isim yok.");
            } else{
                System.out.println("Aradiginiz isim var." + sayac +" adet bu isimden var.");
        }


        return sinifListesi;
    }
}
