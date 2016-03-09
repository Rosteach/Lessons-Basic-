/* Пользователь вводит два числа, вычислить их сумму и вывести на экран
Пример:
5
12
17*/
package jonlevel1;
import java.util.Scanner;
public class task5_summadone { 
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextInt()){
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println(a+b);
		}
	}

}
