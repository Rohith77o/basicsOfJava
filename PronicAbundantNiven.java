import java.util.Scanner;
public class PronicAbundantNiven{
    public static boolean isNiven(int num){
        int sum =0;
        int originalnum=num;
        while(num>0){
        sum +=num%10;
        num/=10;
        }
        return originalnum%sum==0;
    }
    public static boolean ispronic(int num){
        for(int i =0;i<=Math.sqrt(num);i++  ){
            if(i*(i+1)==num)
            return true;
        }
        return false;
    }
    public static boolean isAbundant(int num){
        int sumofFactors =0;
        for(int i =1;i<num;i++){
            if(num%i==0 ){
                sumofFactors +=i;
            }    
        }
        return sumofFactors>num;
    }
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(isNiven( num)){
            System.out.println("it is niven");
        }
        if(isAbundant(num)){
            System.out.println("It is abundant");
        }
        if(ispronic(num)){
            System.out.println("It is pronic");
        }
    }
}