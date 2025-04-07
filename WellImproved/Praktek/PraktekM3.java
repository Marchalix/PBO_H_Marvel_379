package WellImproved.Praktek;

class Mobil {
    String name;
    int speed;

    public Mobil() {
        System.out.println("Method constructor dieksekusi");
    }

    public Mobil(String name, int speed) {
        this.name = name;
        this.speed = speed;
        System.out.println("Method constructor dieksekusi");
    }
}

public class PraktekM3 {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();

        //without constructor
        Mobil mobil1 = new Mobil();
        Mobil mobil2 = new Mobil();
        Mobil mobil3 = new Mobil();
        Mobil mobil4 = new Mobil();
        Mobil mobil5 = new Mobil();

        mobil1.name = "Toyota Avanza";
        mobil1.speed = 160;
        mobil2.name = "Suzuki SX4 2007";
        mobil2.speed = 170;
        mobil3.name = "Mobil sedan";
        mobil3.speed = 210;
        mobil4.name = "BMW i8";
        mobil4.speed = 190;
        mobil5.name = "Bugatti Chiron";
        mobil5.speed = 240;

        //with constructor
        Mobil mobil6 = new Mobil("Toyota Avanza", 160);
        Mobil mobil7 = new Mobil("Suzuki SX4 2007", 170);
        Mobil mobil8 = new Mobil("Mobil sedan", 210);
        Mobil mobil9 = new Mobil("BMW i8", 190);
        Mobil mobil10 = new Mobil("Bugatti Chiron", 240);
        Mobil mobil11 = new Mobil("Porsche 911", 250);
    }
}
