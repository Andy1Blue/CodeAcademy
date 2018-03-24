package pl.krzysztofbujak;

import java.util.Random;

public class LoopTask7 {

    public static void main(String[] args) {

        System.out.println("Wyniki lotto to: ");
        Random random = new Random();
        for (int i = 1; i <= 6; i++) {
            System.out.println(random.nextInt(49) + 1);
        }

    }

}
