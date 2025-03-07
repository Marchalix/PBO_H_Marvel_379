package Tugas;

import java.util.Scanner;

public class TugasPBO {
    public static void main(String[] args) {
        //Mendeklarasi scanner
        Scanner input = new Scanner(System.in);

        //Menampilkan menu
        System.out.println("## ----- Selamat datang!! ----- ##");
        System.out.println("Silahkan pilih login!");
        System.out.println("Login:");
        System.out.println("1. Admin ");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihanMenu = input.nextInt();
        input.nextLine();

        //Perulangan pada kondisi jika input tidak valid
        while (pilihanMenu != 1 && pilihanMenu != 2) {
            System.out.println("Pilihan Tidak Valid!");
            System.out.print("\nMasukkan pilihan: ");
            pilihanMenu = input.nextInt();
            input.nextLine();
        }

        //Pengkoondisian pilihan valid 1 (Admin)
        if (pilihanMenu == 1) {

            //Meminta nim
            System.out.print("Masukkan NIM Lengkap: ");
            String nim = input.next();
            input.nextLine();

            //Kondisi jika nim tidak valid
            if (nim.length() != 15) {
                System.out.println("NIM tidak valid! ");
            }

            //Mendeklarasi variabel username & password admin
            String nimAdmin = nim.substring(12, 15);
            String usernameAdmin = "Admin" + nimAdmin;
            String passwordAdmin = "Password" + nimAdmin;

            //Meminta input data admin
            System.out.println("\nLogin:");
            System.out.print("Masukkan username: ");
            String username = input.nextLine();
            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            //Pengkondisian input data admin valid atau tidak
            if (username.equalsIgnoreCase(usernameAdmin) && password.equalsIgnoreCase(passwordAdmin)) {
                System.out.println("Login Success!");
            } else {
                System.out.println("Login Failed! Username atau Password salah!");
            }

        //Pengkondisian pilihan valid 2 (Mahasiswa)
        } else if (pilihanMenu == 2) {
            String namaMahasiswa = "Ayshea Marvella Pasha";
            String nimMahasiswa = "202410370110379";

            //Meminta input data mahasiswa
            System.out.println("\nLogin:");
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            //Pengkondisian data mahasiswa valid atau tidak
            if (nama.equalsIgnoreCase(namaMahasiswa) && nim.equals(nimMahasiswa)) {
                System.out.println("Login Success!");
                System.out.println("\nSelamat Datang!");
                System.out.println("Nama Mahasiswa: " + namaMahasiswa);
                System.out.println("NIM Mahasiswa: " + nimMahasiswa);

            } else {
                System.out.println("Login Failed! Nama atau NIM salah!");
            }
        }
        input.close();
    }
}
