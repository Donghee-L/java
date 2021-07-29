package section03;

// static && non-static;;


public class Test {
	public static int s = 0; //static 멤버는 class 멤버이다
	public int t = 0;  // non-static 멤버는 object 멤버이다
	
	public static void print1() {
		System.out.println("s = " + s);
		//System.out.println("t = " + t); static => non-static X
	}
	
	public void print2() {
		System.out.println("s = " + s);
		System.out.println("t = " + t); // not - static => static 접근은 가능
	}
	
	
}
