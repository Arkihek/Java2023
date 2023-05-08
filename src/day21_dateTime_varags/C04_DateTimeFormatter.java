package day21_dateTime_varags;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm a");
        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d.M.yy HH:mm");

        LocalDateTime ts = LocalDateTime.now();

        System.out.println(ts); // 2023-04-25T12:18:04.806046100


        System.out.println(ts.format(dtf)); // 25/04/2023 12:19 ÖS
        System.out.println(ts.format(dtf1)); // 25/Nisan/2023 12:19
        System.out.println(ts.format(dtf2)); // 25.4.23 12:20


        /*
         format olustururken
         GUN
         d : basta 0 varsa onu yazmadan gun numarasi
         dd: tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
         DDD : yilin kacinci gunu oldugunu yazar
         E, EE, EEE : gun isminin ilk 3 harfi
         EEEE : gun isminin tamamini

         AY (Ay icin M, dakika icin m kullanilir)
         M : basta 0 varsa onu yazmadan ay numarasi
         MM:dd: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
         MMM : Ay isminin ilk 3 harfi
         MMMM : Ay isminin tamami

         yy : yilin son iki rakamini
         yyyy : Yilin tamamini


         Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)

         HH : saatin tamami, tek rakamli saat olursa 02 gibi
         H  : tek rakamli saat olursa sadece saati

         a yazarsak AM veya PM degerini yazar


         */

    }
}
