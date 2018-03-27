package pl.krzysztofbujak;

import java.util.Arrays;

public class KingOfTablesTask {

    //Mamy tablicę N elementową. Poszukujemy w niej króla. Król tablicy to liczba występująca przynajmniej pod ponad połową indexów.
    //
    //Ułóż algorytm, sprawdzający czy podana tablica zawiera w sobie króla, w przypadku, gdy nie - zwróć "-1".Np. [1,1,1,1,1,1,1,5,6,7,2]
    //
    //Królem jest: 1Np. [1,1,1,2,2,2,3,3,3,4]
    //
    //Królem jest: -1Zakładana złożoność algorytmiczna to: O(n)!!!!

    public static void main(String[] args) {

        int[] ints = {1,1,1,1,1,1,1,5,6,7,2};
        Arrays.sort(ints);

        int candi = ints[ints.length / 2 + 1];

        int counter = 0;
        for (int anInt : ints) {
            if (anInt == candi) {
                counter++;
            }
        }
        if (counter > ints.length / 2) {
            System.out.println("The King is " + candi);
        } else {
            System.out.println(-1);
        }

    }
}
