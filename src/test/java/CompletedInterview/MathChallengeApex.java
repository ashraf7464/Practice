package CompletedInterview;

import java.util.Scanner;

public class MathChallengeApex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();

        String result = MathChallenge(num1, num2);
        System.out.println("Result: " + result);

        scanner.close();
    }

    public static String MathChallenge(int num1, int num2) {
        if (num2 > num1) {
            return "true";
        } else if (num1 > num2) {
            return "false";
        } else {
            return "-1";
        }
    }
}
