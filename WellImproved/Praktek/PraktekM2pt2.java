package WellImproved.Praktek;

import java.util.Date;

class Farmer {
    String name, favorite;

    void talk(){
        System.out.println("Hi! My name is: " + name + ". My favorite plant is: " + favorite);
    }
}

class Plant {
    String name;
}

public class PraktekM2pt2 {
    public static void main(String[] args) {
        Farmer farmer1 = new Farmer();
        Farmer farmer2 = new Farmer();
        Plant plant1 = new Plant();
        Plant plant2 = new Plant();

        farmer1.name = "Crazy Dave";
        farmer2.name = "Sober Dave";

        plant1.name = "Sunflower";
        plant2.name = "Mushroom";

        farmer1.favorite = plant1.name;
        farmer2.favorite = plant2.name;

        System.out.println("Hello World!");
        System.out.println("Current date and time: " + new Date());

        farmer1.talk();
        farmer2.talk();
    }
}
