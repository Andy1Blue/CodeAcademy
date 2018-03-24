package pl.krzysztofbujak;

import java.util.Scanner;

public class StringTask9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String abc = scanner.nextLine();

        System.out.println(abc.contains("Kot") || abc.contains("Kot2") || abc.contains("Kot3"));

        if (abc.equals("Kot")) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}
