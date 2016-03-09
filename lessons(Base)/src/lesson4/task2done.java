/*Написать 2 метода. Первый возвращает максимум из двух чисел. Второй ничего не возвращает, максимум он выводит на экран.*/

package lesson4;

	public class task2done 
		
	{
			 public static int maximum(int a, int b) {
			  int max = 0;
			  if (a>b) max=a;
			  else max=b;
			  return max;
			 }
			 public static void main(String[] args) {
			  int a = 20;
			  int b = 50;
			  int resultat = maximum(a, b);// summa(10,20);
			  System.out.println(resultat);
			  printmaximum(a, b);
			 }
			 public static void printmaximum(int r1, int r2) {
				 				 
			  System.out.println("MAX = " + maximum(r1,r2));
			 }
		}
