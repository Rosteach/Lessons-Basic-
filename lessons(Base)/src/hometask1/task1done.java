//HomeTask1. Дано 2х значное число, вычислить разность между 
//цифрами этого числа.

package hometask1;
import java.util.Scanner;
public class task1done {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		if(scan.hasNextByte()){
		int x = scan.nextInt();
		int y = x/10;// first number
		int n = x-(y*10);// second number 
		{System.out.println(y-n);}	
		scan.close();
 }
}
}