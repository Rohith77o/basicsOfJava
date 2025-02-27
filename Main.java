import java.util.Scanner;

public class Main {

    public static boolean isAutomorphic(int num) {
        int square = num * num; 
        int temp = num; 
        
            while (temp > 0) {
            if (square % 10 != temp % 10) { 
                return false; 
            }
            temp /= 10; 
            square /= 10; 
        }
        
        return true; 
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt(); 
        if (isAutomorphic(num)) { 
            System.out.println(num + " is an automorphic number"); 
        } else {
            System.out.println(num + " is not an automorphic number"); 
        }
    }
}
