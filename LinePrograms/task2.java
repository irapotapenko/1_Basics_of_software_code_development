package LinePrograms;
import java.util.Scanner;
import java.lang.*;
//��������� �������� ��������� �� ������� 
//(��� ���������� ��������� �������������� ��������):
//(b+sqrt(b^2+4ac))/2a-a^3*c+b^(-2)
public class task2 {
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("������� a = ");
        double a = in.nextDouble();
        System.out.println("������� b = ");
        double b = in.nextDouble();
        System.out.println("������� c = ");
        double c = in.nextDouble();
        double y;
        if (2 * a != 0) {
        	if ((Math.pow(b,2)+4*a*c)>=0) {
        		y= (b + Math.sqrt(Math.pow(b,2)+4*a*c)) / (2 * a) - Math.pow(a,3)*c+ Math.pow(b,-2);
        		System.out.printf("�������� ���������: y = %.2f",y);
        	}
        	else System.out.println("������! �������� ��������� ��� ������ �������������");
        }
        else System.out.println("������! ������� �� 0");
    }      
}
