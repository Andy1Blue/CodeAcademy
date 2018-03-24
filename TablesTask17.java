package pl.krzysztofbujak;

public class TablesTask17 {

    //Napisz metodę, która wyznaczy liczbę wystąpień liczby k w danym ciągu.

    public static void main(String[] args) {
        TablesTask17 tablesTask17 = new TablesTask17();
        System.out.println(tablesTask17.howManyOneDigit(new int[]{5, 43, 2, 5, 63, 5, 5, 2, 4, 5, 5, 4, 5}, 5));
    }

    public int howManyOneDigit(int[] tab, int k) {
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            if (k == tab[i]) {
                counter++;
            }
        }
        return counter;
    }

}
