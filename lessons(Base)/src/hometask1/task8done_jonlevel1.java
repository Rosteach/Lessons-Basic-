/*(jon) Высокосный год.
Пользователь вводит год, определить является ли он високосным
(год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400)
Пример:
2014
Невисокосный*/

package hometask1;
import java.util.Scanner;
public class task8done_jonlevel1 {
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     int n = scan.nextInt();
     int kraten = n - ((n/4)*4);
     int nekraten = n - ((n/100)*100);
     int kraten400 = n - ((n/400)*400);
     {if ((kraten==0)&(nekraten!=0)|(kraten400==0)) {System.out.println("Високосный");}
     else {System.out.println("Невисокосный");}}
    	
}
}