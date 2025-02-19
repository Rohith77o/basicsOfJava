/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class ReverseDiagonals
{
	public static void main(String[] args) {
	 int[][] arr = {{1,2,3,4},
	                {5,6,7,8},
	                {9,10,11,12},
	                {13,14,15,16}};
	 int i =0;
	 int n = 4;
	 int j = n;
	 int temp ;
	 while(i<j){
	     temp = arr[i][i];
	     arr[i][i]=arr[j-1][j-1];
	     arr[j-1][j-1]=temp;
	     i++;
	     j--;
	 }
	 for( i =0;i<arr.length;i++){
	     for(j =0;j<arr.length;j++){
	         System.out.print(arr[i][j]+" ");
	     }
	     System.out.println();
	 }
	}
}
