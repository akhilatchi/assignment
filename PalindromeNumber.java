import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        // create an instance of Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // reverse the number
        int reversedNumber = 0;
        int originalNumber = number;
        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            reversedNumber = reversedNumber * 10 + digit;
            originalNumber /= 10;
        }

        // check if the reversed number is equal to the original number
        if (number == reversedNumber) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}
