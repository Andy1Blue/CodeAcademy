package pl.krzysztofbujak;

import java.util.Scanner;

public class IntTask7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj całkowity promień koła:");
        int r = scanner.nextInt();
        double score = Math.PI*r*r;
        System.out.println("Pole koła to: " + Math.round(score));

    }

}
