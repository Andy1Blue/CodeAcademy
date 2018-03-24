package pl.krzysztofbujak;

import java.util.Scanner;

public class LoopTask6 {

    public static void main(String[] args) {

        int secretNumber = 150;
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            userNumber = scanner.nextInt();

            if (userNumber != secretNumber) {
                if (userNumber < secretNumber) {
                    System.out.println("Twoja liczba jest za mała!");
                } else {
                    System.out.println("Twoja liczba jest za duża!");
                }
            }

        } while (userNumber != secretNumber);
        System.out.println("Gratulacje! Podałeś prawidłową liczbę!");

    }

}
