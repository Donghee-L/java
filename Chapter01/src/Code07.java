import java.util.Scanner;

public class Code07 {

	public static void main(String[] args) {
		
		int [] arr;
		int [] newArr;
		int lastNum = 0;
		
		
		
		
		Scanner keyboard = new Scanner(System.in);
		
		
		
		int n = keyboard.nextInt();
		
		arr = new int [n];
		newArr = new int [n];
		
		for (int i = 0; i < n; i++) {
			int inputNum = keyboard.nextInt();
			arr[i] = inputNum;
					
		}
		
		keyboard.close();
		
		lastNum = arr[n-1];
		
		for (int i = n-2 ; i >= 0 ; i--) {
			newArr[i+1] = arr[i];
		}
		
		newArr[0] = lastNum;
		
		for (int i = 0; i < n; i++) {
			System.out.println(newArr[i]);
		}
		
		
		
		
		
		
		

	}

}
