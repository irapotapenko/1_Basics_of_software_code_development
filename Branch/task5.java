package Branch;

import java.util.Scanner;
//Вычислить значение функции
public class task5 {
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("Введите X");
        int x = in.nextInt();
        double y;
        if (x<=3) { 
        	y = Math.pow(x,2)-3*x+9;  
            System.out.println("Значение выражения y= "+y);
        }
        else  {  
            if (Math.pow(x,3)+6!=0) {
                y =1 / (Math.pow(x,3)+6);
                System.out.println("Значение выражения y= "+y);
            }
            else System.out.println("Ошибка! Деление на 0");
        }  
    }      
}


