/*Ввести переменную1, переменную 2 с клавиатуры. Вывести на экран наибольшее.*/

package lesson2;
import java.util.Scanner;
public class task2done {

	public static void main(String[] args){
		  Scanner scan = new Scanner(System.in);
		  System.out.println("enter variable 1:");
		  int n = scan.nextInt();
		  System.out.println("enter variable 2:");
		  int m = scan.nextInt();
		  
		  if(n < m){
		   System.out.println(m);
		  } else if(n == m){
		   System.out.println(n);
		  } else System.out.println(n);
}}