// ¬вести дробное денежное число в грн. с консоли. ¬ывести целое значение копеек. 
package lesson1;
import java.util.Scanner;
public class task6done {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
	    double m = scan.nextDouble();
	    int n = (int) (m);
	    double s = (m - n)*100;
	    int k = (int) (s);
	    /*int k = (int) (s);*/
		 System.out.println(k);
	}
}
