package pl.krzysztofbujak;

import java.util.Scanner;

public class StringTask8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String abc = scanner.nextLine();

        System.out.println(abc + "\nDwie ostatatnie to: " + abc.charAt(abc.length()-2) + abc.charAt(abc.length()-1));

        System.out.println(abc.substring(abc.length()-2));

    }

}
