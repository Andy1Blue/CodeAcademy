package pl.krzysztofbujak;

public class CyclicRotationTask {

    public static void main(String[] args) {

        int[] ints = {1, 2, 3, 4, 5};
        int[] intsNew = new int[ints.length];
        int k = 2;

        for (int i = 0; i < ints.length; i++) {
            int shift = (i + k) % ints.length;
            System.out.println("Liczba " + ints[i] + " idzie na pozycję " + shift + " ");
            intsNew[shift] = ints[i];
        }

        for (int i : intsNew) {
            System.out.print(i + " ");
        }
    }

}
