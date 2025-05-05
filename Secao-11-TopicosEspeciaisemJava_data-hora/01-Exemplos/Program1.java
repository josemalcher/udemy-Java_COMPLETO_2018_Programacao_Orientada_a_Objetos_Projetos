
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program1 {

    public static void main(String[] args) {

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2);

        LocalDate d10 = LocalDate.of(2022, 07, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);

        System.out.println("d01 = " + d01.toString()); // d01 = 2025-05-05
        System.out.println("d02 = " + d02.toString()); // d02 = 2025-05-05T10:11:18.340711400
        System.out.println("d03 = " + d03.toString()); // d03 = 2025-05-05T13:11:18.340711400Z
        System.out.println("d04 = " + d04.toString()); // d04 = 2022-07-20
        System.out.println("d05 = " + d05.toString()); // d05 = 2022-07-20T01:30:26
        System.out.println("d06 = " + d06.toString()); // d06 = 2022-07-20T01:30:26Z
        System.out.println("d07 = " + d07.toString()); // d07 = 2022-07-20T04:30:26Z
        System.out.println("d08 = " + d08.toString()); // d08 = 2022-07-20
        System.out.println("d09 = " + d09.toString()); // d09 = 2022-07-20T01:30
        System.out.println("d10 = " + d10.toString()); // d10 = 2022-07-20
        System.out.println("d11 = " + d11.toString()); // d11 = 2022-07-20T01:30
    }
}