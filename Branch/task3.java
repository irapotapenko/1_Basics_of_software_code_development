package Branch;

import java.util.Scanner;

//���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). 
//����������, ����� �� ��� ����������� �� ����� ������.
public class task3 {
	public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ ����� x1 = ");
        int x1  = in.nextInt();
        System.out.println("y1 = ");
        int y1  = in.nextInt(); 
        System.out.println("������� ������ ����� x2 = ");
        int x2  = in.nextInt();
        System.out.println("y2 = ");
        int y2  = in.nextInt(); 
        System.out.println("������� ������ ����� x3 = ");
        int x3  = in.nextInt();
        System.out.println("������� y3 = ");
        int y3  = in.nextInt(); 
        if ((x2 - x1!=0) && (y2 - y1!=0)) {
        	if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
        		System.out.println("����� ����������� �� ����� ������");
        	}
        	else System.out.println("����� �� ����������� �� ����� ������");
        }
        else  System.out.println("������! ������� �� 0");
	}
}
