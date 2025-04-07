package Codelab.Modul2;

class RekeningBank {
    //deklarasi atribut
    String nomerRekening, namaPemilik;
    double jumlah, saldo;

    //konstruktor untuk input atribut objek
    RekeningBank(String nomerRekening, String namaPemilik, double saldo) {
        //memastikan yang digunakan adalah atribut kelas
        this.nomerRekening = nomerRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    //method tampilan info rekening
    void tampilkanInfo(){
        System.out.println("Nomer Rekening: " + nomerRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo + "\n");
    }

    //method input saldo
    void setorUang (double jumlah) {
        System.out.println(namaPemilik + " menyetor: Rp" + jumlah);
        //menambah saldo yg diinput ke dlm jumlah
        saldo += jumlah;
        System.out.println("Saldo sekarang: Rp" + saldo + "\n");
    }

    //method tarik saldo
    void tarikUang (double jumlah) {
        //pengondisian saldo cukup
        if (saldo > jumlah) {
            System.out.println(namaPemilik + " menarik " + jumlah + " (Barhasil)");
            //mengurangi saldo yg ada dlm jumlah
            saldo -= jumlah;
            System.out.println("Saldo sekarang: Rp" + saldo + "\n");
        //pengondisian saldo tidak cukup
        } else {
            System.out.println(namaPemilik + " menarik " + jumlah + " (Gagal, saldo tidak mencukupi)");
            System.out.println("Saldo sekarang: Rp" + saldo + "\n");
        }
    }
}

public class Codelab2M2 {
    public static void main(String[] args) {
        //menginput objek beserta atributnya
        RekeningBank rekening1 = new RekeningBank("202410370110379", "Marvel", 500000.0);
        RekeningBank rekening2 = new RekeningBank("235020407111016", "Gifari", 5000000.0);

        //output tampilan info rekening
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        //output setelah input saldo
        rekening1.setorUang(20000.0);
        rekening2.setorUang(200000.0);

        //output setelah tarik saldo
        rekening1.tarikUang(700000.0);
        rekening2.tarikUang(500000.0);

        //output menampilkan kembali info rekening terbaruss
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}
