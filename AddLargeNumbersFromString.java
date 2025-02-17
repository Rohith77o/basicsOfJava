import java.util.Scanner;

public class AddLargeNumbersFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the first large number as a string
        System.out.print("Enter the first large number: ");
        String num1 = scanner.nextLine();

        // Get the second large number as a string
        System.out.print("Enter the second large number: ");
        String num2 = scanner.nextLine();

        // Perform the addition of both large numbers
        String result = addLargeNumbers(num1, num2);

        // Output the result
        System.out.println("The sum of the two numbers is: " + result);
    }

    // Method to add two large numbers represented as strings
    public static String addLargeNumbers(String num1, String num2) {
        // StringBuilder to store the result
        StringBuilder result = new StringBuilder();

        int carry = 0;

        // Pointers for both strings (start from the rightmost digit)
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        // Loop through both strings from right to left
        while (i >= 0 || j >= 0 || carry != 0) {
            // Get the digits (if available) from each number, or 0 if one string is shorter
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            // Sum the digits and carry
            int sum = digit1 + digit2 + carry;

            // Calculate the new carry (for next iteration)
            carry = sum / 10;

            // Append the current digit (sum mod 10) to the result
            result.append(sum);

            // Move to the next digits
            i--;
            j--;
        }

        // Since we've added digits in reverse order, reverse the result string
        return result.reverse().toString();
    }
}
