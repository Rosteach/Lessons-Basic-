/* ������������ ������ ������������ ����������� ���������.
 ������� �� ����� ����� ���������.
 ���� ������ ����������� ����� ����, �� ������� "������ ����������� �� ����� ���� 0".
 ���� ��������� �� ����� ������, �� ������� "��� �������������� ������� ���������".
 ���� ��������� ����� ��� �������, �� ������� �� � ������ ����� ������
 ������:
 1
 3
 -4
 1 -4*/

package jonlevel1;
import java.util.Scanner;
public class task6_kvadratnoe {
  public static void main (String[] args){
	  Scanner scan = new Scanner(System.in);
	  int a = scan.nextInt();
	  int b = scan.nextInt();
	  int c = scan.nextInt();
	  int d = b*b-(4*a*c);
	  int k = (int)(Math.sqrt(d));
	  if (a==0) {System.out.println("������ ����������� �� ����� ���� 0");}
	  else if (d<0) {System.out.println("��� �������������� ������� ���������");}
	  else {System.out.println((-b+k)/2*a+" "+(-b-k)/2*a);}
  }  
  
  }

