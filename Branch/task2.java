package Branch;
import java.util.Scanner;
//����� max{min(a, b), min(c, d)}.
public class task2 {
	public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("������� a = ");
        int a  = in.nextInt();
        System.out.println("������� b = ");
        int b  = in.nextInt(); 
        System.out.println("������� c = ");
        int c  = in.nextInt();
        System.out.println("������� d = ");
        int d  = in.nextInt(); 
        int min1, min2, max;
        if (a<b) {
        	min1=a;
        }
        else min1=b;
        
        if (c<d) {
        	min2=c;
        }
        else min2=d;
        
        if (min1>min2) {
        	max=min1;
        }
        else max=min2;
        
        System.out.printf("��������� max{min(%d, %d), min(%d, %d)} = %d", a,b,c,d,max);
	}
}
