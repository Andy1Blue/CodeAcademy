package pl.krzysztofbujak;

public class TablesTask2 {

    //ostatni element

    public static void main(String[] args) {

        TablesTask2 tablesTask2 = new TablesTask2();

        int result = tablesTask2.last(new int[]{432, 4343, 44, 216, 82, 423, 888});

        System.out.println(result);

    }

    public int last(int[] tab) {
        int lastEl = tab.length - 1;
        return tab[lastEl];
    }


}
