package Cycle;

//������� �� ����� ������������ ����� ��������� � �� ���������� ������������� � ������ ����������.
public class task6 {
	public static void main(String[] args){
        System.out.print("ASCII ������� � ����:\n � ������");
        for (int i = 33; i < 256; i++) {
        	char ch = (char) i;     
        	System.out.printf("\n%03d %3s", i, ch);
        }
	}
}
