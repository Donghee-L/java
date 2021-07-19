import java.util.Scanner;

public class Code04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = null;
		String gender = null;
		int age;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please type yout name / age / gender: ");
		
		name = keyboard.next();
		age = keyboard.nextInt();
		gender = keyboard.next();
		
		if (gender.equals("male")) {
			System.out.println(name + " are " + age + " male");
		} else if (gender.equals("female")) {
			System.out.println(name + " are  " + age + " female");
		} else {
			System.out.println("??");
		}
		
		keyboard.close();
				
	}

}
