import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInputAverage {
    public static void main(String[] args) {
       
        String correctUsername = "user";
        String correctPassword = "pass";

        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            
            System.out.print("Enter the length of the array: ");
            int length = scanner.nextInt();
            List<Integer> numbers = new ArrayList<>();

            
            for (int i = 0; i < length; i++) {
                System.out.print("Enter number " + (i + 1) + ": ");
                int num = scanner.nextInt();
                numbers.add(num);
            }

            
            double averageOdd = calculateAverage(numbers, true);
            double averageEven = calculateAverage(numbers, false);

            
            System.out.println("Average of odd numbers: " + averageOdd);
            System.out.println("Average of even numbers: " + averageEven);
        } else {
            System.out.println("Incorrect username or password. Please try again.");
        }

        scanner.close();
    }

    private static double calculateAverage(List<Integer> numbers, boolean isOdd) {
        int sum = 0;
        int count = 0;

        for (int num : numbers) {
            if ((isOdd && num % 2 != 0) || (!isOdd && num % 2 == 0)) {
                sum += num;
                count++;
            }
        }

        return count > 0 ? (double) sum / count : 0;
    }
}