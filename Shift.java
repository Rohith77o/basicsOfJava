public class Shift{



	public static void main(String[] args) {

		

		for(int i=1;i<=1000;i++) {

			int res = circular_Prime(i);

			if(res == -1) {

				continue;

			}

			else {

				int ans = twisted_Prime(res);

				if(ans == -1) {

					continue;

				}

				else {

					System.out.println(ans);

				}

			}

		}

	}

	

	

	public static int circular_Prime(int n) {

		int num = n;

		int rem = 0;

		int count = 0;

		


		while(num>0) {

			num = num / 10;

			count++;

		}

		

		num = n;

		

		int arr[] = new int[count];

		int x = count-1;
		while(num>0) {

			rem = num % 10;

			num = num / 10;

			

			arr[x] = rem;

			x--;

		}

		

		int total = 0;
		for(int i=0;i<count;i++) { 

			int prime_count = 0;

			int sum = 0;
			for(int k=0;k<arr.length;k++) {

				sum = sum * 10 + arr[k];

			}
			for(int l=1;l<=sum;l++) {

				if(sum%l == 0) {

					prime_count++;

				}

			}

			if(prime_count == 2) {

				total++;

			}
			for(int j=0;j<arr.length-1;j++) { 

				int temp = arr[j];

				arr[j] = arr[j+1];

				arr[j+1] = temp;

			}

		}

		

		if(total == count) {

			return n;

		}

		else {

			return -1;

		}

	}

	

	public static int twisted_Prime(int num) {

		int rev = reverse(num);

		

		boolean prime = isPrime(num);

		

		if(prime == false) {

			return -1;

		}

		else {

			prime = isPrime(rev);

			if(prime == true) {

				return num;

			}

		}

		return -1;

	}

	

	public static int reverse(int num) {

		

		int rem = 0;

		int rev = 0;

		while(num > 0) {

			rem = num % 10;

			num = num / 10;

			rev = rev * 10 + rem;

		}

		

		return rev;

	}

	

	public static boolean isPrime(int rev) {

		int count = 0;

		for(int i=1;i<=rev;i++) {

			if(rev%i == 0) {

				count++;

			}

		}

		if(count == 2) {

			return true;

		}

		else {

			return false;

		}

	}



}