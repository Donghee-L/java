package section03;


public class TestTest {
	
	public static void main(String[] args) {
		
		Test test1 = new Test();
		Test test2 = new Test();
		
		test1.t = 10;
		test2.t = 20;
		
		Test.s = 100;
		
		test1.print2();
		
		test2.print2();
		
	}
	
	
	
	

}
