import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove whitespace and convert to lowercase for consistency
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();

        // Reverse the string
        String reversed = new StringBuilder(cleanInput).reverse().toString();

        // Check if the original string is equal to the reversed string
        if (cleanInput.equals(reversed)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}
