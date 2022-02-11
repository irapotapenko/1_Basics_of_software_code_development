package Cycle;

//Найти сумму квадратов первых ста чисел.
public class task3 {
	public static void main(String[] args) { 
		int i, sum;
		sum=0;
		for (i=1; i<=100; i++) {
			sum += Math.pow(i,2);
		}
		System.out.println("sum="+sum);
	}

}
