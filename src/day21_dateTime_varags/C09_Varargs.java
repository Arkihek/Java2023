package day21_dateTime_varags;

public class C09_Varargs {
    public static void main(String[] args) {
        // son elementi ayirabilecegimiz bir method olusturalim

        islemYap(3,4,5);
    }

    public static void islemYap(int... bastakiSayilar){ // int sonSayi olamiyor hata veriyor
        // varargs eleman alirken sinir tanimadigi icin, ne kadar elaman varsa almaya calisir
        // kendisinden sonraki parametrelere eleman birakmaz
        // Bundan dolayi bir method`da parametre olarak varargs kullanilacaksa
        // EN SONDA KULLANILMALIDIR

        // Bu mantikla bir method`da birden fazla VARARGS KULLANILAMAZ
    }
}
