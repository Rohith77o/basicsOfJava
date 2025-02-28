package training;

public class ArrayClass {
    public static void main(String[] args) {
        int[][] arr = {
                {100, 150, 250},
                {220, 350, 120},
                {550, 620, 427}
        };

        int sum = calculateSum(arr);

        if (isAbundant(sum)) {
            System.out.println("The sum " + sum + " is abundant.");
        } else {
            System.out.println("The sum " + sum + " is not abundant.");
        }

        if (sum % 2 == 0) {
            System.out.println("The sum " + sum + " is even.");
        } else {
            System.out.println("The sum " + sum + " is odd.");
        }
    }

    public static int calculateSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static boolean isAbundant(int num) {
        int sumOfDivisors = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors > num;
    }
}
