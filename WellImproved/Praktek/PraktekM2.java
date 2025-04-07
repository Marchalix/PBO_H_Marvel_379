package WellImproved.Praktek;

class Car {
    String merk, model, spekMesin, transmisi;
    int tahun;

    static void menyalakanMesin() {
        System.out.println("Mesin Mobil Menyala");
    }

    String mengemudi(String arah) {
        return "Mobil bergerak ke arah: " + arah;
    }

    static String mengerem() {
        return "Berhenti";
    }

    int topSpeed(int topSpeed) {
        return topSpeed;
    }
}

class classKedua {
    static void callStaticMethod() {
        System.out.println("Hola ini adalah class kedua dengan static method");
    }

    void callNonStaticMethod() {
        System.out.println("Hola ini adalah class kedua dengan non-static method");
    }
}

public class PraktekM2 {
    public static void main(String[] args) {
        System.out.println(Car.mengerem());

        //penggunaan static & nonstatic
        classKedua.callStaticMethod();

        classKedua objectClassPertama = new classKedua();
        objectClassPertama.callNonStaticMethod();

        Car car = new Car();
        Car.menyalakanMesin();

        //penggunaan object
        car.merk = "Honda";
        car.model = "X100";

        System.out.println(car.merk);
        System.out.println(car.model);


        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.merk = "Honda";
        car2.merk = "Toyota";

        System.out.println("Merk mobil1: " + car1.merk);
        System.out.println("Merk mobil2: " + car2.merk);

    }
}
