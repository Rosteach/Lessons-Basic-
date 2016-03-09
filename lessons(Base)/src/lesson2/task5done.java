/*Task5: спросить количество лет пользователю. Если он совершеннолетний до 60 лет, то берем на работу. 
Иначе вывести сообщение, что он ребенок либо вывести сообщение, что он пенсионер.*/
package lesson2;
import java.util.Scanner;
public class task5done {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are u?");
		int n = scan.nextInt();
		if (n>=60){
		System.out.println("So old!");
		} else if (n<=18) {System.out.println("So young!");}
		else System.out.println("Congratulations!!");
	
	
	}}
