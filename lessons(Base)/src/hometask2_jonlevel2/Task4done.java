/*4) Ћестница к звЄздам
Ќаписать класс с методом рисующий лесенку из звездочек, высота равна ширине, и передаетс€ в метод в качестве параметра. например:
¬ случае, если значение высоты имеет неправильное значение, выводить сообщение, например: Ќеверное значение высоты
Ќазвание метода: drawStair
ѕример:
 drawStair(4)
*
**
***
*****/

package hometask2_jonlevel2;
import java.util.Scanner;
public class Task4done {
	public static void drawStair(int value){
        if(value<1) {System.out.println("Ќеверное значение высоты");}
        else
         for(int j=value;j>0;j--){
        	 
         for(int i=value;i>1;i--){
        	 
         System.out.print("*");	 
         }
            value-=1;
         System.out.println("*");
		 }
  }
   public static void main(String[] args){
 	  Scanner scan = new Scanner(System.in);
 	  if( scan.hasNextInt() ){
 	  int value = scan.nextInt();
 	 
 	  System.out.println("drawStair"+"("+value+")");
       drawStair(value);
      
   }
   
}}


