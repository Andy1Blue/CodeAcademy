package pl.krzysztofbujak;

import java.util.Scanner;

public class IntTask13 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Zmienna A: ");
        int a = scanner.nextInt();

        System.out.print("Zmienna B: ");
        int b = scanner.nextInt();

        System.out.print("Zmienna C: ");
        int c = scanner.nextInt();

        float avg = (a + b + c) / 3;
        System.out.println(String.format("%.2f", avg));

    }

}
