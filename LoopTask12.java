package pl.krzysztofbujak;

import com.sun.java.swing.plaf.windows.WindowsInternalFrameTitlePane;

import java.util.Scanner;

public class LoopTask12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wyraz:");
        String word = scanner.nextLine();

        //        if(word.equals(new StringBuilder(word).reverse().toString())){
        //           System.out.println("Palindrom!");
        //        }

        boolean isPalindrome = true;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println("Palindrom!");
        }

    }

}
