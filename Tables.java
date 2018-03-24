package pl.krzysztofbujak;

public class Tables {

    public static void main(String[] args) {

        Tables tables = new Tables();

        int[] numbers = {1, 2, 3, 4};
        System.out.println(numbers[1]);

        int[] numbers2 = new int[5];

        numbers2[0] = 2;

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[][] multidimensiomnal = {{1, 2, 3}, {4, 5, 6, 7}};

    }

}
