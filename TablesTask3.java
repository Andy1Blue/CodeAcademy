package pl.krzysztofbujak;

public class TablesTask3 {

    //suma elemetnów tablicy jeśli dwa

    public static void main(String[] args) {

        TablesTask3 tablesTask3 = new TablesTask3();

        System.out.println(tablesTask3.sumEl(new int[]{42, 5}));

    }

    public int sumEl(int[] tab) {

        if (tab.length == 2) {
            return tab[0] + tab[1];
        }
        return -1;

    }

}
