import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     

        Auto auto1 = new Auto();

        auto1.merkki = "Toyota";
        auto1.malli = "Corolla";
        auto1.bensanMaara = 10;

        auto1.naytaTiedot();
        auto1.kiihdyta();
        auto1.naytaTiedot();

        Auto auto2 = new Auto();

        auto2.merkki = "Opel";
        auto2.malli = "Zafira";
        auto2.bensanMaara = 25;

        auto2.kiihdyta();
        auto2.naytaTiedot();
        auto2.tankkaa(20);
        auto2.naytaTiedot();


    }
}
