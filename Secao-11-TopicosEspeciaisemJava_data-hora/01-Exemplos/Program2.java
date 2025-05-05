
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program2 {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("d04 = " + d04.format(fmt1));// d04 = 20/07/2022
        System.out.println("d04 = " + fmt1.format(d04));// d04 = 20/07/2022
        System.out.println("d04 = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); // d04 = 20/07/2022

        System.out.println("d05 = " + d05.format(fmt1)); // d05 = 20/07/2022
        System.out.println("d05 = " + d05.format(fmt2)); // d05 = 20/07/2022 01:30
        System.out.println("d05 = " + d05.format(fmt4)); // d05 = 2022-07-20T01:30:26

        System.out.println("d06 = " + fmt3.format(d06)); // d06 = 19/07/2022 22:30
        System.out.println("d06 = " + fmt5.format(d06)); // d06 = 2022-07-20T01:30:26Z
        System.out.println("d06 = " + d06.toString());   // d06 = 2022-07-20T01:30:26Z
    }
}