public class ConsecutiveOccurances {
	public static void main(String[] args) {
		int currentstreak =0;
		int maxstreak =0;
		int arr[] = {1,1,0,1,1,0,0,1,0,1,1,1,0};
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]==1) {
				currentstreak++;
				maxstreak=Math.max(maxstreak,currentstreak);
			}
			else
				currentstreak =0;
		}
		System.out.println("The consequtive occurance of 1's are : "+maxstreak);
	}
}