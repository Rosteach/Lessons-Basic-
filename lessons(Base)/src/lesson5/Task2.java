/*Task2. Написать метод, принимающий двухмерный квадратный массив и заполняющий:
 01,02,03,04
 05,06,07,08
 09,10,11,12
 13,14,15,16*/

package lesson5;
import java.util.Scanner;
public class Task2 {
    
	 
	  public static void printVector(int[][] vect){
	  for(int i = 0; i < vect.length;i++){
		   for(int j = 0;j<vect[i].length;j++)
		   System.out.print(vect[i][j]+" ");
		   
		   System.out.println(" ");}
	  }
	  public static void poryadok(int[][] vect){ 
		
		 int element = 0;
		 for(int i = 0; i < vect.length;i++){
			   for(int j = 0;j<vect[i].length;j++)
				  vect[i][j]=element++;
			   }}
		 		
	  public static void main(String[] args){
		  Scanner scan = new Scanner(System.in);
		int i = scan.nextInt(),j=scan.nextInt();
		  int[][] vect = new int [i][j];
		  poryadok(vect);
		  printVector(vect);
		  scan.close();
	}
}