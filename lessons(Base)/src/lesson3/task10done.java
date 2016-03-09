/*Task10. Создать массив целых чисел размером 10, заполнить любыми значениями от 0 до 25, 
 Вывести массив на экран.*/

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
