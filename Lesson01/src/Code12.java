import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int [] arr = new int [n];
		
		for (int i = 0; i<n; i++) {
			arr[i] = keyboard.nextInt();
		}
		
		keyboard.close();
		
		for (int i =0; i<n; i++) {
			int minNum = arr[i];
			int minIndex = i;
			
			for (int j=i;j<n;j++) {
				if (minNum > arr[j]) {
					minIndex = j;
				}
			}
			
			int iNum = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = iNum;
					
		}
		
		for (int i = 0; i<n; i++) {
			System.out.println(arr[i]);
		}

	}

}
