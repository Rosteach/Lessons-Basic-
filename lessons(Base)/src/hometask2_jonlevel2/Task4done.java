/*4) �������� � ������
�������� ����� � ������� �������� ������� �� ���������, ������ ����� ������, � ���������� � ����� � �������� ���������. ��������:
� ������, ���� �������� ������ ����� ������������ ��������, �������� ���������, ��������: �������� �������� ������
�������� ������: drawStair
������:
 drawStair(4)
*
**
***
*****/

package hometask2_jonlevel2;
import java.util.Scanner;
public class Task4done {
	public static void drawStair(int value){
        if(value<1) {System.out.println("�������� �������� ������");}
        else
         for(int j=value;j>0;j--){
        	 
         for(int i=value;i>1;i--){
        	 
         System.out.print("*");	 
         }
            value-=1;
         System.out.println("*");
		 }
  }
   public static void main(String[] args){
 	  Scanner scan = new Scanner(System.in);
 	  if( scan.hasNextInt() ){
 	  int value = scan.nextInt();
 	 
 	  System.out.println("drawStair"+"("+value+")");
       drawStair(value);
      
   }
   
}}


