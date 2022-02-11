package Cycle;

//Вычислить значения функции на отрезке [а,b] c шагом h
import java.util.Scanner;
public class task2 {
	public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое значение");
        int a = in.nextInt();
        System.out.println("Введите конечное значение");
        int b = in.nextInt();
        System.out.println("Введите шаг");
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
