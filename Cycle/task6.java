package Cycle;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
public class task6 {
	public static void main(String[] args){
        System.out.print("ASCII символы и коды:\n № символ");
        for (int i = 33; i < 256; i++) {
        	char ch = (char) i;     
        	System.out.printf("\n%03d %3s", i, ch);
        }
	}
}
