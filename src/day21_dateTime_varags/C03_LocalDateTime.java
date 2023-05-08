package day21_dateTime_varags;

import java.time.LocalDateTime;

public class C03_LocalDateTime {

    public static void main(String[] args) {

        LocalDateTime ts = LocalDateTime.now();

        System.out.println(ts); // 2023-04-25 T 12:05:08.419813400

        // tarih ve saati su sekilde yazdirin;
        // 25/04/2023 11:04

        System.out.println(ts.getDayOfMonth()+ "/" + ts.getMonthValue() + "/" + ts.getYear() + " "+
                ts.getHour() + ":" + ts.getMinute()); // 25/4/2023 12:8

        System.out.println(ts.plusHours(100)); //2023-04-29 T 16:09:49.340672800

    }
}
