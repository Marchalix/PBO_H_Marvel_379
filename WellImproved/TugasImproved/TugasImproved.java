package WellImproved.TugasImproved;

import java.util.Scanner;

public class TugasImproved {
    public static void main(String[] args) {
        int pilihanAkhir;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("## ----- Selamat datang!! ----- ##");
            System.out.println("Silahkan pilih login!");
            System.out.println("Login:");
            System.out.println("1. Admin ");
            System.out.println("2. Mahasiswa");
            System.out.print("Masukkan pilihan: ");
            int pilihanMenu = input.nextInt();
            input.nextLine();

            while (pilihanMenu != 1 && pilihanMenu != 2) {
                System.out.println("Pilihan Tidak Valid!");
                System.out.print("\nMasukkan pilihan: ");
                pilihanMenu = input.nextInt();
                input.nextLine();
            }

            if (pilihanMenu == 1) {

                System.out.print("Masukkan NIM Lengkap: ");
                String nim = input.next();
                while (nim.length() != 15) {
                    input.nextLine();
                    System.out.println("NIM tidak valid! ");
                    System.out.print("\nMasukkan NIM Lengkap: ");
                    nim = input.next();
                }

                input.nextLine();
                String nimAdmin = nim.substring(12, 15);
                String usernameAdmin = "Admin" + nimAdmin;
                String passwordAdmin = "Password" + nimAdmin;
                String username;
                String password;

                do {
                    System.out.println("\nLogin:");
                    System.out.print("Masukkan username: ");
                    username = input.nextLine();
                    System.out.print("Masukkan password: ");
                    password = input.nextLine();

                    if (username.equalsIgnoreCase(usernameAdmin) && password.equalsIgnoreCase(passwordAdmin)) {
                        System.out.println("Login Success!");
                    } else {
                        System.out.println("Login Failed! Username atau Password salah!");
                    }

                } while (!(username.equalsIgnoreCase(usernameAdmin) && password.equalsIgnoreCase(passwordAdmin)));

            } else if (pilihanMenu == 2) {
                String namaMahasiswa = "Ayshea Marvella Pasha";
                String nimMahasiswa = "202410370110379";
                String nama;
                String nim;

                do {
                    System.out.println("\nLogin:");
                    System.out.print("Masukkan Nama: ");
                    nama = input.nextLine();
                    System.out.print("Masukkan NIM: ");
                    nim = input.nextLine();

                    if (nama.equalsIgnoreCase(namaMahasiswa) && nim.equals(nimMahasiswa)) {
                        System.out.println("Login Success!");
                        System.out.println("\nSelamat Datang!");
                        System.out.println("Nama Mahasiswa: " + nama);
                        System.out.println("NIM Mahasiswa: " + nim);

                    } else {
                        System.out.println("Login Failed! Nama atau NIM salah!");
                    }

                } while (!(nama.equalsIgnoreCase(namaMahasiswa) && nim.equals(nimMahasiswa)));

            } else {
                System.out.println("Pilihan Tidak Valid!");
            }

            System.out.println("\nSudah selesai?");
            System.out.println("1. Ganti akun");
            System.out.println("2. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihanAkhir = input.nextInt();

            if (pilihanAkhir == 2) {
                return;
            }

        } while (pilihanAkhir == 1);

        input.close();

    }

}

