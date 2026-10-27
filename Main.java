import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = 0;

        System.out.println("Valitse autosi:");
        input = in.nextInt();

        if (input == 1) {
        Auto auto1 = new Auto();

        auto1.merkki = "Toyota";
        auto1.malli = "Corolla";
        auto1.bensanMaara = 10;

        auto1.naytaTiedot();
        auto1.kiihdyta();
        auto1.naytaTiedot();
        }

        if (input == 2) {
        Auto auto2 = new Auto();

        auto2.merkki = "Opel";
        auto2.malli = "Zafira";
        auto2.bensanMaara = 25;

        auto2.kiihdyta();
        auto2.naytaTiedot();
        auto2.tankkaa(20);
        auto2.naytaTiedot();
        }

        if (input == 3) {
        Auto auto3 = new Auto();

        auto3.merkki = "Peugeot";
        auto3.malli = "206+";
        auto3.bensanMaara = 50;

        auto3.kiihdyta();
        auto3.naytaTiedot();
        auto3.tankkaa(20);
        auto3.naytaTiedot();
        }


    }
}
