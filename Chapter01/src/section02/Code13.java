package section02;

import java.util.Scanner;

public class Code13 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int a = keyboard.nextInt();
		int b = keyboard.nextInt();
		
		keyboard.close();
		
		int result = power(a,b);
		
		System.out.println(result);
		

	}
	
	static int power(int a, int b) {
		int result = 1;
		
		for (int i = 0; i<b; i++) {
			result *= a;
		}
		
		return result;
	}

}
