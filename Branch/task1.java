package Branch;
import java.util.Scanner;
//���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, 
//� ���� ��, �� ����� �� �� �������������.
public class task1 {
	public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ ���� = ");
        int firstAngle  = in.nextInt();
        System.out.println("������� ������ ���� = ");
        int secondAngle  = in.nextInt(); 
        if (firstAngle <= 0 || secondAngle <= 0 || firstAngle + secondAngle >= 180)
        	 System.out.print("������ ������������ ���!\n");
        else if (firstAngle == 90 || secondAngle == 90 || 180 - firstAngle - secondAngle == 90)
        	 System.out.print("����� ����������� ���������� � �� �������������\n");
        else
        	 System.out.print("����� ����������� ����������\n");
	}
}
