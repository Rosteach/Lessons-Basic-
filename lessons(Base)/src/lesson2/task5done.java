/*Task5: �������� ���������� ��� ������������. ���� �� ���������������� �� 60 ���, �� ����� �� ������. 
����� ������� ���������, ��� �� ������� ���� ������� ���������, ��� �� ���������.*/
package lesson2;
import java.util.Scanner;
public class task5done {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("How old are u?");
		int n = scan.nextInt();
		if (n>=60){
		System.out.println("So old!");
		} else if (n<=18) {System.out.println("So young!");}
		else System.out.println("Congratulations!!");
	
	
	}}
