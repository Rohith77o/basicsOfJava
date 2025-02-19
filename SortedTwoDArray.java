/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void SortedTwoDArray(String[] args) {
		int[][] TwoDArray = {{1,2,3},
		              {4,5,6},
		              {7,8,9}};
		int row = TwoDArray.length;
		int col = TwoDArray[0].length;
		int[] SingleArray = new int[row*col];

		int x = 0;
	    System.out.println("The original unsorted Array : ");

		for(int i = 0; i< row;i++){
		    for(int j = 0;j<col;j++){
		        System.out.print(TwoDArray[i][j]+" ");
		    }
		    System.out.println();
		}
		for(int i = 0;i<row;i++){
		    for( int j = 0; j< col;j++){
		        SingleArray[x]=TwoDArray[i][j];
		        x++;
		    }
		}
		for(int i = 0;i<SingleArray.length;i++){
		    for(int j=i+1;j<SingleArray.length;j++){
		        if(SingleArray[i]>SingleArray[j]){
		            int temp = SingleArray[i];
		            SingleArray[i]=SingleArray[j];
		            SingleArray[j]=temp;
		        }
		    }
		}
		
		x=0;
		for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
		        TwoDArray[i][j]=SingleArray[x];
		        x++;
		        
		    }
		}
				        System.out.println("The sorted array : ");

		for(int i =0;i<row;i++){
		    for(int j=0;j<col;j++){
		        System.out.print(TwoDArray[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
