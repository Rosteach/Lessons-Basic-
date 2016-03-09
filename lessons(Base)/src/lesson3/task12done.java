/*Task12. Создать массив из n элементов целых чисел. Заполнить случайными значениями от 0 до 100.
 Поменять местами первый и последний элемент.*/

package lesson3;

public class task12done {
	public static void main(String[] args) {
		
		  int[] vector = new int[10];
		  for(int i = 0; i < vector.length; i++){
		   vector[i] =  (int)(100 * Math.random());
		   System.out.print(vector[i] + ", ");
		  }
		  System.out.println();
		  int r = vector[0]-vector[9];
		  vector[0]=vector[0]-r;
		  vector[9]=vector[9]+r;
		 
		  for(int i = 0; i < vector.length; i++){	
		   System.out.print(vector[i] + ", ");
		  }
}
}