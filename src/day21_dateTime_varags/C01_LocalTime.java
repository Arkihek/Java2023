package day21_dateTime_varags;

import java.time.LocalTime;

public class C01_LocalTime {

    public static void main(String[] args) {

        LocalTime saat = LocalTime.now();

        // Calistigi anda sistemde var olan zamani alip saat variable`na kaydeder.
        // Kronometre gibi calismaz. Sadece 9. satirin calistigi zamani kaydeder.
        // Eger farkli satirlarin calisma zamanlarini gormek istersek
        // o satirlarda da yeni localTime objeleri olusturmaliyiz.

        System.out.println(saat); // 11:04:48.067809300
        // zamani saat,dakika,saniye ve nano saniye olarak kaydeder.

        System.out.println(saat.getNano());
        System.out.println(saat.getHour());
        // get() lari bize saatin istedigimiz bolumunu getirir

        System.out.println(saat.withNano(10)); // 11:10:06.000000010
        System.out.println(saat.withHour(23)); // 23:10:06.330517500
        System.out.println(saat.withHour(11).withMinute(11).withSecond(11).withNano(11)); // 11:11:11.000000011
        // with() lari saatin istedimiz bolumunu istedigimiz yeni bir deger ile degistirerek zamani verir

        System.out.println(saat.plusHours(100)); // 15:12:44.402092200
        System.out.println(saat.plusMinutes(10000)); // 09:53:46.180445200
        System.out.println(saat.minusHours(37).minusMinutes(60));
        // plus() ve minus() saati istedigimiz miktarda ileri ve geri goturur

        // istedigimiz saat, dakika, saniye ve nanosaniye ile zaman variable`i olusturmak istersek

        LocalTime istenenZaman = LocalTime.of(22,22,22,22);
        System.out.println(istenenZaman); // 22:22:22.000000022

        // iki zamani birbiriyle karsilastirmak istersek
        System.out.println(istenenZaman.isAfter(saat)); // true
        System.out.println(saat.isBefore(istenenZaman)); // true

        System.out.println(saat.compareTo(istenenZaman)); // -1
        System.out.println(istenenZaman.compareTo(saat)); // 1
        // iki zamani karsilastirir kucukse negatif, buyukse pozitif bilgi doner.



    }
}
