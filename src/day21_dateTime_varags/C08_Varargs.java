package day21_dateTime_varags;

public class C08_Varargs {

    public static void main(String[] args) {

        // Verilen degisken sayidaki tamsayidan
        // ilkinin karesini, digerlerinin toplamiyla carpan bir method olusturun

        islemYap(2,2,5,2);
        islemYap(1,2);
        islemYap(0,5);
        islemYap(5);

        // varargs degisken sayida element kabul edebilen bir array oldugundan
        // 13. satirda yazilan islemde varargs eleman kalmaz, varargs = [] bos bir array olur
    }

    public static void islemYap(int ilkSayi ,int... geriyeKalanSayilar){
        int toplam = 0;

        for (int each : geriyeKalanSayilar
             ) {
            toplam += each;

        }

        System.out.println(ilkSayi*ilkSayi*toplam);
    }
}
