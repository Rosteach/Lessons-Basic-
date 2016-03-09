/*Task9.�������� ����� � ��������. 
 - ����� ���������� ������� ���������� ������� �� 0 �� 100. 
 - ����� ������ �� �����
 - ����� ������ ����� �������, ������� ��������� � �������� ����������: ������, 
 ������ �������� � �������� �������� � ������ �������� �� ������� ��������
 - �����, ������� ��������� � �������� ��������� ������ � ���������� ��� ������. 
 - ������� �����*/

package lesson4;

public class task9 {
	
	 public static void main(String[] args) {
		  int[] vector = new int[10];
		  fillVector(vector);
		  printVector(vector);
		  printPartVector(vector, 2, 8);
		  System.out.println(" size = " + getSizeVector(vector));
		 }
		 public static void fillVector(int[] vect){ 
		  for(int i = 0; i < vect.length;i++){
		   vect[i] = (int)(100 * Math.random());
		  }
		 }
		 public static void printVector(int[] vect){
			 fillVector(vect);
			 System.out.println(vect);
		 }
		 public static void printPartVector(int[] vect,
		       int indexBegin, int indexEnd){  
			 for(int i = indexBegin; i < indexEnd;i++){
				  System.out.println(vect[i]+","); ;
				  }
		 }
		 public static int getSizeVector(int[] vect){
		  return vect.length;
		 }
		}


