package Branch;

import java.util.Scanner;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). 
//Определить, будут ли они расположены на одной прямой.
public class task3 {
	public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую точку x1 = ");
        int x1  = in.nextInt();
        System.out.println("y1 = ");
        int y1  = in.nextInt(); 
        System.out.println("Введите вторую точку x2 = ");
        int x2  = in.nextInt();
        System.out.println("y2 = ");
        int y2  = in.nextInt(); 
        System.out.println("Введите третью точку x3 = ");
        int x3  = in.nextInt();
        System.out.println("Введите y3 = ");
        int y3  = in.nextInt(); 
        if ((x2 - x1!=0) && (y2 - y1!=0)) {
        	if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)) {
        		System.out.println("Точки расположены на одной прямой");
        	}
        	else System.out.println("Точки не расположены на одной прямой");
        }
        else  System.out.println("Ошибка! Деление на 0");
	}
}
