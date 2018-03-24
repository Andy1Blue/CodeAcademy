package pl.krzysztofbujak;

import java.util.Scanner;

public class LoopTask5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
            System.out.println("For " + i + " sum is " + sum);
        }

        int score = n % 2 == 0 ? (n / 2) * (n + 1) : ((n + 1) / 2) * n;
        System.out.println("Sum is " + score);

    }

}
