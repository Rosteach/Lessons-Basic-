/*Task6: Запросить кол-во лет у пользователя. Вывести на экран: 
 - диапазон возраста(от 0 до 9 или от 10 до 19 или от 20 до 29) 
 - рекомендуемый уровень занятий:(от 2 до 6 садик, от 7 до 16 в школу, от 17 до 22 в университет, от 23 - на работу)*/

package lesson2;
import java.util.Scanner;
public class task6 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are u?");
		int n = scan.nextInt();
		//if ((n>=0)&(n<=9))
		//{System.out.println("Age from 0 till 9!");}
		//else if ((n>=10)&(n<=19))
		//{System.out.println("Age from 10 till 19!");}
		//else if((n>=20) & (n<=29)) {System.out.println("Age from 20 till 29!");}
		if((n>=2)&(n<=6)){System.out.println("Recomended garden!");} 
		else if((n>7)&(n<16)){System.out.println("Recomended school!");} 
		else if((n>=17)&(n<=22)){System.out.println("Recomended university!");} 
		else if(n>=23) {System.out.println("Go work!");} 
		
}
}
