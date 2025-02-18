/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class TwoSumPossibilities
{
	public static void main(String[] args) {
	    int[] arr = {2,7,5,7};
	    int x = 4;
	    int count =0;
	    for(int i =0;i<arr.length;i++){
	    
	            for(int j =i+1;j<arr.length;j++){
	                if(arr[i]+arr[j]==x){
	                   count++;
	                }
	                else{
	                    System.out.print("");
	                }
	            }
	        
	        
	    }
	    System.out.print(count);
	}
}
