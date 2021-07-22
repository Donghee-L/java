// 2차원 배열


package section02;

import java.util.Scanner;

public class Code18 {
	
	static int n;
	static int [][] arr;
	static int [][] direction = {{-1,0},{1,0},{0,-1},{0,1},{-1,-1},{-1,1},{1,-1},{1,1}};
			

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);		
		n = keyboard.nextInt();
		arr = new int [n][n];
		
		for (int i=0;i<n;i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = keyboard.nextInt();
			}
		}
		
		keyboard.close();
		
		for (int i = 0; i<n; i++) {
			for (int j=0;j<n; j++) {
				makeNum(i,j);
				
			}
		}
	}
	
	public static void makeNum(int i, int j) {
		for (int k = 0; k<8; k++) {
			int plusY = direction[k][0];
			int plusX = direction[k][1];
			int y = i;
			int x = j;
			int checkNum = 0;
			
			while (0<=y && y<n && 0<=x && x<n) {
				checkNum = checkNum * 10 + arr[y][x];
				if (isPrime(checkNum)) {
					System.out.println(checkNum);
				}
				y += plusY;
				x += plusX;
				
			}
		}
	}
	
	public static boolean isPrime(int num) {
		if (num < 2) return false;
		
		for (int i=2; i*i<=num;i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
