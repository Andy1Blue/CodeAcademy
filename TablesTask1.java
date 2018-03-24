package pl.krzysztofbujak;

public class TablesTask1 {

    //Napisz metodę, która dla danej tablicy liczb całkoiwityc nzwratca pierwszy element tablicy.

    public static void main(String[] args) {

        TablesTask1 tablesTask1 = new TablesTask1();

        int[] tab = {77, 2, 53, 654, 6};
        int result = tablesTask1.first(tab);

        System.out.println(result);

    }

    public int first(int[] tab) {

        return tab[0];

    }

}
