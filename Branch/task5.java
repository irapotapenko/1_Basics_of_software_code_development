package Branch;

import java.util.Scanner;
//��������� �������� �������
public class task5 {
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("������� X");
        int x = in.nextInt();
        double y;
        if (x<=3) { 
        	y = Math.pow(x,2)-3*x+9;  
            System.out.println("�������� ��������� y= "+y);
        }
        else  {  
            if (Math.pow(x,3)+6!=0) {
                y =1 / (Math.pow(x,3)+6);
                System.out.println("�������� ��������� y= "+y);
            }
            else System.out.println("������! ������� �� 0");
        }  
    }      
}


