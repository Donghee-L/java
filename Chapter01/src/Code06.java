import java.util.Scanner;

// Problem Solving

public class Code06 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int sum = 0;
		int maxNum = 0;
				
		int [] array = new int [n];
		
		for (int i = 0; i < n; i++) {
			int inputNum = kb.nextInt();
			array[i] = inputNum;
		}
		kb.close();
		System.out.println(array);
		
		for (int i = 0; i < n; i ++ ) {
			sum += array[i];
			
			if (maxNum < array[i]) {
				maxNum = array[i];
			}
		}
		
		
		System.out.println("Sum: " + sum + "and MaxNum: " + maxNum);
		
		
		
	}

}
