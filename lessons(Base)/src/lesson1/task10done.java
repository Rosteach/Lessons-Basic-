/*Ввести дробное число. Вывести первую цифру после запятой на экран*/

package lesson1;
import java.util.Scanner;
public class task10done {
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
		System.out.println("Enter fractional number");
		double x = scan.nextDouble();
		int a = (int) (x);
		double b = (x - a)*10;
		int finalvalue = (int) (b);
		System.out.println(finalvalue);
    }
}
