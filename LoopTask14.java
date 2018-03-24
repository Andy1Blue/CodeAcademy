package pl.krzysztofbujak;

import java.util.Scanner;

public class LoopTask14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wyraz: ");
        int number = scanner.nextInt();

        if (number == 2) {
            System.out.println("Pierwsza");
            System.exit(0);
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.println("Złożona");
                System.exit(0);
            }
        }
        System.out.println("Pierwsza");

    }

}
