package WellImproved.Praktek;

/*
* Praktek untuk melihat cara kerja input & output dalam
* bahasa pemrograman Java.
*/

//import input output
import java.util.Scanner;

public class Praktek2M1 {
    public static void main(String[] args) {

        //contoh 1
        //input
        Scanner input = new Scanner(System.in);
        String firstName;
        int age;

        //output
        System.out.print("Enter your first name: ");
        firstName = input.nextLine();
        System.out.print("Enter your age: ");
        age = input.nextInt();
        System.out.print("\nName : " + firstName);
        System.out.print("Age : " + age);


        System.out.print("Ini teks yang dicetak dengan print()\n");
        System.out.println("Sedangkan ini teks yang dicetak dengan println()");
        System.out.printf("Pake print() lagi, %d", 50);

        //contoh 2
        //input
        String nama = "Ayshea Marvella";
        int umur = 19;

        //output
        System.out.println(nama);
        System.out.print(umur);
        System.out.println(nama + umur);
        System.out.println(nama + " " + nama);
        System.out.printf("Nama saya %s umur %d\n", nama, umur);
    }
}
