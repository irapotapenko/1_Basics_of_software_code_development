package Cycle;
//�������� ���������, ��� ������������ ������ ����� ����� ������������� �����. 
//� ��������� ��������� ��� ����� �� 1 �� ���������� ������������� �����.
import java.util.Scanner;
public class task1 {
	public static void main(String[] args) {
		System.out.print("������� ����� ����� ������������� �����: ");
		Scanner in = new Scanner(System.in); 
		int n = in.nextInt();
		int sum = 0;
		for (int i=1; i<= n; i++){
			sum = sum + i;
		}
		System.out.println ("�����= "+sum);		
	}
}
