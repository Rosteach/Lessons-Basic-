/*Task11. ������� ������ �� n ��������� ����� �����. ��������� ���������� ���������� �� 0 �� 100.
 �� 2-� ������� ��������� ����� 2-�� � 3-�� ��������.*/

package lesson3;

public class task11done {
	public static void main(String[] args) {
		
		  int[] vector = new int[10];
		  for(int i = 0; i < vector.length; i++){
		   vector[i] =  (int)(100 * Math.random());
		   System.out.print(vector[i] + ", ");
		  }
		  System.out.println();
		  vector[1]=vector[1]+vector[2];
		  for(int i = 0; i < vector.length; i++){	
		   System.out.print(vector[i] + ", ");
		  }
          
	}}


