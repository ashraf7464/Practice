package CompletedInterview;

import java.util.Scanner;

public class ApexAssessment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();
        // Read user input

        String longestWord = findLongestWord(input);
        String reverseLongestWord = new StringBuilder(longestWord).reverse().toString();
        String reversedToken = new StringBuilder("yfck0tj61").reverse().toString();
        String finalOutput = reverseLongestWord + ":" + reversedToken;

        System.out.println("Longest word: " + longestWord);
        System.out.println("Final output: " + finalOutput);
    }

    public static String findLongestWord(String sen) {
        String[] words = sen.split("[^a-zA-Z0-9]+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }
}

