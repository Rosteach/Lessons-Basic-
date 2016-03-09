//Запросить у пользователя четырехзначное число. Определить есть ли в нем хоть один 0, используя только один if.

package lesson2;
import java.util.Scanner;
public class task13done {
	public static void main(String[] args){
	System.out.println("Введите четырехзначное число:");
	Scanner scan = new Scanner(System.in);
	int x = scan.nextInt();
	int a=x/1000;
	int b=(x/100)-a*10;
	int c=(x/10)-a*100-b*10;
	int d=x-a*1000-b*100-c*10;
	if ((a==0)|(b==0)|(c==0)|(d==0))
	 {System.out.println("Есть 0");}
	else {System.out.println("Error");}
}
}
