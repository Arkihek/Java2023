package day11_mehodOverloading_whleLoop;

public class C04_MethodOverloading {
    public static void main(String[] args) {

        topla(4,5);
        topla('a','b');
        topla(3.2f,5.1f);
    }
    public static void topla(double sayi1,double sayi2){
        System.out.println("Iki double`in toplami : " + (sayi1+sayi2));
    }

    public static void topla(int sayi1, float sayi2){
        System.out.println("Int ve float`in toplami : " + (sayi1+sayi2) );
    }

    /*
        Java overloading yapilmis method`lardan hangisinin calisacagina
        karar verirken adim adim ilerler

        1 - Eger argument`ler ile parametreler tamamen uyumluysa onu calistirir
        2 - Eger argument ve parametreler %100 uyumlu degılse, casting yapabilir miyim diye bakar
        3 - casting ile calistircagi birden fazla method bulursa,
            en az casting ile calistiricagini tercih eder

     */
}
