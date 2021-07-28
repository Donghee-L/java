package section02;

import java.util.Scanner;

public class Code06 {
	static Polynomial3 [] polys = new Polynomial3 [100];
	static int n = 0;
	
	public static void main(String[] args) {
		
		
		Scanner kb = new Scanner(System.in);
		
		System.out.print("$ ");
		
		
		while (true) {
			
			String command = kb.next();
			
			
			if (command.equals("create") ) {
				char name = kb.next().charAt(0);
				polys[n] = new Polynomial3(name);
				
			} else if (command.equals("add")) {
				char name = kb.next().charAt(0);

			} else if (command.equals("print")) {
				
			} else if (command.equals("calc")) {
				
			} else if (command.equals("exit")) {
				break;
			}
		
			
		}
		

		kb.close();
		
		
	}
	
	static int findName(char name) {
		
		
		return -1;
	}

}
