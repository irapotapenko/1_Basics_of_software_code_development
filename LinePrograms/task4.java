package LinePrograms;
import java.util.Scanner;
import java.lang.*;
//���� �������������� ����� R ���� nnn.ddd (��� �������� ������� � ������� � ����� ������). 
//�������� ������� ������� � ����� ����� ����� � ������� ���������� �������� �����.
public class task4 {
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("������� ����� = ");
        double x = in.nextDouble();
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.printf("���������� �����: y = %3.3f",y);
    }      
}