package pl.krzysztofbujak;

import java.util.Arrays;

public class OddOccurrencesInArrayTask {

    public static void main(String[] args) {

        int[] test = {1, 1, 2, 3, 3, 5, 5};
        Arrays.sort(test);

        for (int i = 0; i < test.length; i += 2) {
            if (i == test.length - 1) {
                System.out.println(test[i]);
                break;
            }
            if (test[i] != test[i + 1]) {
                System.out.println(test[i]);
                break;
            }
        }

    }


}
