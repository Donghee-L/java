package section01;

// ������Ƽ�� Ÿ���� ��� �����ȿ� �ش� ���� ���������
// ������Ƽ�� Ÿ���� �ƴѰ��(ex Ŭ����) �����ȿ��� ���ο� ��ü�� ������ ����ִ� ������ �����Ѵ�.


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
