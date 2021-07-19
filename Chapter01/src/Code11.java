import java.util.Scanner;

public class Code11 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int maxNum = 0;
		int [] arr = new int [n];
		
		for (int i = 0; i < n; i++) {
			int inputNum = keyboard.nextInt();
			arr[i] = inputNum;
		}
		
		keyboard.close();
		
		for (int i=0; i< n; i++) {
			for (int j=i; j<n; j++) {
				int num = 0;
				for (int k=i; k<=j; k++) {
					num = num * 10 + arr[k];
				}
				
				boolean isPrime = true;
				if (num < 2)
					isPrime = false;
				else
					for (int m=2; m*m <= num; m++) {
						if (num % m == 0) {
							isPrime = false;
							break;
									
						}
					}
					
				if (isPrime && maxNum < num) {
					maxNum = num;
				}
				
			}
		}
		
		System.out.println(maxNum);

	}

}
