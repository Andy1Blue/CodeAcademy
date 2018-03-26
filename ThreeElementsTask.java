package pl.krzysztofbujak;

import java.util.Scanner;

public class ThreeElementsTask {

    //Niech dany będzie -elementowy ciąg liczb całkowitych . Zadaniem Twojego programu będzie sprawdzenie czy w ciągu jakakolwiek liczba występuje co najmniej trzykrotnie.
    //Zadanie
    //
    //Napisz program, który:
    //
    //    wczyta ze standardowego wejścia liczbę naturalną oraz liczby ,
    //    wypisze na standardowe wyjście TAK jeśli ciąg zawiera element powtarzający się co najmniej 3 razy lub NIE jeśli nie zawiera.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //12 14 15 1 2 3 5 1

        System.out.print("Podaj liczby: ");
        String numbers = scanner.nextLine();

        String[] intsInString = numbers.split(" ");
        int[] intArray = new int[intsInString.length];

        for (int i = 0; i < intsInString.length; i++) {
            intArray[i] = Integer.valueOf(intsInString[i]);
        }

        ///////////////////

        for (int i : intArray) {
            int counter = 0;
            for (int i1 : intArray) {
                if (i == i1) {
                    counter++;
                }
            }

            if (counter >= 3) {
                System.out.println("Tak");
                System.exit(0);
            }
        }
        System.out.println("Nie");

    }

}
