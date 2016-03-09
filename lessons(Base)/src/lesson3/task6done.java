/*Task6. Cчитать с клавиатуры число к. Вывести на экран к звездочек.*/

package lesson3;
import java.util.Scanner;
public class task6done {
	public static void main(String[] args){
		  f();
		 } 
		 public static void f(){
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter number:");
		  int k = scan.nextInt();
		   for(int i=0;i<k;i++)
		   System.out.println("*"); 
	
		 }
}
