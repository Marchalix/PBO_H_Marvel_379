package WellImproved.Praktek;

/*
 * Praktek untuk melihat cara penggunaan engondisian dalam
 * bahasa pemrograman Java.
 */

import java.util.Scanner;

public class Praktek3M1 {
    public static void main(String[] args) {

        //switch case
        String warna = "merah";

        switch (warna) {
            case "merah":
                System.out.println("Warna Merah");
                break;
            case "biru":
                System.out.println("Warna Biru");
                break;
            default:
                System.out.println("Warna tidak diketahui");
        }

        //if-else
        int angka = 5;

        if (angka > 5) {
            System.out.println("Angka lebih besar dari 5");
        } else {
            System.out.println("Angka tidak lebih besar dari 5");
        }

        //if-else-if
        int nilai;
        String grade;
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();

        if (nilai >= 90) {
            grade = "A";
        } else if (nilai >= 80) {
            grade = "B+";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C+";
        } else if (nilai >= 50) {
            grade = "C";
        } else if (nilai >= 40) {
            grade = "D";
        } else {
            grade = "E";
        }

        System.out.println("Grade: " + grade);

        //nested if
        int belanjaan, diskon, bayar;
        String kartu;

        System.out.print("Apakah ada kartu member: ");
        kartu = input.next();
        System.out.print("Total Belanjaan: ");
        belanjaan = input.nextInt();

        if (kartu.equalsIgnoreCase("ya")) {
            if (belanjaan >= 500000) {
                diskon = 50000;
            } else if (belanjaan > 100000) {
                diskon = 15000;
            } else {
                diskon = 0;
            }
        } else {
            if (belanjaan >= 100000) {
                diskon = 5000;
            } else {
                diskon = 0;
            }
        }

        bayar = belanjaan - diskon;
        System.out.println("Total Bayar: Rp" + bayar);

        //for
        for (int i = 0; i < 10; i++) {
            System.out.print("Iterasi ke-" + i);
        }

        //for each
        int angka1[] = {3, 1, 42, 24, 12};

        for (int x : angka1) {
            System.out.print(x + " ");
        }

        //while
        int i = 0;

        while (i < 10) {
            System.out.print("Iterasi ke-" + i);
            i++;
        }

        //do-while
        int j = 0;
        do {
            System.out.print("Iterasi ke-" + j);
            j++;
        } while (i < 3);
    }
}
