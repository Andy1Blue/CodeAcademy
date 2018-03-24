package pl.krzysztofbujak;

import java.util.Scanner;

public class IfTask16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int ageOne = scanner.nextInt();
        int ageTwo = scanner.nextInt();

        if ((ageOne >= 13 && ageOne < 18) && (ageTwo >= 13 && ageTwo < 18)) {
            System.out.println("TAK");
        } else {
            System.out.println("NIE");
        }

    }

}
