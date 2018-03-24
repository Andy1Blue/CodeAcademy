package pl.krzysztofbujak;

public class TablesTask6 {

    //

    public static void main(String[] args) {

        TablesTask6 tablesTask6 = new TablesTask6();
tablesTask6.concatTables(new int[]{1,2,3,4}, new int[]{5,6,7,8,9});

    }

    public int[] concatTables(int[] tab1, int[] tab2) {
        int[] tabResult = new int[tab1.length + tab2.length];

        for (int i = 0; i < tab1.length; i++) {
            tabResult[i] = tab1[i];
        }

        for (int i = 0; i < tab2.length; i++) {
            tabResult[tab1.length + i] = tab2[i];
        }

        for (int i = 0; i < tabResult.length; i++) {
            System.out.println(tabResult[i]);
        }
        return tabResult;
    }

}
