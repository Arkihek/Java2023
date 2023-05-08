package day11_mehodOverloading_whleLoop;

public class C03_MethodOverloading {
    public static void main(String[] args) {

        /*   overloading : asiri yukleme
             Bir class`da ayni isme sahip birden fazla method olmasina denir

             Java`da bir class icirisinde ayni isim, ayni sayida ve data turunde parametre ile
             olusturulursa java CTE verir.

             Bunun 3 cozumu vardir
             1 - Parametre sayisi degistirilebilir
             2 - Parametrelerin data turleri degistirilebilir
             3 - Farkli data turundeki parametrelerin yeri degistirilebilir

             Java bir method call oldugunda ayni isimdeki birden fazla method`dan
             hangisinin calisacagini belirlemek icin argument - parametre uyumuna bakar.

         */
        topla(5,8.12); // 13.12
        topla(3,4); // 7
        topla('a','b'); // 195
        topla(3.4,5); // 8.4
    }
    public static void topla (int sayi1, int sayi2){
        System.out.println("Iki int`in toplami : "+ (sayi1+sayi2));
    }

    public static void topla (int a, int b, int c){
        System.out.println("Uc int`in toplami : "+ (a+b+c));
    }
    public static void topla (char char1, char char2){
        System.out.println("Iki char`in toplami : "+ (char1+char2));
    }
    public static void topla (int sayi1, double sayi2){
        System.out.println("Int ve double iki sayinin toplami : "+ (sayi1+sayi2));
    }
    public static void topla (double sayi1, int sayi2){
        System.out.println("Double ve int iki sayinin toplami : "+ (sayi1+sayi2));
    }

}
