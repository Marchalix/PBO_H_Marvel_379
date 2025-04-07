package Codelab.Modul1;

import java.util.Scanner; //untuk mengambil input
import java.time.LocalDate; //untuk mengambil tanggal

public class Codelab1M1 { //mendeklarasi kelas utama program
    public static void main(String[] args) { //untuk mengeksekusi program
        String nama; //mendeklarasi nama dalam bntuk String
        String jenisKelamin; //mendeklarasi jenis kelamin dalam bentuk String
        int tahunLahir; //mendeklarasi tahun lahir dalam bentuk integer
        Scanner input = new Scanner(System.in); //mendeklarasi input untuk membaca

        System.out.print("Masukkan nama: "); //mencetak untuk meminta nama
        nama = input.nextLine(); //membaca input nama
        System.out.print("Masukkan jenis kelamin (P/L): "); //mencetak untuk meminta jenis kelamin
        jenisKelamin = input.nextLine(); //membaca input jenis kelamin
        System.out.print("Masukkan tahun lahir: "); //mencetak untuk meminta tahun lahir
        tahunLahir = input.nextInt(); //membaca input tahun lahir

        System.out.println("Data Diri: "); //mencetak judul
        System.out.println("Nama\t\t: " + nama); //mencetak nama yang diinputkan
        if (jenisKelamin.equals("P") || jenisKelamin.equals("p")) { //pengondisian P kecil maupun besar
            System.out.println("Jenis Kelamin\t: Perempuan"); //akan mencetak Perempuan
        } else if (jenisKelamin.equals("L") || jenisKelamin.equals("l")) { //pengondisian L kecil maupun besar
            System.out.println("Jenis Kelamin\t: Laki-laki"); //akan mencetak Laki-laki
        } else{ //pengondisian lainnya
            System.out.println("Jenis Kelamin\t: Tidak Valid"); //akan mencetak tidak valid
        }

        int now = LocalDate.now().getYear(); //mendeklarasi variabel baru untuk menghitung umur dengan mengambil tahun
        System.out.print("Umur\t\t: " + (now - tahunLahir)); //mencetak umur dari mengurangi tahun sekarang dikurang tahun lahir

    }
}