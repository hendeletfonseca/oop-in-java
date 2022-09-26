package app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {

    public static void main(String[] args) {

    LocalDate d01 = LocalDate.now();
    LocalDateTime d02 = LocalDateTime.now(); //
    Instant d03 = Instant.now();

    LocalDate d04 = LocalDate.parse("2022-09-19");
    LocalDateTime d05 = LocalDateTime.parse("2022-09-19T01:08:26");

    System.out.println("do1 = " + d01.toString());
    System.out.println("d02 = " + d02.toString());
    System.out.println("d03 = " + d03.toString());
    System.out.println("do4 = " + d04.toString());
    System.out.println("do5 = " + d05.toString());
    }
}
