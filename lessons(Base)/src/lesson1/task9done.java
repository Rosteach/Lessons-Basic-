/*Ввести целое двухзначное число. Вывести первую цифру на экран*/ 

package lesson1;
import java.util.Scanner;
public class task9done {
	public static strictfp void main(String[] args){
  Scanner scan = new Scanner(System.in);
  int n = scan.nextInt();
  int x = n/10;
  System.out.println(x);
	}
}
