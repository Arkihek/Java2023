package day20_passByValue_immutableClasses;

import java.time.LocalTime;
import java.time.ZoneId;

public class C06_LocalTime {

    public static void main(String[] args) {

        /*
            Java`da zaman ve tarih iole ilgili pek cok class vardir
            Biz 3 class gorucegiz
            - LocalTime class`i saat ile ilgili method`lar icerir

         */

        LocalTime saatBaslangic = LocalTime.now();
        // LocalTime.now() bulundugu satir calistiginda bilgisayarin saatini alip kaydeder
        // Saat variable`i canli bir kronometre degil,
        // bulundugu satirin calistigi zamani kaydeden bir variabledir.
        System.out.println(saatBaslangic); // 13:44:35.850437700

        int toplam = 0;

        for (int i = 0; i <= 50000 ; i++) {
            toplam+=i;
        }

        System.out.println(toplam); // 1250025000

        System.out.println(saatBaslangic); // 13:44:35.850437700

        LocalTime saatBitis = LocalTime.now();
        System.out.println(saatBitis); // 13:44:35.850946100

        LocalTime saat = LocalTime.now(ZoneId.of("Japan"));
        System.out.println(saat); // 19:44:35.850946100

        LocalTime saat2 = LocalTime.of(00,30,55);
        System.out.println(saat2); // 00:30:55

        LocalTime saat3 = LocalTime.ofSecondOfDay(3600);
        System.out.println(saat3); // 01:00
    }
}
