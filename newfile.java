import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String correctUsername = "admin";
        String correctPassword = "1234";
        Scanner input = new Scanner(System.in);
        String username, password;

        // Login loop
        while (true) {
            System.out.print("Enter username: ");
            username = input.nextLine();
            System.out.print("Enter password: ");
            password = input.nextLine();

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                break;
            } else {
                System.out.println("Incorrect username or password. Try again.");
            }
        }

        System.out.print("Enter the length of the array: ");
        int length = input.nextInt();

        int[] numbers = new int[length];
        int oddSum = 0, evenSum = 0, oddCount = 0, evenCount = 0;

        for (int i = 0; i < length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            if (numbers[i] % 2 == 0) {
                evenSum += numbers[i];
                evenCount++;
            } else {
                oddSum += numbers[i];
                oddCount++;
            }
        }

        double avgOdd = (oddCount > 0) ? (double) oddSum / oddCount : 0;
        double avgEven = (evenCount > 0) ? (double) evenSum / evenCount : 0;

        System.out.println("Average of odd numbers: " + avgOdd);
        System.out.println("Average of even numbers: " + avgEven);
    }
}
