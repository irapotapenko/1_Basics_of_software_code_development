package LinePrograms;
import java.util.Scanner;
import java.lang.*;
//ƒл€ данной области составить линейную программу, котора€ печатает true, 
//если точка с координатами (х, у) принадлежит закрашенной области, и false Ч в противном случае:
public class task6 {
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите x = ");
        int x = in.nextInt();
        System.out.println("¬ведите y = ");
        int y = in.nextInt(); 
        if (((x <= 4) && (x>=-4) && (y>=-3) && (y<=0)) || ((y>=0)&&(y<=4)&&(x>=-2)&&(x<=2))) {
        	System.out.println("true");
        }
        else System.out.println("false");
      
    }      
}
