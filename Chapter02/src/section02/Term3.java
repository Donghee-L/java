package section02;

public class Term3 {
	
	int coef;
	int expo;
	
	public Term3(int c, int e) {
		coef = c;
		expo = e;
	}
	
	int calcTerm(int x) {
		
		return (int) (coef*Math.pow(x,expo));
		
	}
	
	void printPolynomial() {
		System.out.println(coef + "x^" + expo);
	}
	
	
}
