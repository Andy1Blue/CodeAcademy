package pl.krzysztofbujak;

public class TablesTask16 {

    //Napisz metodę, która jako argument zawiera tablicę elementów typu boolean.
    //Metoda ma zwrócić nową tablicę, która zawiera tyle elementów true ile znajdujesię w bazowej tablicy.

    public static void main(String[] args) {

        TablesTask16 tablesTask16 = new TablesTask16();
        tablesTask16.howManyBooleans(new boolean[]{true, false, false, true, true});

    }

    public boolean[] howManyBooleans(boolean[] tab){
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            if(tab[i] == true) {
                counter++;
            }
        }

        boolean[] result = new boolean[counter];
        for (int i = 0; i < counter; i++) {
            result[i] = true;
        }

        for (boolean b: result) {
            System.out.println(b);
        }
        return result;
    }

}
