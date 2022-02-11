package Cycle;

import java.util.Scanner;
/*Для каждого натурального числа в промежутке от m до n вывести все делители, 
кроме единицы и самого числа. m и n вводятся с клавиатуры.*/
public class task7 {
	public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое значение");
        int m = in.nextInt();
        System.out.println("Введите конечное значение");
        int n = in.nextInt();
        int i;
        if (m <= n) {
        	
            for (i=m; i<=n;i++) {
            	System.out.print("\nДля числа " + i + " будут следующие делители - ");
            	int count=0;
                for (int j = 2; j < i; j++) {
                   if (i % j == 0) { 
                	   System.out.print(j + ", "); count++; 
                   }
                }
                if (count == 0) {
                    if (i == 1) {
                        System.out.print("Делитель только 1");
                    } 
                    else {
                        System.out.print("Делители только  1 и " + i);
                    }
                }
            }
        } 
        else System.out.println("Задан неверный диапазон");
	}
}
