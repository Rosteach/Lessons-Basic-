/*Task4. (while)�������� ���������, �� ������ ����� �� �����: k,k-1,k-2...,2,1
 ��� k - ������� � �������.*/

package lesson3;
import java.util.Scanner;
public class task4done {
	public static void main(String[] args){
		  f();
		 } 
		 public static void f(){
		  Scanner scan = new Scanner(System.in);
		  System.out.println("Enter number:");
		  int k = scan.nextInt();
		  
		  int i = k;
		  while (i>=1){
			  System.out.println(i+",");
			  i--;
		  }
}
}