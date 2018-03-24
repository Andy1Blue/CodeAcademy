package pl.krzysztofbujak;

public class MethodsTask10 {

    //Napisz metodę, która zwraca maksymalną długość 2 stringÓw

    public static void main(String[] args) {

        System.out.println(sumWord("Kot", "Pies"));

    }

    public static int sumWord(String a, String b) {
        return a.length() + b.length();
    }

}
