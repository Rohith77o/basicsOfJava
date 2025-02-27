import java.util.Scanner;
public class Decimal
{
    public static String convertToBinary(int input){
        StringBuilder binary = new StringBuilder();
        if(input == 0){
            return "0";
        }
        while(input >0){
            binary.insert(0,input%2);
            input/=2;
        }
        return binary.toString();
    }
    public static String convertToOctal(int input){
        StringBuilder octal = new StringBuilder();
        if(input ==0){
            return "0";
        }
        while(input > 0){
            octal.insert(0,input%8);
            input/=8;
        }
        return octal.toString();
    }
    public static String convertToHexadecimal(int input){
        StringBuilder hexadecimal = new StringBuilder();
        char[] hexChar = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}; 
        if(input == 0){
            return "0";
        }
        while(input > 0){
        int remainder = input % 16;
        hexadecimal.insert(0,hexChar[remainder]);
        input/=16;
        }
        return hexadecimal.toString();
    }
	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int input = in.nextInt();
	    String binary = convertToBinary(input);
	    String octal = convertToOctal(input);
	    String hexadecimal = convertToHexadecimal(input);
	    System.out.println("The binary value of the decimal integer : "+binary);
	    System.out.println("The octal value of the decimal integer : "+octal);
	    System.out.println("the hexadecimal value of the decimal integer : "+hexadecimal);
	    
	}
}
