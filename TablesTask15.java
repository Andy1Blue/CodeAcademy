package pl.krzysztofbujak;

public class TablesTask15 {

    //Napisz metodę, która jako argument przyjmuje tablice Stringów.
    //Jako wynikmetoda ma zwracać liczbę całkowitą, która oznacza najdłuższy wyraz w tablicy.

    public static void main(String[] args) {
        TablesTask15 tablesTask15 = new TablesTask15();

        System.out.println(tablesTask15.maxWordLenth(new String[]{"Hejooo","Lalalalalaa"}));
    }

    public int maxWordLenth(String[] tab){
        int maxValue = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i].length() > maxValue){
                maxValue = tab[i].length();
            }
        }
        return maxValue;
    }

}
