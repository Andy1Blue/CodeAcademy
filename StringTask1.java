package pl.krzysztofbujak;

import java.util.Scanner;

public class StringTask1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj imię:");
        String name = scanner.nextLine();

        System.out.println("Podaj nazwisko:");
        String surname = scanner.nextLine();

        System.out.println("Twoje imię i naziwkso to: " + name + " " + surname);

    }

}
