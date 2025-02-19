import java.util.Scanner;
public class TwoDimensionalArray
{
	public static void main(String[] args) {
	    int rows = 3;
	    int columns = 3;
	    int[][] var = new int[rows][columns];
	    Scanner in = new Scanner(System.in);
	    for(int i =0;i<rows;i++){
	        for(int j = 0; j< columns;j++){
	            	System.out.print("Enter the value for the position  "+"["+i+"]"+"["+j+"] : ");
	            	var[i][j] = in.nextInt();
	        }
	        System.out.println();
	    }
	    System.out.println("The values in the 2D array : ");
	    for(int i = 0;i<rows;i++){
	        for(int j =0;j<columns;j++){
	            System.out.print(var[i][j]+" ");
	        }
	        System.out.println();
	    }
	
		
	}
}
