/*Task1. �������� ���������, ��� � ����� �������� ���������� ������ � ������, ������� ��������� � �������� ��������� ���� ������:
 - ����� ���������� ����������� ������� ���������� ������� �� 10 �� 20
 - ����� ������ ����������� ������� �� ����� 
 - ����� ���������� �������� ���� ��������� �����*/

package lesson5;

import java.util.Scanner;

public class Task1 {
	      public static void fillVector(int[][] vect){ 
		  for(int i = 0; i < vect.length;i++){
			  for(int j = 0;j<vect[i].length;j++)
		   vect[i][j] = (int)(100 * Math.random());}
		  } 
		  public static void printVector(int[][] vect){
		  for(int i = 0; i < vect.length;i++){
			   for(int j = 0;j<vect[i].length;j++)
			   System.out.print(vect[i][j]+" ");
			   
			   System.out.println(" ");}
		  }
		  public static void MatrixX2(int[][] vect){ 
			
			 //fillVector(vect);
			 for(int i = 0; i < vect.length;i++){
				   for(int j = 0;j<vect[i].length;j++)
					   vect[i][j]=2*vect[i][j];}
			  }
			 
			
		  public static void main(String[] args){
			  Scanner scan = new Scanner(System.in);
			int i = scan.nextInt(),j=scan.nextInt();
			  int[][] vect = new int [i][j];
			  fillVector(vect);
			  printVector(vect);
			  MatrixX2(vect);
			  printVector(vect);
		}
}