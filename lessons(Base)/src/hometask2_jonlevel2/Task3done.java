/*3) ������� �������������
�������� ����� � ������� �������� ����������� ������������� �� ���������, ������ � ������ ���������� ������ � �������� ���������
� ������, ���� ����� �� �������� ����� ������������ ��������, �������� ���������, ��������: �������� �������� ������.
�������� ������: drawRectangle
������:
 drawRectangle(3, 4)
****
****
****
*/

package hometask2_jonlevel2;
import java.util.Scanner;
public class Task3done {
	
      public static void drawRectangle(int height,int weidth){
           if(height<1) {System.out.println("�������� �������� ������");}
           else if (weidth<1) {System.out.println("�������� �������� ������");}
           else
            for(int j=0;j<height;j++){
            for(int i=1;i<weidth;i++){
   		   System.out.print("*");
   		 
            }
            System.out.println("*");
   		   }
     }
      public static void main(String[] args){
    	  Scanner scan = new Scanner(System.in);
    	  if( scan.hasNextInt() ){
    	  int height = scan.nextInt();
    	 int weidth = scan.nextInt();
    	  System.out.println("drawRectangle"+"("+height+","+weidth+")");
          drawRectangle(height,weidth);
         
      }
      
}}
