// txt파일로부터 데이터를 받는다.
// 이름순으로 정렬해서 출력하기;

package section02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code17 {

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
			
			bubbleSort(n, name, phone);
			
			for (int i = 0; i<n; i++) {
				System.out.println(name[i] + "'s phone number is : " + phone[i]);
			}
			
		} catch (FileNotFoundException e) {
			
			String errMessage = "Error!";
			
			System.out.println(errMessage);
			
		}

	}
	
	static void bubbleSort(int n, String [] name, String [] phone) {
		
		for (int i = n-1; i>0; i--) {
			for (int j = 0; j<i; j++) {
				if (name[j].compareTo(name[j+1]) > 0) { //string compare == string1.compareTo(string2)
					String saveName = name[j];
					String savePhone = phone[j];
					
					name[j] = name[j+1];
					phone[j] = phone[j+1];
					name[j+1] = saveName;
					phone[j+1] = savePhone;
							
					
				}
				
			}
		}
	}

}
