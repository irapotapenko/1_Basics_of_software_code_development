package Cycle;

import java.util.Scanner;
/*��� ������� ������������ ����� � ���������� �� m �� n ������� ��� ��������, 
����� ������� � ������ �����. m � n �������� � ����������.*/
public class task7 {
	public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ ��������");
        int m = in.nextInt();
        System.out.println("������� �������� ��������");
        int n = in.nextInt();
        int i;
        if (m <= n) {
        	
            for (i=m; i<=n;i++) {
            	System.out.print("\n��� ����� " + i + " ����� ��������� �������� - ");
            	int count=0;
                for (int j = 2; j < i; j++) {
                   if (i % j == 0) { 
                	   System.out.print(j + ", "); count++; 
                   }
                }
                if (count == 0) {
                    if (i == 1) {
                        System.out.print("�������� ������ 1");
                    } 
                    else {
                        System.out.print("�������� ������  1 � " + i);
                    }
                }
            }
        } 
        else System.out.println("����� �������� ��������");
	}
}
