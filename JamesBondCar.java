import java.util.Random;

class JamesBondCar{ 

	static int rand1  = new Random().nextInt(2);// ������ ����, ������

// �� ��� �� ������ ��������. � �� �����)

	public static void main(String[] args) {
		int speed =  + 120; 
		
	Car c = new Car();
	c.colour = "silver"; // ��������� ����, ������ ����� 007 �� ����������
	c.name = "Audi"; // ������ ���� ������� �� ��� :)
	c.story(); // ����� ���������� ������ ������ :)
	c.start();
	if (speed == 120){
		System.out.println(" �������������� ����� AC DC High way to hell ����� � �������� 120 ��. �� ������ ���� �� ������ ������");
		System.out.println(" �� ���������, �������������� ���� ������� ������ � ������� ��������");
		System.out.println(" ��� ������� �� ������ 3000 ��. � ��������� �� ������ ���� ��� ���");
		c.drive(50); // ⳳ����������
	 c.stop(); // ������ ������. Like a boss

if (rand1 ==0){
			System.out.println("��� �� �� �� ��");
}else if  (rand1 ==1){
	System.out.println("������������");
}		 
	 }
	 c.fire();// ��� ������ ���� ���� ������ � ������ :)
	 c.end();// �����
		}
	}
// � �� ��� ������ ���� ������ �������