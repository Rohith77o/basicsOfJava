
public class SpiralMatrix
{
    public static int[][] rotate(int[][]arr,int rows,int col){
        int[][]rotate=new int[rows][col];
        for(int i =0;i<rows;i++){
            for(int j =0;j<col;j++){
                rotate[j][rows-1-i]=arr[i][j];
            }
        }
        return rotate;
    }
    public static void printMatrix(int[][]rotateMatrix,int rows,int col){
        for(int i =0;i<rows;i++){
            for(int j =0;j<col;j++){
                System.out.print(rotateMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
	public static void main(String[] args) {
	    int[][]arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	    int rows = arr.length;
	    int col = arr[0].length;
	    int[][]rotateMatrix = rotate(arr,rows,col);
	    printMatrix(rotateMatrix,rows,col);
	}
}
