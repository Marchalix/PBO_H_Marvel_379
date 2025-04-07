package Codelab.Modul2;

class Hewan {
    //deklarasi atribut
    String nama, jenis, suara;

    //konstruktor untuk input atribut objek
    Hewan(String nama, String jenis, String suara) {
        //memastikan yang digunakan adalah variabel atribut kelas
        this.nama = nama;
        this.jenis = jenis;
        this.suara = suara;
    }

    //method tampilan info hewan
    void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Jenis: " + jenis);
        System.out.println("Suara: " + suara + "\n");
    }
}

public class Codelab1M2 {
    public static void main(String[] args) {
        //menginput objek beserta atributnya
        Hewan hewan1 = new Hewan("Kucing", "Mamalia", "Nyaw!");
        Hewan hewan2 = new Hewan("Anjing", "Mamalia", "Woof!");

        //output
        System.out.println("Mari belajar tentang hewan!");
        hewan1.tampilkanInfo();
        hewan2.tampilkanInfo();
    }
}

