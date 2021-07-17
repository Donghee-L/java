import java.util.Scanner;

public class Code10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = keyboard.nextInt();
		int [] arr = new int [n];
		int maxNum = 0;
	
		for (int i = 0; i < n; i++) {
			arr[i] = keyboard.nextInt();
		}
		
		keyboard.close();
		
		for (int i = 0; i<n; i++) {
			for (int j = i; j<n; j++) {
				int sum = 0;
				for (int k =i; k<=j; k++) {
					sum += arr[k];
				}
				
				if (maxNum < sum) {
					maxNum = sum;
				}
				
			}
		}
		System.out.println(maxNum);
		
		
	}

}
