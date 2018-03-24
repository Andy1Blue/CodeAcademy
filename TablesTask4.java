package pl.krzysztofbujak;

public class TablesTask4 {

    // pierwszy i ost element

    public static void main(String[] args) {

        TablesTask4 tablesTask4 = new TablesTask4();

        System.out.println(tablesTask4.sumFirstLast(new int[]{1, 2, 4, 3}));

    }

    public int sumFirstLast(int[] tab){
        return tab[0] + tab[tab.length-1];
    }

}
