package Codelab.Modul3;

class KarakterGame {
    private String nama;
    private int kesehatan;

    // Constructor untuk inisialisasi nama dan kesehatan
    public KarakterGame(String nama, int kesehatan) {
        this.nama = nama;
        this.kesehatan = kesehatan;
    }

    // Getter dan setter untuk nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter untuk kesehatan
    public int getKesehatan() {
        return kesehatan;
    }

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }

    // Method serang yang akan di-override oleh subclass
    public void serang(KarakterGame target) {
    }
}

class Pahlawan extends KarakterGame {
    // Constructor untuk Pahlawan
    public Pahlawan(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Override method serang untuk Pahlawan
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Orbital Strike!");
        target.setKesehatan(target.getKesehatan() - 20);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}

class Musuh extends KarakterGame {
    // Constructor untuk Musuh
    public Musuh(String nama, int kesehatan) {
        super(nama, kesehatan);
    }

    // Override method serang untuk Musuh
    @Override
    public void serang(KarakterGame target) {
        System.out.println(getNama() + " menyerang " + target.getNama() + " menggunakan Snake Bite!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println("Kesehatan " + target.getNama() + " sekarang: " + target.getKesehatan());
    }
}

public class Codelab1M3 {
    public static void main(String[] args) {
        // Objek karakter
        KarakterGame karakterUmum = new KarakterGame("Karakter Umum", 100);
        Pahlawan pahlawan = new Pahlawan("Brimstone", 150);
        Musuh musuh = new Musuh("Viper", 200);

        // Menampilkan status awal kesehatan
        System.out.println("Status Awal Kesehatan:");
        System.out.println(pahlawan.getNama() + " Kesehatan: " + pahlawan.getKesehatan());
        System.out.println(musuh.getNama() + " Kesehatan: " + musuh.getKesehatan());
        System.out.println(karakterUmum.getNama() + " Kesehatan: " + karakterUmum.getKesehatan());
        System.out.println();

        // Simulasi pertarungan
        System.out.println("Mulai Pertarungan!");

        // Brimstone menyerang Viper
        pahlawan.serang(musuh);

        // Viper menyerang Brimstone
        musuh.serang(pahlawan);
    }
}