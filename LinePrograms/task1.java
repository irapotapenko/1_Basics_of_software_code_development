package LinePrograms;
import java.util.Scanner;
//������� �������� �������: z = ( (a � 3 ) * b / 2) + c.
public class task1 {
	   public static void main(String[] args) {   
	        Scanner in = new Scanner(System.in);
	        System.out.println("������� a = ");
	        float a = in.nextFloat();
	        System.out.println("������� b = ");
	        float b = in.nextFloat();
	        System.out.println("������� c = ");
	        float c = in.nextFloat();
	        float z;
	        z = ((a-3) * b / 2)+c;
	        System.out.printf("�������� �������: z = %.1f",z);
	   }
}
