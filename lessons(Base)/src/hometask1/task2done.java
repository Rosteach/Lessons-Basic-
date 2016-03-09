//HomeTask2. Пользователь вводит 3 числа, вывести на экран большее из них.

package hometask1;
import java.util.Scanner;
public class task2done {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers:");
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c = scan.nextInt();
	if ((a>b)&(a>c)) {System.out.println(a);}
	else if ((b>a)&(b>c)) {System.out.println(b);}
	else {System.out.println(c);}
	}
	}
