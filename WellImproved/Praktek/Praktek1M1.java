package WellImproved.Praktek;

/*
* Praktek untuk melihat fungsi masing-masing tipe data dalam
* bahasa pemrograman Java.
*/

//class
class Person {
    String name;
    int age;

    //constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
public class Praktek1M1 {
    public static void main(String[] args) {

        //primitive
        int population = 1000000;
        float price = 12.5f;
        double weight = 75.5d;
        char letter = 'L';

        //nonPrimitive
        boolean isloggedIn = true;
        String name = "Ayshea Marvella Pasha";

        //array
        int[] numbers1 = new int[]{1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 3, 4, 5};
        int[] numbers3 = {1, 2, 3, 4, 5};

        //object
        Person person = new Person ("Elon Musk", 53);
    }
}
