package LinePrograms;
import java.util.Scanner;
import java.lang.*;
/*���� ����������� ����� �, ������� ������������ ������������ ���������� ������� � ��������. 
������� ������ �������� ������������ � �����, ������� � �������� � ��������� �����:
��� ����� SSc.*/
public class task5 {
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������������ � �������� = ");
        int t = in.nextInt(); 
        if (t>=0) {
         	int M = t / 60;         //����� ����� �����    
            int S = t - (M * 60);   //����� ������
            int H = M / 60;         //����� �����
            M = M - (H * 60);   //����� �����
            System.out.printf("������������ � �����, ������� � �������� (��� ����� SSc): %d� %d��� %d�", H, M, S);
        }
        else System.out.print("������������ �� ����� ���� �������������"); 
    }
        
}