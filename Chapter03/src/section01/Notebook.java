package section01;

public class Notebook extends Computer {
	
	public double screenSize;
	public double weight;
	
	
	public Notebook(String man, String pro, int ram, int disk, double speed,double size, double w) {

		super(man, pro, ram, disk, speed);

		screenSize = size;
		weight = w;
		
	}
	
	@Override
	public String toString() {
		
// protected  �� ���� �θ�Ŭ������ �����Ϳ� ���� ����
//		String result = "Manufacturer: " + manufacturer + "\n"
//				+ "processor: " + processor + "\n"
//				+ "ramSize: " + ramSize + "\n"
//				+ "diskSize: " + diskSize + "\n"
//				+ "processorSpeed: " + processorSpeed + "\n" 
//				+ "ScreenSize: " + screenSize + "\n"
//				+ "weight: " + weight + "\n";
		
		String result = super.toString()
				+ "ScreenSize: " + screenSize + "\n"
				+ "weight: " + weight + "\n";
		 
		
		return result;
	}
	

	public static void main(String[] args) {
		
//		Notebook gram = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);
		Computer gram = new Notebook("Dell", "i5", 4, 1000, 3.2, 15.6, 1.2);
//		�������� ���� �� ���� ������ ������ �ƴϴ�.
		
		System.out.println(gram.toString());
				
	}
	
}
