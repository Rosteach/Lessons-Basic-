/*(jon) ќбмен*.
ќбъ€вить две переменные типа byte и float, вывести на экран (сначала byte, затем float), помен€ть их значени€ местами,
не использу€ дополнительной переменной и вывести на экран в том же пор€дке
ѕример:
20 4
4 20*/

package hometask1;
import java.util.Scanner;
public class task5done_jonlevel1 {
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
		  if( scan.hasNextByte() ){
		  byte b=scan.nextByte();
		  float f=scan.nextFloat();
		  System.out.println(b+" "+f);		  
		  
		  f=b+f;
		  b=(byte)(f-b);
		  f=(f-b);
		  
		 if ((f-(byte)(f)>0)|(f-(byte)(f)<0)){System.out.println(b+" "+(f-(f-(byte)(f))));}
	}
	}
}

