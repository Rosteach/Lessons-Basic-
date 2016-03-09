/*2) ¬ектор палиндром
Ќаписать класс с методом определ€ющий, €вл€етс€ ли массив палиндромом (одинаково читаетс€ и справа и слева)
ѕример палиндрома: 1234321
»м€ метода: isVectorPalindrom*/

package hometask2_jonlevel2;

import java.util.Scanner;

public class Task2done {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int end = scan.nextInt();
		int[] vector = new int[end];
		
		for(int i = 0; i < vector.length;i++){
	        vector[i] = (int)(10 * Math.random());
		}
		System.out.print(isVectorPalindrom(vector));
		
		scan.close();
	}
	public static boolean isVectorPalindrom (int[] vector)
	{
	    //boolean res=true;
		int i = 0;
		System.out.print("Vector: ");
		for(i = 0; i < vector.length;i++){
			System.out.print(vector[i]);
		}
		System.out.println();
		for(i = 0; i < vector.length;i++){
			if(vector[i]!=vector[vector.length-1-i])
			{
				//System.out.println("/");
				return false;
			}
		}
		return true;
		}
}
