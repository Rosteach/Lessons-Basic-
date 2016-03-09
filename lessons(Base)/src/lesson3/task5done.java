/*Task5. Считать с консоли два числа, например k и n.
 Вывести числа от k до n, при этом последовательность может быть возрастающая или убывающая.*/

package lesson3;
import java.util.Scanner;
public class task5done {
	public static void main(String[] args){
		  f();
		 } 
		 public static void f(){
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter numbers:");
		  int k = scan.nextInt();
		  int n = scan.nextInt();
		  if (k>n) {
		for(int i = k;i>n;i--) System.out.println(i+",");	  
		  }
		  else {for(int i = k;i<n;i++) System.out.println(i+",");}
		 }
		 }
