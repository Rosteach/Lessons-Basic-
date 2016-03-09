/*Task3. Ќаписать метод factorial, вычисл€ющий факториал числа.*/

package lesson4;

import java.util.Scanner;

public class task3done {

	 public static long factorial (long a) {
		 long f = 1;
		
		 for (long i = 2 ;i<=a;i++) {
			 f*=i;
		   }
		
	   
	  return (f);}
	 
	 public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     long n = scan.nextLong();
		  factorial(n);
		 
		  printfacrtorial(n);
	
	 }
	 public static void printfacrtorial(long r1) {
		
	  System.out.println("Factorial = " + factorial(r1));
	 }
}


