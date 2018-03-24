package pl.krzysztofbujak;

public class LoopTask3 {

    public static void main(String[] args) {

    //liczby nieparzyste
        for (int i = 5; i <= 50; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        //inny sposób
        for (int i = 5; i <= 50; i += 2) {
            System.out.println(i);
        }

    }

}
