package day21_dateTime_varags;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C05_Period {

    public static void main(String[] args) {

        LocalDate dogumTarihi = LocalDate.of(1995,8,9);
        LocalDate bugun = LocalDate.now();

        Period yas = Period.between(dogumTarihi,bugun);
        System.out.println(yas); //P 27Y 8M 16D

        System.out.println("Ihsan`in yasi : " + yas.getYears()); // Enes`in yasi : 27
    }
}
