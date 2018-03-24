package pl.krzysztofbujak;

public class TablesTask14 {

    //Napisz metodę, która jako argument przyjmuje tablicę Stringów. Jako wynik ma
    // zwracać tablice tej
    // samej długości, w której wyrazy
    // są napisane małymi literami(duże litery zamieniamy na małe).

    public static void main(String[] args) {

        TablesTask14 tablesTask14 = new TablesTask14();
        tablesTask14.toLower(new String[]{"Psy", "Koty"});

    }

    public String[] toLower(String[] tab) {
        String[] result = new String[tab.length];
        for (int i = 0; i < tab.length; i++) {
            result[i] = tab[i].toLowerCase();
        }

        for (String i : result) {
            System.out.println(i);
        }

        return result;
    }

}
