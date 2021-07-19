
public class Code01 {

	static int num;
	
	public static void main(String[] args) {
		
		int anotherNum = 5;
		
		num = 2;
		
		System.out.println(num + anotherNum);
		
		System.out.println("Num: " + num);
		System.out.println("AnotherNum: " + anotherNum);
		
		System.out.println("Sum: " + num + anotherNum);
		// 같은 연산자가 나올경우 우선적용된 것을 기준으로 적용된다
		
		
	}
	
}
