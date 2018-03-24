package pl.krzysztofbujak;

import java.util.Scanner;

public class IntTask4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt(); //userNumber = 5
        //1234 reszta przez dzisięć
        //1234 = (1*10^3+2*10^2+3*10^1+4)*10^0
        System.out.println(userNumber % 10);

    }

}
