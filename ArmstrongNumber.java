public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;  // Example number

        // Call the method to check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int numDigits = 0;
        int sum = 0;

        // Calculate the number of digits in the number
        while (number != 0) {
            number /= 10;
            numDigits++;
        }

        number = originalNumber;  // Reset the number back to the original number

        // Calculate the sum of each digit raised to the power of numDigits
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            sum += Math.pow(digit, numDigits);  // Raise the digit to the power of numDigits and add it to sum
            number /= 10;  // Remove the last digit
        }

        // If the sum is equal to the original number, it's an Armstrong number
        return sum == originalNumber;
    }
}
