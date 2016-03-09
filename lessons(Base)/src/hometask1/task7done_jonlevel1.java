/*(jon) Цифры 7.
Пользователь вводит семизначное число, вывести в консоль среднее арифметическое его цифр
Пример:
1600061
2*/

package hometask1;
import java.util.Scanner;
public class task7done_jonlevel1 {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  if(scan.hasNextInt()){
		  int i = scan.nextInt();
		  int a = i/1000000;
		  int b = (i/100000)-a*10;
		  int c = (i/10000)-a*100-b*10;
		  int d = (i/1000)-a*1000-b*100-c*10;
		  int e = (i/100)-a*10000-b*1000-c*100-d*10;
		  int g = (i/10)-a*100000-b*10000-c*1000-d*100-e*10;
		  int k = i-a*1000000-b*100000-c*10000-d*1000-e*100-g*10;
		  System.out.println((a+b+c+d+e+g+k)/7);
		  }
	}		  
}
