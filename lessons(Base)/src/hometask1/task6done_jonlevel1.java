/*(jon)��������.
������������ ������ ���������� �����, ���������� � ����� ��� ��������� �������� (��������� ������� ���������)
���� ����� ��������� ����� ����������, �� �������� 0
������:
-2 2
2*/

package hometask1;
import java.util.Scanner;
public class task6done_jonlevel1 {
	public static void main(String[] args){
	 System.out.println("Enter point coordinates:");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		if (x<0) {if(y<0) System.out.println(3);
		         else if (y>0) System.out.println(2);
		         else System.out.println("0");}
		else if (x>0)
		        {if (y<0) System.out.println(4);
		              else if (y>0) System.out.println(1);
		              else System.out.println("0");}
		else System.out.println("0");
	}
}
