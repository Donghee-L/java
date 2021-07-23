package section01;

// 프리미티브 타입의 경우 변수안에 해당 값이 저장되지만
// 프리미티브 타입이 아닌경우(ex 클래스) 변수안에는 새로운 객체의 정보가 담겨있는 참조를 저장한다.


public class Code01 {

	public static void main(String[] args) {
		Person1 first;
		Person1 [] members= new Person1 [10];
		
		first = new Person1();
		
		first.name = "Dongs";
		first.number = "010-1234-5678";
		
		members[0] = first;
		
		Person1 second;
		
		second = first;
		
		second.name = "Change Dongs";
		second.number = "010-5678-1234";

				
	}

}
