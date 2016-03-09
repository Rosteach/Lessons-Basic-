/*Запросить у пользователя цифру в виде целого числа, провести валидацию введенного значения.
Если пользователь ввел не число или ввел не цифру, то сообщить ему об этом.
Вывести на экран текстовое название цифры.*/

package lesson2;
import java.util.Scanner;
public class Exmpl_task12 {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter numeric:");
		  if(scan.hasNextInt()){
			int n = scan.nextInt();
			switch (n){
			   case 1: System.out.println("One");break;
			   case 2: System.out.println("Two");break;
			   case 3: System.out.println("Tree");break;
			   case 4: System.out.println("Four");break;
			   case 5: System.out.println("Five");break;
			   case 6: System.out.println("Six");break;
			   case 7: System.out.println("Seven");break;
			   case 8: System.out.println("Eight");break;
			   case 9: System.out.println("Nine");break;
			   default: System.out.println("Error!");
			}
		  }
			 	}		  
}
