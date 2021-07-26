package section01;

import java.util.Scanner;

public class Code05 {
	
	static Polynomial [] polys = new Polynomial [100];
	static int n = 0;
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		while (true) {
			System.out.print("$ ");
			
			String command = kb.next();
			
			
			if (command.equals("create")) {
				char functionName = kb.next().charAt(0);

				polys[n] = new Polynomial();
				polys[n].name = functionName;
				
				n++;
				
			}	else if (command.equals("add")) {
				char functionName = kb.next().charAt(0);
				
				int index = find(functionName);
				
				if (index == -1) {
					System.out.println("해당하는 함수가 존재하지 않습니다.");
					continue;
				} else {
					int c = kb.nextInt();
					int e = kb.nextInt();
					
					addTerm(polys[index],c, e);
					
				}
				
			}	else if (command.equals("calc")) {
				
				char name = kb.next().charAt(0);
				
				int index = find(name);
				if(index == -1) {
					System.out.println("해당하는 함수가 존재하지 않습니다.");
				} else {
					int x = kb.nextInt();
					int result = calcPolynomial(polys[index],x);
					System.out.println(result);
				}
				
			}	else if (command.equals("print")) {
				char name = kb.next().charAt(0);
				
				int index = find(name);
				if(index == -1) {
					System.out.println("해당하는 함수가 존재하지 않습니다.");
				} else {
					System.out.println(polys[index].name);
				}
				
				
				
			}	else if (command.equals("exit")) {
				break;
			}
			
		}
		
		
		
		
		kb.close();


	}
	
	static int calcPolynomial(Polynomial p, int x) {
		int result = 0;
		
		for (int i = 0 ; i < p.nTerms; i++) {
			result += p.terms[i].coef * Math.pow(x, p.terms[i].exp);
		}
		
		return result;
	}
	
	static void addTerm(Polynomial p, int c, int e) {
		int index = findTerm(p,e);
		
		if (index == -1 ) {
			p.terms[p.nTerms] = new Term();
			p.terms[p.nTerms].coef = c;
			p.terms[p.nTerms].exp = e;
			p.nTerms++;
		} else {
			p.terms[index].coef += c;
		}
		
		
		
	}
	
	static int findTerm(Polynomial p, int e) {
		
		for (int i = 0; i < p.nTerms; i++) {
			if (p.terms[i].exp == e) {
				return i;
			}
		}
		
		
		return -1;
	}
	
	
	static int find(char name) {
		
		for (int i = 0; i < n; i++) {
			if (polys[i].name == name) {
				return i;
			}
		}
		
		return -1;
	}

}
