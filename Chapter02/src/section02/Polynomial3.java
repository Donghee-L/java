package section02;

public class Polynomial3 {
	
	public char name;
	public int nTerms;
	public Term3 [] terms;
	
	public Polynomial3(char n) {
		name = n;
		nTerms = 0;
		terms = new Term3[100];
	}
	
	int calcPolynomial(int x) {
		int result = 0;
		for (int i = 0; i<nTerms; i++) {
			result += terms[i].calcTerm(x);
			
		}
		
		return result;
				
	}
}
