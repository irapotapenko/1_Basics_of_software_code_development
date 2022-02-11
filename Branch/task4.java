package Branch;

import java.util.Scanner;
//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. 
//Определить, пройдет ли кирпич через отверстие.
public class task4 {
	public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размеры прямоугольного отверстия ");
        System.out.println("Введите А = ");
        int a  = in.nextInt();
        System.out.println("Введите B = ");
        int b  = in.nextInt(); 
        System.out.println("Введите размеры кирпича ");
        System.out.println("Введите x = ");
        int x  = in.nextInt();
        System.out.println("Введите y = ");
        int y  = in.nextInt(); 
        System.out.println("Введите z = ");
        int z  = in.nextInt(); 
        if ((a>0)&&(b>0)&&(x>0)&&(y>0)&&(z>0)) {
        if (((a>=x) && (b>=y)) || ((a>=y) && (b>=x)) 
        || ((a>=x) && (b>=z)) || ((a>=z) && (b>=x)) 
        || ((a>=z)&& (b>=y)) || ((a>=y) && (b>=z))) {
        	System.out.println("Кирпич пройдет через заданное отверстие");
        }
        else System.out.println("Кирпич не пройдет через заданное отверстие");
        }
        else System.out.println("Размер не может быть меньше 0");
	}
}
