package pl.krzysztofbujak;

import com.sun.xml.internal.stream.Entity;

import java.util.Scanner;

public class MethodsTask11 {

    //Napisz funkcję, która odczytuje jako argument liczbę i wypisuje liczbę dzielników.

    public static void main(String[] args) {

        numberOfDivisors();

    }

    public static void numberOfDivisors() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();
        int result = 0;

        for (int i = 1; i < number; i++) {
            if (number % 1 == 0) {
                result++;
            }
        }

        System.out.println("Liczba dzielników liczby " + number + " wynosi: " + result + ".");
        scanner.close();

    }

}
