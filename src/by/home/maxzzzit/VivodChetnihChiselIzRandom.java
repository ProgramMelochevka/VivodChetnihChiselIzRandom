package by.home.maxzzzit;
// ������ �����, ������� ���������� � ������� �� ����� ����� �� 10 ��������� �����������
// ������������� ����� � � ����������, ������� �������� � ���� ����� ���� �������.
// �������� � ����� 13, 45, 32, 67, 88, 45, 37, 79, 47, 13 ������� 2 ��������� ����� (32, 88)

public class VivodChetnihChiselIzRandom {
	static int rand, kolvo;
	public static void main(String[]args) {
		System.out.print("����� ��������� �����: ");
		for (int i=0; i<10; i++) {
		rand = 10+(int)(Math.random()*90);
		System.out.print(rand+ " ");
		if (rand%2==0)
			kolvo ++;		
		}
		System.out.print("������� "+kolvo+" ��������� �����");

	}
}
