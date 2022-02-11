package Cycle;

import java.util.Scanner;

//Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
public class task8 {
	public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        int c;
        int d;
        System.out.println("Цифры, входящие в запись как первого так и второго числа");
        while (a > 0) {
            d = a % 10;
            a = a / 10;
            c = b;
            while (c > 0) {
                if (c % 10 == d) {
                	System.out.print(" "+d);
                    break;
                }
                c = c / 10;
            }
        }
	}
}
