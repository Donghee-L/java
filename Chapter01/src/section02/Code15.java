package section02;

import java.util.Scanner;

public class Code15 {
	
	
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int [] arr = new int [n];
		
		for (int i = 0; i<n; i++) {
			int inputNum = kb.nextInt();
			arr[i] = inputNum;
		}
		
		kb.close();
		
		bubbleSort(n, arr);
		
		for (int i = 0; i<n; i++) {
			System.out.println(arr[i]);
			
		}
		
	
	}
	
	static void bubbleSort(int n, int [] arr) {
		for (int i = n-1; i>0; i--) {
			for (int j = 0; j<i; j++) {
				if (arr[j] > arr[j+1]) {
					swap(arr, j);
				}
			}
		}
	}
	
	static void	swap(int [] arr, int j) {
		int tmp = arr[j];
		arr[j] = arr[j+1];
		arr[j+1] = tmp;
	}
	

}
