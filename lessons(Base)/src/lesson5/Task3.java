/*Task3. Написать метод, принимающий двухмерный квадратный массив и заполняющий:
 01,02,03,04
 08,07,06,05
 09,10,11,12
 16,15,14,13*/

package lesson5;
import java.util.Scanner;
public class Task3 {
    	 
	  public static void printVector(int[][] vect){
	  for(int i = 0; i < vect.length;i++){
		   for(int j = 0;j<vect[i].length;j++)
			   System.out.print(vect[i][j]+","+" ");
		   		   System.out.println(" ");}
	  }
	  public static void poryadok(int[][] vect){ 
		
		 int element = 1;
		 int j = 0;
		 int i = 0;
		 for(i= 0; i < vect.length;i++){
			   for(j= 0;j<vect[i].length;j++)
				  if(i%2==0)vect[i][j]=element++;
				  else vect[i][vect.length-1-j]=element++;
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


