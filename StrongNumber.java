public class StrongNumber
{
    public static int factorial(int n){
        int fact =1;
        for(int i =1;i<=n;i++){
            fact*=i;
        }
        return fact;
    }
    public static boolean isStrong(int num){
        int sum =0;
        int originalNum = num;
        int digit = 0;
        while(num>0){
            digit = num%10;
            sum+=factorial(digit);
            num/=10;
        }
        return sum==originalNum;
        
    }
    
	public static void main(String[] args) {
	    System.out.println("The strong numbers from 1 to 1000 : ");
	    for(int i =1;i<=1000;i++){
	        if(isStrong(i)){
	            System.out.println(i);
	        }
	        
	    }
	}
}
