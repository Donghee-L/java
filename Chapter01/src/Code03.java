import java.util.Scanner;

public class Code03 {

	public static void main(String[] args) {
		
		String str = "Hello,world";
		String input = null;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please type a string: ");
		input = keyboard.next();
		
		if (str.equals(input)) {
			System.out.println("Strings match! :-)");
		} else {
			System.out.println("Strings do not match! :-(");
		}
		
		keyboard.close();

	}

}


// primitive type을 제외하구는 == 사용 불가
// 이 때 사용하는 것이 .equals()