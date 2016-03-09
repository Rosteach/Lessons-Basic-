/*Task3. (for)Считать с консоли два числа, например k и n.(k > n).
 Вывести числа от k до n.*/

package lesson3;
import java.util.Scanner;
public class task3done {
	public static void main(String[] args){
		  f();
		 } 
		 public static void f(){
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Введите число:");
		  int k = scan.nextInt();
		  int n = scan.nextInt();
		  for (int i=k;i>n;--i){System.out.println(i+",");}
              

}}
