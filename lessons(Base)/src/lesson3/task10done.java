/*Task10. ������� ������ ����� ����� �������� 10, ��������� ������ ���������� �� 0 �� 25, 
 ������� ������ �� �����.*/

package lesson3;

public class task10done {
	public static void main(String[] args) {
		  int[] vector = new int[10];
		  for(int i = 0; i < vector.length; i++){
		   vector[i] =  (int)(25 * Math.random());
		  }
		  for(int i = 0; i < vector.length; i++){
		   System.out.print(vector[i] + ", ");
		  }
}}
