/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class TwoSum
{
	public static void main(String[] args) {
	    int[] arr = {2,7,5,7};
	    int x = 9;
	    int a=0;
	    int b=0;
	    for(int i =0;i<arr.length;i++){
	    
	            for(int j =0;j<arr.length;j++){
	                if(arr[i]+arr[j]==x){
	                   a=i;
	                   b=j;
	                }
	            }
	        
	        
	    }
	    System.out.print(a+ " "+b);
	}
}
