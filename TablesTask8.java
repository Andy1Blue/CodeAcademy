package pl.krzysztofbujak;

public class TablesTask8 {

    //największy element tablicy

    public static void main(String[] args) {

        TablesTask8 tablesTask8 = new TablesTask8();
        System.out.println(tablesTask8.biggestEl(new int[]{3, 55, 635353, -4,999999999}));

    }

    public int biggestEl(int[] tab) {
        int result = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > result) {
                result = tab[i];
            }
        }
        return result;
    }

}
