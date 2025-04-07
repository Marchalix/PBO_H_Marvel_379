package WellImproved.CodelabImproved.Modul1Improved;

import java.time.LocalDate;
import java.util.Scanner;

import static WellImproved.CodelabImproved.Modul1Improved.DataDiri.menu;

class DataDiri {
    static Scanner input = new Scanner(System.in);
    static String nama, jenisKelamin, pilihanMenu, pilihanUbahData;
    static int tahunLahir;

    static void inputData() {
        System.out.println("\nSilahkan isi data diri anda!");
        System.out.print("Masukkan nama: ");
        nama = input.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        jenisKelamin = input.nextLine();

        while (!(jenisKelamin.equalsIgnoreCase("P") || jenisKelamin.equalsIgnoreCase("L"))) {
            System.out.println("\nInput Tidak Valid");
            System.out.print("Masukkan jenis kelamin (P/L): ");
            jenisKelamin = input.nextLine();
        }

        System.out.print("Masukkan tahun lahir: ");
        tahunLahir = input.nextInt();
        input.nextLine();

        while (tahunLahir < 1000 || tahunLahir > 2025) {
            System.out.println("\nInput Tidak Valid");
            System.out.print("Masukkan tahun lahir: ");
            tahunLahir = input.nextInt();
            input.nextLine();
        }
        System.out.print("\n");
        menu();
    }

    static void tampilkanData() {
        System.out.println("\nData diri anda:");
        System.out.println("Nama\t\t\t: " + nama);
        if (jenisKelamin.equalsIgnoreCase("P")) {
            System.out.println("Jenis Kelamin\t: Perempuan");
        } else if (jenisKelamin.equalsIgnoreCase("L")) {
            System.out.println("Jenis Kelamin\t: Laki-laki");
        } else {
            System.out.println("Jenis Kelamin\t: Tidak Valid");
        }

        int now = LocalDate.now().getYear();
        System.out.print("Umur\t\t\t: " + (now - tahunLahir));

    }

    static void menuUbahData() {
        System.out.println("\nApa yang ingin anda ubah?");
        System.out.println("1. Nama");
        System.out.println("2. Jenis Kelamin");
        System.out.println("3. Tahun Lahir");
        System.out.println("Pilihan: ");
        pilihanUbahData = input.nextLine();
    }

    static void ubahData() {
        menuUbahData();
        switch (pilihanUbahData) {
            case "1":
                System.out.print("Masukkan nama: ");
                nama = input.nextLine();
                break;
            case "2":
                System.out.print("Masukkan jenis kelamin: ");
                jenisKelamin = input.nextLine();
                break;
            case "3":
                System.out.print("Masukkan tahun lahir: ");
                tahunLahir = input.nextInt();
                break;
            default:
                System.out.println("\nData tidak valid");
                menuUbahData();
                break;
        }

    }

    static void tampilanMenu() {
        System.out.println("Pilih menu:");
        System.out.println("1. Tambah Data");
        System.out.println("2. Tampilkan Data");
        System.out.println("3. Ubah Data");
        System.out.println("4. Keluar");
        System.out.print("Pilihan: ");
        pilihanMenu = DataDiri.input.nextLine();
    }

    static void menu() {
        DataDiri.tampilanMenu();
        switch (pilihanMenu) {
            case "1":
                inputData();
                break;
            case "2":
                if (DataDiri.nama == null || DataDiri.nama.trim().isEmpty()) {
                    System.out.println("\nData tidak ada, tambah data terlebih dahulu!");
                    System.out.print("\n");
                    menu();
                } else {
                    tampilkanData();
                    System.out.println("\n");
                    menu();
                }
            case "3":
                if (DataDiri.nama == null || DataDiri.nama.trim().isEmpty()) {
                    System.out.println("\nData tidak ada, tambah data terlebih dahulu!");
                    System.out.print("\n");
                    menu();
                } else {
                    ubahData();
                    menu();
                }
            case "4":
                break;
            default:
                System.out.print("input tidak valid");
                System.out.print("\n");
                tampilanMenu();
        }

    }
}

public class Codelab1Modul1Improved {
    public static void main(String[] args) {
        menu();

    }
}


