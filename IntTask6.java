package pl.krzysztofbujak;

import java.util.Scanner;

public class IntTask6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 liczbę:");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj 2 liczbę:");
        int secoundNumber = scanner.nextInt();

        double score = (double) firstNumber / secoundNumber;

        System.out.println(score);

    }

}
