package pl.krzysztofbujak;

public class Loop {

    public static void main(String[] args) {

        System.out.println("Start for loop");
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("End loop");

        System.out.println("Start for loop");
        for (int j = 2; j < 20; j++) {
            System.out.println(j);
        }
        System.out.println("End loop");

        System.out.println("Start while loop");
        int k = 5;
        while (k < 10) {
            System.out.println("K is " + k);
            k++;
        }
        System.out.println("End loop");

        System.out.println("Start do while loop");
        //zawsze się wykona co namniej raz, najpierw robi, potem sprawdza
        do {
            System.out.println(k);
            k++;
        } while (k < 15);
        System.out.println("End loop");

    }

}
