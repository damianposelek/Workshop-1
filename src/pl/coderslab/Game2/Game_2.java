package pl.coderslab.Game2;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);               // dostęp do terminala
        int[] lottoNumbers = new int[6];


        for (int i = 0; i < lottoNumbers.length; i++) {            // losowanie liczby lotto bez powtórzeń żadnej z liczb
            System.out.print("Typowane liczby Lotto: ");
            while (!scan.hasNextInt()) {                         // Jeśli wpisane znaki nie są liczbą to wtedy dzieją się dwie rzeczy: ( "!" oznacza zaprzeczenie
                scan.nextLine();                                 // 1. Polecenia wpisania liczb w konsoli
                System.out.println("To nie jest liczba!");       // 2. Wyświetla komunikat "To nie jest liczba!"
                System.out.print("Typowane liczby Lotto: ");
            }

            int userNumber = scan.nextInt();

            if (ArrayUtils.contains(lottoNumbers, userNumber)) {
                System.out.println("Taka liczba już istnieje, wybierz ponownie.");
                i--;
            } else if (userNumber > 49 || userNumber < 1) {
                System.out.println("Wybierz liczbę z przedziału 1-49");
                i--;
            } else {
                lottoNumbers[i] = userNumber;
            }
        }
        System.out.println(Arrays.toString(lottoNumbers));
    }
}