package pl.krzysztofbujak;

import java.util.Scanner;

public class StringTask4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String abc = scanner.nextLine();

        System.out.println(abc.charAt(abc.length() - 2));

    }

}
