package Branch;
import java.util.Scanner;
//Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, 
//и если да, то будет ли он прямоугольным.
public class task1 {
	public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый угол = ");
        int firstAngle  = in.nextInt();
        System.out.println("Введите второй угол = ");
        int secondAngle  = in.nextInt(); 
        if (firstAngle <= 0 || secondAngle <= 0 || firstAngle + secondAngle >= 180)
        	 System.out.print("Такого треугольника нет!\n");
        else if (firstAngle == 90 || secondAngle == 90 || 180 - firstAngle - secondAngle == 90)
        	 System.out.print("Такой треугольник существует и он прямоугольный\n");
        else
        	 System.out.print("Такой треугольник существует\n");
	}
}
