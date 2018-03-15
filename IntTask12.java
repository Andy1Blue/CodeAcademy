package pl.krzysztofbujak;

import java.util.Scanner;

public class IntTask12 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Zmienna A: ");
        int a = scanner.nextInt();

        System.out.print("Zmienna B: ");
        int b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Nowa wartość A: " + a);
        System.out.println("Nowa wartość B: " + b);

    }

}
