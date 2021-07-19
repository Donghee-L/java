import java.util.Scanner;

public class Code02 {

	public static void main(String[] args) {
		int num = 123;
		
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.println("Hint: 100 <= n <= 999");
		System.out.print("Please enter an integer: ");
		int input = keyboard.nextInt();
		
		if (input == num ) {
			System.out.println("Numbers match! :-)");
		} else {
			System.out.println("Numbers does not match! :-(");
		}
		
		keyboard.close();
				

	}

}
