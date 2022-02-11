package LinePrograms;
import java.util.Scanner;
import java.lang.*;
/*Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
ННч ММмин SSc.*/
public class task5 {
    public static void main(String[] args) {   
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длительность в секундах = ");
        int t = in.nextInt(); 
        if (t>=0) {
         	int M = t / 60;         //Общее число минут    
            int S = t - (M * 60);   //Число секунд
            int H = M / 60;         //Число часов
            M = M - (H * 60);   //Число минут
            System.out.printf("Длительности в часах, минутах и секундах (ННч ММмин SSc): %dч %dмин %dс", H, M, S);
        }
        else System.out.print("Длительность не может быть отрицательной"); 
    }
        
}