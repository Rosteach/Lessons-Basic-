/*1) случайный вектор
Написать класс с методом заполняющий массив случайными числами в диапазоне от 0 до 10
Имя метода: fillVectorByRandom*/

package hometask2_jonlevel2;

public class Task1done {
  
	public static void main(String[] args){
		int[] vector = new int[10];
		fillVectorByRandom(vector);
	}
	public static void fillVectorByRandom(int[] vector){
	  for(int i = 0;i < vector.length;i++){
		   vector[i] = (int)(10 * Math.random());}		 
  }
}
