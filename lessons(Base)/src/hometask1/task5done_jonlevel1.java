/*(jon) �����*.
�������� ��� ���������� ���� byte � float, ������� �� ����� (������� byte, ����� float), �������� �� �������� �������,
�� ��������� �������������� ���������� � ������� �� ����� � ��� �� �������
������:
20 4
4 20*/

package hometask1;
import java.util.Scanner;
public class task5done_jonlevel1 {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  if( scan.hasNextByte() ){
		  byte b=scan.nextByte();
		  float f=scan.nextFloat();
		  System.out.println(b+" "+f);		  
		  
		  f=b+f;
		  b=(byte)(f-b);
		  f=(f-b);
		  
		 if ((f-(byte)(f)>0)|(f-(byte)(f)<0)){System.out.println(b+" "+(f-(f-(byte)(f))));}
	}
	}
}

