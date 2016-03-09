/*5) ��������� ���������
�������� ����� � ������� ����������� �������� ������� � �������� �������(������ �����������, � �� ��������� �� �����)
� ������, ���� ������ ������� ������������, �������� ��������� "�������� ������ �������"
�������� ������: revertVector
������:
 revertVector(int[] vector); // [1234567]
[7654321]*/

package hometask2_jonlevel2;

import java.util.Scanner;

public class Task5 {
	
	public static void revertVector(int[] vector){
		int i = 0;
			
		for( i = 0; i < vector.length;i++)
		 {System.out.print(vector[i]+", ");}
		 System.out.println();
		
	    if(vector.length>1){
		int [] revertedVector = new int[vector.length];
	       	for ( i=0;i<vector.length;i++){
			revertedVector[i]=vector[vector.length-1-i];
		}
	        for ( i=0;i<vector.length;i++){
			vector[i]=revertedVector[i];}
	        
	        {System.out.print(vector[i]+", ");}
	    }
	    else {System.out.print("�������� ������ �������");}
	}
	
	
	
public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	  final int LENGTH = scan.nextInt();
	 
	  int [] vector = new int[LENGTH];
	  for(int i = 0; i < vector.length;i++){
		   vector[i] = (int)(10 * Math.random());}
	  revertVector(vector);
	  
	  
	  scan.close();
	  }
}



