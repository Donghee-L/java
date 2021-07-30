package section01;

// Computer is SuperClass / BaseClass
// Notebook is SubClass / ExtendedClass
// inheritance / override / polymorphism
// ������ = ����Ŭ���� Ÿ���� ������ ����Ŭ���� Ÿ���� ��ü�� ������ �� �ִ�.

public class Computer {
	
	protected String manufacturer;
	protected String processor;
	protected int ramSize;
	protected int diskSize;
	protected double processorSpeed;
	
	public Computer(String man, String pro, int ram, int disk, double speed) {
		
		manufacturer = man;
		processor = pro;
		ramSize = ram;
		diskSize = disk;
		processorSpeed = speed;
		
	}
	

	public String toString() {
		
		String result = "Manufacturer: " + manufacturer+ "\n"
				+ "processor: " + processor + "\n"
				+ "ramSize: " + ramSize + "\n"
				+ "diskSize: " + diskSize + "\n"
				+ "processorSpeed: " + processorSpeed + "\n";
		
		return result;
	}	
}
