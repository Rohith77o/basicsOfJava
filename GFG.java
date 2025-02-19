import java.util.*;
import java.util.*;
class GFG{
    static int R = 4;
    static int C = 4;
    static void rotateMatrix(int m, int n, int mat[][]){
        int row = 0, col = 0;
        int prev, cur;
        while(row<m&&col<n){
            if(row+1 == m || col+1 ==n)
            break;
            prev=mat[row+1][col];
            for(int i =col; i<n;i++){
                cur = mat[row][i];
                mat[row][i]=prev;
                prev = cur;
            }
            row++;
            for(int i =row ;i<m;i++){
                cur = mat[i][n-1];
                mat[i][n-1]=prev;
                prev = cur;
            }
            n--;
            if(row<m){
                for(int i =n-1;i>=col;i--){
                    cur = mat[m-1][i];
                    mat[m-1][i]=prev;
                    prev = cur;
                }
            }
            m--;
            if(col<n){
                for(int i=m-1;i>=row;i--){
                    cur = mat[i][col];
                    mat[i][col]=prev;
                    prev = cur;
                }
            }
            
        }
        for(int i =0;i<R;i++){
                for(int j = 0; j< C ; j++){
                    System.out.print(mat[i][j]+"   ");
                }
                System.out.println();
            }
    }
    public static void main (String[] args){
        int[][] arr = {{1,2,3,4,},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        rotateMatrix(R,C,arr);
    }
}