package day21_dateTime_varags;

public class C07_Varargs {
    public static void main(String[] args) {

        topla(15, 4); // sayilar[] = {15,6}
        topla(1, 4, 5); // sayilar[] = {1, 4, 5}
        topla(1, 5, 6, 7); // sayilar[] = {1, 5, 6, 7}
        topla(1, 5, 6, 7, 9); // sayilar[] = {1, 5, 6, 7, 9}
        topla(5, 6, 7, 8, 9, 1, 5, 64, 5, 4, 78); // sayilar[] = {5, 6, 7, 8, 9, 1, 5, 64, 5, 4, 78}
        topla(5, 6, 7, 8, 9, 1, 5, 64, 5, 4, 78, 8, 9, 77, 8, 7, 4, 1); // sayilar[] = {5, 6, 7, 8, 9, 1, 5, 64, 5, 4, 78, 8, 9, 77, 8, 7, 4, 1}
    }
    public static void topla(int... sayilar){
        int toplam = 0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam += sayilar[i];
        }
        System.out.println("Verilen " + sayilar.length + " elementin toplami : " + toplam);

        /*
            Java`da int... , String... gibi variable data turunun yanina ... konursa
            uzunlugu degisken olan bir array ifade eder
            buna varargs denir (variety of arguments)
         */

    }
}
