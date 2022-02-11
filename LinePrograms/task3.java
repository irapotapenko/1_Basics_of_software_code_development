package LinePrograms;
import java.util.Scanner;
import java.lang.*;
//Вычислить значение выражения по формуле 
//(все переменные принимают действительные значения):
//((sinx+cosy)/(cosx-siny))*tgxy
public class task3 {
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("Введите x = ");
        double x = in.nextDouble();
        System.out.println("Введите y = ");
        double y = in.nextDouble();
        double f;
        f=(Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y);
        System.out.printf("Значение выражения: y = %.2f",f);
    
    }      
}
