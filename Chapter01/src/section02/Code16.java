// txt파일로부터 데이터를 받는다.

package section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code16 {

	public static void main(String[] args) {
		
		int maxSize = 1000;
		String [] name = new String [maxSize];
		String [] phone = new String [maxSize];
		int n = 0;		
		
		String fileName = "input.txt";
		Scanner inputFile;
		try {
			inputFile = new Scanner(new File(fileName));
			
			while (inputFile.hasNext()) { // detect End of File
				
				String inputName = inputFile.next();
				String inputPhone = inputFile.next();
				
				name[n] = inputName;
				phone[n] = inputPhone;
				
				n ++;	
			}
			
			inputFile.close();
			
			for (int i = 0; i<n; i++) {
				System.out.println(name[i] + "'s phone number is : " + phone[i]);
			}
			
		} catch (FileNotFoundException e) {
			
			String errMessage = "Error!";
			
			System.out.println(errMessage);
			
		}
		
		
		

	}

}
