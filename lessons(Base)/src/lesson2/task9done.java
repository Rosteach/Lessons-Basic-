//Task9. ¬вести с консоли целую переменную X, затем вторую целую переменную Y. 
//ѕровести валидацию. ѕомен€ть значени€ переменных местами и вывести их на экран.
package lesson2;
import java.util.Scanner;
public class task9done {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter X:");
        System.out.println("Enter Y:");
		if (scan.hasNextInt()){
			int x = scan.nextInt();
			int y = scan.nextInt();
			x = x+y;
			y = x-y;
			x = x-y;
			{System.out.println(x);}
			{System.out.println(y);}     }
}}
