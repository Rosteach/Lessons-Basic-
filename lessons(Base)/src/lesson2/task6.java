/*Task6: ��������� ���-�� ��� � ������������. ������� �� �����: 
 - �������� ��������(�� 0 �� 9 ��� �� 10 �� 19 ��� �� 20 �� 29) 
 - ������������� ������� �������:(�� 2 �� 6 �����, �� 7 �� 16 � �����, �� 17 �� 22 � �����������, �� 23 - �� ������)*/

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
