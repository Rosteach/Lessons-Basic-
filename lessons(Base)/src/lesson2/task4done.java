package lesson2;
/*¬вести значение переменной, определить 
отрицательное, цифра или число.*/
import java.util.Scanner;
public class task4done {
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("¬ведите число:");
  int k = scan.nextInt();
  
  if(k < 0) System.out.println("Ёто отрицательное");
  
  if((k >= 0) && ( k < 10))
   System.out.println("Ёто цифра");
 

}
}
