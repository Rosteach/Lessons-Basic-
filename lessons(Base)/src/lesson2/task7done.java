//Запросить число. Вывести на экран удвоенное число. 
//Если не число то сообщить ему об этом.
package lesson2;

import java.util.Scanner;

	public class task7done {
		 public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		  System.out.println("Введите число:");
		  //int k1 = scan.nextInt();
		  if( scan.hasNextInt() ){
		   int k = scan.nextInt();
		   System.out.println( 2 * k);
		  } else {
		   System.out.println("Вы ввели не число");   
		   //k=0;
		  } 
		  //k++;
		 }
		}


