public class ReverseAddition {
    public static void main(String[] args) {
        // Example numbers
        int num1 = 1234;
        int num2 = 5678;

        // Convert numbers to strings for easier digit manipulation
        String strNum1 = String.valueOf(num1);
        String strNum2 = String.valueOf(num2);

        // Make both numbers the same length by adding leading zeros to the shorter number
        int maxLength = Math.max(strNum1.length(), strNum2.length());
        strNum1 = String.format("%0" + maxLength + "d", num1);
        strNum2 = String.format("%0" + maxLength + "d", num2);

        // Initialize variables for carry and result
        int carry = 0;
        StringBuilder result = new StringBuilder();

        // Loop through the digits from left to right
        for (int i = 0; i < maxLength; i++) {
            // Get digits from both numbers
            int digit1 = strNum1.charAt(i) - '0'; // Convert char to int
            int digit2 = strNum2.charAt(i) - '0'; // Convert char to int

            // Perform addition with carry
            int sum = digit1 + digit2 + carry;
            carry = sum / 10; // Calculate carry for next iteration
            result.append(sum % 10); // Append the current digit to the result
        }

        // If there is any carry left, append it to the result
        if (carry > 0) {
            result.append(carry);
        }

        // The result will be in reverse order, so we need to reverse it back
        System.out.println("Result after LeftMost addition: " + result.toString());
    }
}
