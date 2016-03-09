/*Ввести дробную переменную с клавиатуры. Вывести на экран округленное значение до целого*/

package lesson1;
import java.util.Scanner;
public class task8 {
	public static void main(String[] args){
    	Scanner scan = new Scanner(System.in);
    	System.out.println("enter variable:");
	    double n = scan.nextDouble();
	    int m= (int)(n);
	    double k = ++m;
	    int r =(int)(k);
	    {System.out.println(m);}
	   /* int m = (int) Math.round(n);*/ 
	    scan.close();
   }
   
}
