package section01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Code04 {
	
	static MyRectangle1 [] rects = new MyRectangle1 [100];
	static int n = 0;

	public static void main(String[] args) {
		
		String fileName = "data.txt";
		
		try {
			
			Scanner in = new Scanner(new File(fileName));
			
			while (in.hasNext()) {
				
				rects[n] = new MyRectangle1();
				rects[n].lu = new MyPoint1();
				
				rects[n].lu.x = in.nextInt();
				rects[n].lu.y = in.nextInt();
				rects[n].width = in.nextInt();
				rects[n].height = in.nextInt();
				
				n++;
				
			}
			
			
			in.close();
			
			
			
			
		} catch (FileNotFoundException e) {		
			System.out.println("The File is not Founded");
			System.exit(1);
		}
		
		bubbleSort();
		
		for (int i = 0; i < n; i++ ) {
			System.out.println(i + "'s width and height is " + rects[i].width + rects[i].height);
		}
		
		


	}
	
	static void bubbleSort() {
		
		
		for (int i = n-1; i > 0; i--) {
			for (int j = 0; j<i; j++) {
				if (rects[j+1].area() < rects[j].area()) {
					MyRectangle1 tmp = rects[j];
					rects[j] = rects[j+1];
					rects[j+1] = tmp;
				}
			}
		}
		
		
		
	}

}
