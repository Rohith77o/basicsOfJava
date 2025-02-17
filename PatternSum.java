import java.util.Scanner;

public class PatternSum {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);
        
        // Taking input for x and number of lines
        System.out.print("Enter a value for x: ");
        int x = scanner.nextInt();
        
        System.out.print("Enter the number of lines to print: ");
        int numLines = scanner.nextInt();
        
        // Variable to store the sum of x
        int sum = 0;
        
        // Loop to print the lines with incremented x values and calculate sum
        for (int i = 0; i < numLines; i++) {
            int currentLineValue;
            
            if (i == 0) {
                currentLineValue = x;  // First line prints x
            } else {
                currentLineValue = x * (i + 1);  // Increment x by its own value
            }
            
            System.out.println("Line " + (i + 1) + ": " + currentLineValue);
            sum += currentLineValue;  // Add the current value to the sum
        }
        
        // Print the final sum of x
        System.out.println("Total sum of x: " + sum);
        
        // Close the scanner to avoid memory leak
        scanner.close();
    }
}
