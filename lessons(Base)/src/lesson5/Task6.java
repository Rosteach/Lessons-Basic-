/*Task 6(indexOf). Написать метод в качестве параметра должен принимать 2 строки s и s1.
 Определить входит ли строка s в строку s1.(является ли s подстрокой s1).
 Метод должен вернуть значение boolean. (true - если входит) */

package lesson5;
import java.util.Scanner;
public class Task6 {
	public static boolean subString (String s,String s1){
  	  	if( s.indexOf(s1)>=0){return true;} 	       
	return false;
}
	 public static void main(String[] args){
   	  Scanner scan = new Scanner(System.in);
   	   String s = scan.next();
   	   String s1 = scan.next();
   	   	subString(s,s1);   
   	   	
}
}