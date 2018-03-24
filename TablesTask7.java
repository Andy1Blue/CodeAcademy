package pl.krzysztofbujak;

public class TablesTask7 {

    //suma elementów tablicy

    public static void main(String[] args) {

        TablesTask7 tablesTask7 = new TablesTask7();

        System.out.println(tablesTask7.sumAll(new int[]{1, 6, 1}));

    }

    public int sumAll(int[] tab){
        int result = 0;
        for (int i = 0; i < tab.length; i++) {
            result += tab[i];
        }
        return result;
    }

}
