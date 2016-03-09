/*Task3. Ввести переменную с клавиатуры. Если четное, то вывести на экран «четное». Если нет, то вывести на экран «нечетное».*/

package lesson2;
import java.util.Scanner;
public class task3done {
	public static void main(String[] args){
		  Scanner scan = new Scanner(System.in);
		  System.out.println("enter variable");
		  int n = scan.nextInt();
		  if(n == (n/2)*2){
		   System.out.println("четное");
		  } else System.out.println("нечетное");
}}


