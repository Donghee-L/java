import java.util.Scanner;

// ����ڷκ��� ������ ���� n�� �Է¹޴´�
// n���� ������ �Է¹޾� ������� �迭�� �����Ѵ�.
// �ߺ��� �������� ������ ī��Ʈ�Ͽ� ����϶�.



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
