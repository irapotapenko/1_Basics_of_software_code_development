package LinePrograms;
import java.util.Scanner;
import java.lang.*;
//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). 
//Поменять местами дробную и целую части числа и вывести полученное значение числа.
public class task4 {
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число = ");
        double x = in.nextDouble();
        double y = (x * 1000) % 1000 + (int) x / 1000.0;
        System.out.printf("Полученное число: y = %3.3f",y);
    }      
}