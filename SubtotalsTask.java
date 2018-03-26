package pl.krzysztofbujak;

import java.util.Scanner;

public class SubtotalsTask {

    //Mamy dany ciąg liczb całkowitych . Zdefiniujmy ciąg sum częściowych :  . Zadaniem Twojego programu jest wyznaczenie ciągu  dla pewnego ciągu .
    //
    //Zadanie
    //
    //Napisz program, który:
    //
    //wczyta ze standardowego wejścia liczbę naturalną  oraz liczby ,
    //wypisze na standardowe wyjście .

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //43 5 53 5 76 7 7 53

        System.out.print("Podaj liczby: ");
        String numbers = scanner.nextLine();

        String[] intsInString = numbers.split(" ");
        int[] intArray = new int[intsInString.length];

        for (int i = 0; i < intsInString.length; i++) {
            intArray[i] = Integer.valueOf(intsInString[i]);
        }

        /////////////////

        int sum = 0;
        for (int i : intArray) {
            sum += i;
        }

        for (int i : intArray) {
            System.out.println(sum);
            sum -= i;
        }

    }

}


