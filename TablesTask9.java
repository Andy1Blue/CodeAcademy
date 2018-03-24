package pl.krzysztofbujak;

public class TablesTask9 {

    //odwraca tablicę

    public static void main(String[] args) {

        TablesTask9 tablesTask9 = new TablesTask9();
        tablesTask9.reverseTable(new int[]{1, 2, 3, 4, 5});

    }

    public int[] reverseTable(int[] tab) {
        int[] result = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            result[(tab.length - i) - 1] = tab[i];
        }

        for (int i : result) {
            System.out.println(i);
        }
        return result;
    }
}

