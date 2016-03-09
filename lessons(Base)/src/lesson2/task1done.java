

package lesson2;
import java.util.Scanner;
public class task1done {
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("Введите число:");
  int k = scan.nextInt();
  if(k < 0){
   System.out.println("Это отрицательное");
  } else if(k < 10){
   System.out.println("Это цифра");
  } else System.out.println("Это число");
 }
}
 


