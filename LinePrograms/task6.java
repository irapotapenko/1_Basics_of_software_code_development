package LinePrograms;
import java.util.Scanner;
import java.lang.*;
//��� ������ ������� ��������� �������� ���������, ������� �������� true, 
//���� ����� � ������������ (�, �) ����������� ����������� �������, � false � � ��������� ������:
public class task6 {
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("������� x = ");
        int x = in.nextInt();
        System.out.println("������� y = ");
        int y = in.nextInt(); 
        if (((x <= 4) && (x>=-4) && (y>=-3) && (y<=0)) || ((y>=0)&&(y<=4)&&(x>=-2)&&(x<=2))) {
        	System.out.println("true");
        }
        else System.out.println("false");
      
    }      
}
