package LinePrograms;
import java.util.Scanner;
//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.
public class task1 {
	   public static void main(String[] args) {   
	        Scanner in = new Scanner(System.in);
	        System.out.println("Введите a = ");
	        float a = in.nextFloat();
	        System.out.println("Введите b = ");
	        float b = in.nextFloat();
	        System.out.println("Введите c = ");
	        float c = in.nextFloat();
	        float z;
	        z = ((a-3) * b / 2)+c;
	        System.out.printf("Значение функции: z = %.1f",z);
	   }
}
