//(jon) Больший меньший.
//Пользователь вводит три числа, вывести на экран большее и меньшее из них в строчку. 
//Пример:
//5
//2
//7
//7 2

package hometask1;
import java.util.Scanner;
public class task4done_jonlevel1 {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter numbers:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		if ((a>b)&(a>c))
			if (b>c) {System.out.println(a+" "+c);} 
			else {System.out.println(a+" "+b);}
		
		if ((b>a)&(b>c))
			if (a>c) {System.out.println(b+" "+c);} 
		    else {System.out.println(b+" "+a);} 
		
		if ((c>a)&(c>b)) 
		    if (a>b) {System.out.println(c+" "+b);}
		    else {System.out.println(c+" "+a);} 
	  
		 /* int max = 0, min =0;
	    if (a>b) {max = a; min =b;}
	    else {max = b; min = a;}
	    if (c>max) max=c;
	    if (c<min) min=c;
		System.out.println(max+" "+min);*/
	}}
	
	

