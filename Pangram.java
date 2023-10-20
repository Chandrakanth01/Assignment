package Programming;

import java.util.HashSet;
import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String input = sc.nextLine();
        boolean b = checker(input);
        if (b) {
            System.out.println("The given input is a pangram.");
        } else {
            System.out.println("The given input is not a pangram.");
        }
    }
    public static boolean checker(String input) {
        input = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        HashSet<Character> uniqueLetters = new HashSet<>();
        for (char c : input.toCharArray()) {
            uniqueLetters.add(c);
        }
        return uniqueLetters.size() == 26;
    }
}
