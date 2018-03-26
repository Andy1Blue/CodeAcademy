package pl.krzysztofbujak;

public class TablesTask51 {

    //Zad5.Dla tablicy liczb całkowitych znajdź jednocześnie minimum i maksimum tablicy.

    public static void main(String[] args) {

        TablesTask51 tablesTask51 = new TablesTask51();
        System.out.println(tablesTask51.maxMin(new int[]{2, 43, 43, 876, 7, 3}));

    }

    public String maxMin(int[] tab) {

        int min = tab[0];
        int max = tab[0];

        for (int oneInt : tab) {

            if (min > oneInt) {
                min = oneInt;
            }

            if (max < oneInt) {
                max = oneInt;
            }

        }

        return "min: " + min + " | max:" + max;
    }

}
