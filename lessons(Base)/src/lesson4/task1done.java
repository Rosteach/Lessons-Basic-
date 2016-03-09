/*Task1. Написать 2 метода. Первый возвращает сумму из двух чисел. Второй ничего не возвращает, сумму он выводит на экран.*/

package lesson4;

public class task1done 
	
	{public static int summa(int a1, int b) {
		  int res = a1 + b;
		  b = 100;
		  return res;
		 }
		 public static void main(String[] args) {
		  int a = 10;
		  int b = 20;
		  int resultat = summa(a, b);// summa(10,20);
		  System.out.println(resultat);
		  printSumma(a, b);
		 }
		 public static void printSumma(int r1, int r2) {
		  int rSumma = r1 + r2; // = summa(r1 , r2);
		  System.out.println("сумма = " + rSumma);
		 }
		}

