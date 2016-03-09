//HomeTask3. Поменять местами значения 4х переменных разных 
//типов int, byte, float, double. 
//Сделать 4 обмена.
//int <==> byte, double <==> float,  int <==> double, byte <==> float,  

package hometask1;
import java.util.Scanner;
public class task3done {
	public static void main(String[] args){
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter int");
	  System.out.println("Enter byte");
	  System.out.println("Enter float");
	  System.out.println("Enter double");
	  int i=scan.nextInt();
	  byte b=scan.nextByte();
	  float f=scan.nextFloat();
	  double d=scan.nextDouble();
	  
	  {i= i+b; 
	  b= (byte)(i-b);
	  i= i-b; 
	  System.out.println("int <==> byte:");
	  System.out.println(i);
	  System.out.println(b);}
	  
	  {d=f+d;
	  f=(float)(d-f);
	  d=d-f;
	  System.out.println("double <==> float:");
	  System.out.println(f);
	  System.out.println(d);}
	
	  
	  {d=i+d;
	  i=(int)(d-i);
	  d=d-i;
	  System.out.println("int <==> double");
	  System.out.println(i);
	  System.out.println(d);}
	  
	  {f=f+b;
	  b=(byte)(f-b);
	  f=f-b;
	  System.out.println("byte <==> float");
	  System.out.println(b);
	  System.out.println(f);}
	  
	  
  }
}
