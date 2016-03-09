
//Task8*. Аналогично Task8, только вводится любое int число.
package lesson2;
import java.util.Scanner;
public class task10 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		  System.out.println("Enter number:");
		  //int k1 = scan.nextInt();
		  if( scan.hasNextInt() ){
		   int k = scan.nextInt();
		   if ((k>=10)&(k<100)){System.out.println();}
		   else if ((k>-100)&(k<=-10)){System.out.println();}
		   
		  }
}}
