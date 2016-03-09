/*Task 5(charAt). Написать метод, определяющий равны ли первый и последний символ в строке.*/

package lesson5;

import java.util.Scanner;

public class Task5 {
      public static void compare (String s){
    	  char value1=s.charAt(0);
    	  char value2=s.charAt(s.length()-1);
    	  	if(value1==value2){System.out.print("Success");}
    	  	else{System.out.print("Collapse");}
    	       }
      public static void main(String[] args){
    	  Scanner scan = new Scanner(System.in);
    	   String s = scan.next();
    	   compare(s);
      scan.close();
      }
}

