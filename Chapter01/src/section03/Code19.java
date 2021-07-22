package section03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code19 {
	
	static int maxSize = 100000;
	static String [] words = new String[maxSize];
	static int [] count = new int [maxSize];
	static int n = 0;

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		
		while (true) {
			
			System.out.print("$ ");
			String command = keyboard.next();
			
			if (command.equals("read")) {
				String fileName = keyboard.next();
				makeIndex(fileName);
				
				
				
			} else if(command.equals("find")) {
				String word = keyboard.next();
				int index = findWord(word);
				String result; 
				
				if (index != -1) {
					result = "The word " + word + " appear " + count[index] + " times.";  
					
				} else {
					result = "The word " + word + " does not appear.";				
					
				}
				
				System.out.println(result);
				
				
				
			} else if (command.equals("saveas")) {
				String fileName = keyboard.next();
				saveAs(fileName);
				
				
			} else if (command.equals("exit")) {
				break;
			} else {
				System.out.println("Command Help: find / saveas/ exit / read");
			}
			
			
		}
		
		
		keyboard.close();
	
	}
	
	static void makeIndex(String fileName) {
		
		try {
			Scanner inFile = new Scanner( new File(fileName));
			
			while(inFile.hasNext()) {
				String word = inFile.next();
				addWord(word);
								
			}
			
			
			
		} catch (FileNotFoundException e) {
			return ;
		}
		
		
		
	}
	
	static void addWord(String word) {
		int index = findWord(word);
		if (index != -1 ) {
			count[index] ++ ;
		} else { 
			words[n] = word;
			count[n] ++ ;
			n ++ ;
		}
		
	}
	
	static int findWord(String word) {
		
		for (int i =0;i<n;i++) {
			if (words[i].equalsIgnoreCase(word)) {
				return i;
			}
		}
		
		
		return -1;
	}
	
	static void saveAs(String fileName) {
		// 파일저장
	}

}
