/*Task3. (for)������� � ������� ��� �����, �������� k � n.(k > n).
 ������� ����� �� k �� n.*/

package lesson3;
import java.util.Scanner;
public class task3done {
	public static void main(String[] args){
		  f();
		 } 
		 public static void f(){
		  Scanner scan = new Scanner(System.in);
		  System.out.println("������� �����:");
		  int k = scan.nextInt();
		  int n = scan.nextInt();
		  for (int i=k;i>n;--i){System.out.println(i+",");}
              

}}
