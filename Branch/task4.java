package Branch;

import java.util.Scanner;
//������ ������� �, � �������������� ��������� � ������� �, �, z �������. 
//����������, ������� �� ������ ����� ���������.
public class task4 {
	public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������� �������������� ��������� ");
        System.out.println("������� � = ");
        int a  = in.nextInt();
        System.out.println("������� B = ");
        int b  = in.nextInt(); 
        System.out.println("������� ������� ������� ");
        System.out.println("������� x = ");
        int x  = in.nextInt();
        System.out.println("������� y = ");
        int y  = in.nextInt(); 
        System.out.println("������� z = ");
        int z  = in.nextInt(); 
        if ((a>0)&&(b>0)&&(x>0)&&(y>0)&&(z>0)) {
        if (((a>=x) && (b>=y)) || ((a>=y) && (b>=x)) 
        || ((a>=x) && (b>=z)) || ((a>=z) && (b>=x)) 
        || ((a>=z)&& (b>=y)) || ((a>=y) && (b>=z))) {
        	System.out.println("������ ������� ����� �������� ���������");
        }
        else System.out.println("������ �� ������� ����� �������� ���������");
        }
        else System.out.println("������ �� ����� ���� ������ 0");
	}
}
