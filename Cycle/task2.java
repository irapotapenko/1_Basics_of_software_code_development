package Cycle;

//��������� �������� ������� �� ������� [�,b] c ����� h
import java.util.Scanner;
public class task2 {
	public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("������� ������ ��������");
        int a = in.nextInt();
        System.out.println("������� �������� ��������");
        int b = in.nextInt();
        System.out.println("������� ���");
        int h = in.nextInt();
        double y;
        int x;
        for(x = a; x <= b; x += h){
            if(x <= 2){
                y = -x;
                System.out.println("y="+y);
            } 
            else {
                y = x;
                System.out.println("y="+y);
            }
        }
	}
        
}
