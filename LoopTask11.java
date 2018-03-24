package pl.krzysztofbujak;

import java.util.Scanner;

public class LoopTask11 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj zdanie: ");
        String sentence = scanner.nextLine();

        for (int i = 0; i < sentence.length(); i++) {
            char conChar = sentence.charAt(i);

            if (Character.isDigit(conChar)) {
                System.out.print(conChar);
            }
        }

    }

}
