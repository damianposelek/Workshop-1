package pl.coderslab.Game1;

import java.util.Random;
import java.util.Scanner;

public class Game_1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);                     // Otrzymuję dostęp do terminala

        Random r = new Random();                                   // Wylosuj losową liczbę
        int randomNumber = r.nextInt(100 + 1) - 1;         // Przypisz losową liczbę do randomNumbers

        while (true) {

            System.out.print("Zgadnij liczbę: ");
            while (!scan.hasNextInt()) {                         // Jeśli wpisane znaki nie są liczbą to wtedy dzieją się dwie rzeczy: ( "!" oznacza zaprzeczenie
                scan.nextInt();                                  // 1. Polecenia wpisania liczb w konsoli
                System.out.println("To nie jest liczba!");       // 2. Wyświetla komunikat "To nie jest liczba
            }

            int myNumber = scan.nextInt();                       // Dopiero po pętli jeśli już mam pewność, ze jest to liczba, to przypisuję liczbę do myNumber

            while (myNumber > 100 || myNumber < 1) {
                System.out.println("Podana wartość musi być liczbą z przedziału 1-100");
                myNumber = scan.nextInt();
            }

            if (myNumber < randomNumber) {                       // komunikaty które będą sprawdzały czy liczba jest za mała lub za duża albo WŁAŚCIWA :)
                System.out.println("Za mało!");
            } else if (myNumber > randomNumber) {
                System.out.println("Za dużo!");
            } else {
                System.out.println("Zgadłeś! Szukana liczba to: " + randomNumber);
                break;                                            // BREAK potrzebny do zatrzymania pętli
            }
        }
    }
}
