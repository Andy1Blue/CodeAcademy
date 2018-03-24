package pl.krzysztofbujak;

import java.util.Random;

public class StringExample {

    public static void main(String[] args) {
        Random random = new Random();

        int a = 4;
        int b = 4;
        String aa = "Hello";
        String bb = "Hello";

        Integer c = 1;

        //porównuje referncje a nie obiekty
        if (aa.equals(bb)) {
            System.out.println("Takie same");
        } else {
            System.out.println("Nie takie same");
        }

        String aaa = "gfdgd";
        String aaa2 = "gfdggggfgdfgfd";
        aaa = aaa.toUpperCase();
        System.out.println(aaa);

    }

}
