package pl.krzysztofbujak;

public class TablesTask13 {

    //napisz metodę ktora jak arg przytjmuje tablice stringów,5 liter tylko pokazuje slowa ktore maja

    public static void main(String[] args) {

        TablesTask13 tablesTask13 = new TablesTask13();

        tablesTask13.fiveLetters(new String[]{"Dupa", "Kotyy", "dsddsa", "rfwfr", "rweee"});
    }

    public String[] fiveLetters(String[] tab) {
        String[] result = new String[tab.length];
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].length() == 5) {
                result[counter] = tab[i];
                counter++;
            }

        }
        for (String i : result) {
            if (i != null) {
                System.out.println(i);
            }
        }
        return result;
    }

}
