public class AutomorphicFrom{
    public static boolean isAutomorphic(int n){
        int temp = n;
        int numdigits = 0;
        int square = n*n;
        while(temp>0){
                numdigits++;
                temp/=10;
        }
        int lastdigits = square%(int)Math.pow(10,numdigits);
        return lastdigits == n;
    }
    public static void main(String[]args){
        for(int i =1;i<=1000;i++){
            if(isAutomorphic(i)){
                System.out.println(i);
            }
        }
    }
}