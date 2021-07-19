// Array , For loop, While loop
public class Code05 {

	public static void main(String[] args) {
		
		// in C, int grades[5];
		
		int [] grades; // grades 는 정수형 배열임을 선언
		grades = new int [5]; // 실제로 배열을 생성
		int whileI = 0;
		
		// int [] grades = new int [5]; 로도 표현 가능
		
		grades[0] = 100;
		grades[1] = 90;
		grades[2] = 80;
		grades[3] = 70;
		grades[4] = 60;
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println(grades[i]);
		}
		
		while (whileI < grades.length) {
			System.out.println(grades[whileI]);
			whileI ++;
		}
		
				
	}

}
