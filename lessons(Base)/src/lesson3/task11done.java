/*Task11. Создать массив из n элементов целых чисел. Заполнить случайными значениями от 0 до 100.
 Во 2-й элемент поместить сумму 2-го и 3-го элемента.*/

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


