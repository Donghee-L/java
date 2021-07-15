import java.util.Scanner;

// 사용자로부터 정수의 개수 n을 입력받는다
// n개의 정수를 입력받아 순서대로 배열에 저장한다.
// 중복된 정수쌍의 개수를 카운트하여 룰력하라.



public class Code09 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int [] arr = new int [n];
		int result = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = keyboard.nextInt();
		}
		
		keyboard.close();
		
		for (int i = 0; i < n-1; i++) {
			for (int j = i+1; j < n; j++) {
				if (arr[i] == arr[j]) {
					result += 1;
				}
			}
		}
		
		
		System.out.println(result);
		
		
		
		

	}

}
