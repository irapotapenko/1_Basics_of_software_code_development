package Cycle;

import java.util.Scanner;

//���� �������� ��� � ��������� ����� �. ����� ����� ��� ������ ����, 
//������ ������� ������ ��� ����� ��������� �. ����� ���� ���� ����� ���...
public class task5 {
	public static void main(String[] args) { 
		Scanner in = new Scanner(System.in);
		System.out.println("������� e");
		double e = in.nextDouble();
		double sum=0;
		double n=100;
		for (int i = 0; i < n; i++) {
			double a = (1 / (Math.pow(2, i))) + (1 / (Math.pow(3, i)));
			if (Math.abs(a) >= e) {
				sum += a;
				n++;
			}
		}
		System.out.println("�����= "+sum);
	}
}
