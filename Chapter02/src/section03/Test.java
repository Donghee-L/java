package section03;

// static && non-static;;


public class Test {
	public static int s = 0; //static ����� class ����̴�
	public int t = 0;  // non-static ����� object ����̴�
	
	public static void print1() {
		System.out.println("s = " + s);
		//System.out.println("t = " + t); static => non-static X
	}
	
	public void print2() {
		System.out.println("s = " + s);
		System.out.println("t = " + t); // not - static => static ������ ����
	}
	
	
}
