package Cycle;

//��������� ��������� ���������� ������������ ��������� ������ ������� �����.
public class task4 {
	public static void main(String[] args) { 
		int i, pr;
		pr=1;
		for (i=1; i<=200; i++) {
			pr *= Math.pow(i,2);
		}
		System.out.println("������������ ��������� ������ ������� �����= "+pr);
	}
}
