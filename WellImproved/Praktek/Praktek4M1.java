package WellImproved.Praktek;

/*
 * Praktek untuk melihat fungsi API data dalam
 * bahasa pemrograman Java.
 */


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Praktek4M1 {
    public static void main(String[] args) {
        LocalDate timenow = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Waktu sekarang adalah: " + timenow.format(formatter));
        System.out.println("Bulan sekarang adalah: " + timenow.getMonthValue());

        System.out.println("Current date and time:: " + new Date());
    }
}
