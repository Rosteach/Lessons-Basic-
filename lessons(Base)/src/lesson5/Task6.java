/*Task 6(indexOf). �������� ����� � �������� ��������� ������ ��������� 2 ������ s � s1.
 ���������� ������ �� ������ s � ������ s1.(�������� �� s ���������� s1).
 ����� ������ ������� �������� boolean. (true - ���� ������) */

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