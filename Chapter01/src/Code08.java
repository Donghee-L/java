import java.util.Scanner;

// Find PrimeNumber
public class Code08 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		String result = n + " is Prime Number!";
		
		keyboard.close();
		
		
		for (int i = 2; i*i <= n; i++) {
						
			if ( n % i == 0 ) {
				
				result = n + " is not Prime Number!";
				break;
			}
		}
		
		System.out.println(result);

	}

}
