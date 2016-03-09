/*Task7*. Аналогично, только внутри пробеллы.*/

package lesson3;
import java.util.Scanner;
public class task7_1 {
	public static void main(String[] args){
		  f();
		 } 
		 public static void f(){
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter width:");
		  System.out.println("Enter hieght:");
		  int w = scan.nextInt();
        int h = scan.nextInt();
         for(int j=0;j<h;j++) {
          for(int i=1;i<w;i++){
 		   System.out.print("*");
 		
          }
        
          System.out.println("*");
 		   }
		 }
		 }
