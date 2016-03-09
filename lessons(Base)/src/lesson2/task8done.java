//Task8. Ввести двухзначное целое число. Провести валидацию. Определить первую цифру числа и вывести на экран.
package lesson2;
import java.util.Scanner;
public class task8done {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		  System.out.println("Enter number:");
		  //int k1 = scan.nextInt();
		  if( scan.hasNextInt() ){
		   int k = scan.nextInt();
		   if ((k>=10)&(k<100)){System.out.println(k/10);}
		   else if ((k>-100)&(k<=-10)){System.out.println(-(k/10));}
		   else if ((k<=-100)&(k>=100)){ System.out.println("Error");}
		   /*if ((k>=10)&(k<20))
            {System.out.println(1+(k-1));}
            else if ((k>=20)&(k<30)) 
            {System.out.println((k-(k-1))+1);}
            else if ((k>=30)&(k<40)) 
            {System.out.println((k-(k-1))+2);} 	
            else if ((k>=40)&(k<50)) 
            {System.out.println((k-(k-1))+3);}
            else if ((k>=50)&(k<60)) 
            {System.out.println((k-(k-1))+4);}
            else if ((k>=60)&(k<70)) 
            {System.out.println((k-(k-1))+5);}   
            else if ((k>=70)&(k<80)) 
            {System.out.println((k-(k-1))+6);}
            else if ((k>=80)&(k<90)) 
            {System.out.println((k-(k-1))+7);}
            else if ((k>=90)&(k<100)) 
            {System.out.println((k-(k-1))+8);}
            /*else if ((k>=-20)&(k<-10)) 
            {System.out.println(-((k-(k-1))+1));}
            else if ((k>=-30)&(k<-20)) 
            {System.out.println(-((k-(k-1))+1));}
            else if ((k>=30)&(k<40)) 
            {System.out.println(-((k-(k-1))+2));} 	
            else if ((k>=40)&(k<50)) 
            {System.out.println(-((k-(k-1))+3));}
            else if ((k>=50)&(k<60)) 
            {System.out.println(-((k-(k-1))+4));}
            else if ((k>=60)&(k<70)) 
            {System.out.println(-((k-(k-1))+5));}   
            else if ((k>=70)&(k<80)) 
            {System.out.println(-((k-(k-1))+6));}
            else if ((k>=80)&(k<90)) 
            {System.out.println(-((k-(k-1))+7));}
            else if ((k>=90)&(k<100)) 
            {System.out.println(-((k-(k-1))+8));}*/		
	}
	}
}