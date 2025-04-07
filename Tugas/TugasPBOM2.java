package Tugas;

import java.util.Scanner;

class inputScanner {
    static Scanner input = new Scanner(System.in);
}

class Admin {
    static String nim, nimAdmin, usernameAdmin, passwordAdmin, username, password;

    //Meminta input nim
    static void inputNim() {
        do {
            System.out.print("Masukkan NIM Lengkap: ");
            nim = inputScanner.input.nextLine();

            //Kondisi jika nim tidak valid
            if (nim.length() != 15) {
                System.out.println("NIM tidak valid!\n");
            }
        } while (nim.length() != 15);

        nimAdmin = nim.substring(12, 15);
        usernameAdmin = "Admin" + nimAdmin;
        passwordAdmin = "Password" + nimAdmin;
    }

    //Meminta input data admin
    static void loginAdmin() {
        System.out.println("\nLogin:");
        System.out.print("Masukkan Username: ");
        username = inputScanner.input.nextLine();
        System.out.print("Masukkan Password: ");
        password = inputScanner.input.nextLine();

        //Pengkondisian input data admin valid atau tidak
        if (username.equalsIgnoreCase(usernameAdmin) && password.equalsIgnoreCase(passwordAdmin)) {
            System.out.println("Login Success!");
            System.out.println("\nSelamat Datang " + usernameAdmin);
        } else {
            System.out.println("Login Failed! Username atau Password salah!");
        }
    }
}

class Mahasiswa {
    static String namaMahasiswa, nimMahasiswa, nama, nim;

    //Meminta input data mahasiswa
    static void loginMahasiswa() {
        namaMahasiswa = "Ayshea Marvella Pasha";
        nimMahasiswa = "202410370110379";

        System.out.println("\nLogin:");
        System.out.print("Masukkan Nama: ");
        nama = inputScanner.input.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = inputScanner.input.nextLine();
    }

    static void displayMahasiswa() {
        //Pengkondisian data mahasiswa valid atau tidak
        if (nama.equalsIgnoreCase(namaMahasiswa) && nim.equals(nimMahasiswa)) {
            System.out.println("Login Success!");
            System.out.println("\nSelamat Datang!");
            System.out.println("Nama Mahasiswa: " + namaMahasiswa);
            System.out.println("NIM Mahasiswa: " + nimMahasiswa);
        } else {
            System.out.println("Login Failed! Nama atau Nim salah!");
        }
    }
}

public class TugasPBOM2 {
    public static void main(String[] args) {
        int pilihanMenu;

        //Menampilkan menu
        System.out.println("## ----- Selamat datang!! ----- ##");
        System.out.println("Silahkan pilih login!");
        System.out.println("Login:");
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa");

        do {
            System.out.print("Masukkan pilihan: ");
            pilihanMenu = inputScanner.input.nextInt();
            inputScanner.input.nextLine();

            switch (pilihanMenu) {
                case 1:
                    Admin admin = new Admin();
                    admin.inputNim();
                    admin.loginAdmin();
                    break;
                case 2:
                    Mahasiswa mahasiswa = new Mahasiswa();
                    mahasiswa.loginMahasiswa();
                    mahasiswa.displayMahasiswa();
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid!\n");
            }
        } while (pilihanMenu != 1 && pilihanMenu != 2);

        inputScanner.input.close();
    }
}
