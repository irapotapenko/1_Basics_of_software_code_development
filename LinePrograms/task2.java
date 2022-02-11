package LinePrograms;
import java.util.Scanner;
import java.lang.*;
//Вычислить значение выражения по формуле 
//(все переменные принимают действительные значения):
//(b+sqrt(b^2+4ac))/2a-a^3*c+b^(-2)
public class task2 {
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("Введите a = ");
        double a = in.nextDouble();
        System.out.println("Введите b = ");
        double b = in.nextDouble();
        System.out.println("Введите c = ");
        double c = in.nextDouble();
        double y;
        if (2 * a != 0) {
        	if ((Math.pow(b,2)+4*a*c)>=0) {
        		y= (b + Math.sqrt(Math.pow(b,2)+4*a*c)) / (2 * a) - Math.pow(a,3)*c+ Math.pow(b,-2);
        		System.out.printf("Значение выражения: y = %.2f",y);
        	}
        	else System.out.println("Ошибка! Значение выражения под корнем отрицательное");
        }
        else System.out.println("Ошибка! Деление на 0");
    }      
}
