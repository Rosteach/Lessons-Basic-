/*8)Сумма нечетных
Написать метод возвращающий количество нечетных элементов массива
В случае, если размер вектора некорректный, выводить сообщение "Неверный размер вектора"
Название метода: calcNonPairCount
Пример:
 calcNonPairCount(int[] vector); // [1234567]
4*/

package hometask2_jonlevel2;
import java.util.Scanner;
public class Task8 {
         public static int calcNonPairCount(int[] vector){        	 
        	 int i = 0;
        	 for(i = 0; i < vector.length;i++){
      		   vector[i] = (int)(100 * Math.random());}
      		 
        	 int sNechetnye = new int[vector.length];
             if(vector.length<=0){System.out.print("Неверный размер вектора");}
             else if (vector.length==1){System.out.print(vector.length);} 
             else {
            	 if (vector[i]%2!=0){
             for(i = 0;i<vector.length;i++){
             sNechetnye += 1;}
             System.out.print(vector.length);
             }
             }
        	 
         return vector.length;
         }
         public static void main(String[]args){
        	 Scanner scan = new Scanner(System.in);
        	 int [] vector = new int[10];
        	 int arrayLength = scan.nextInt();
        	 calcNonPairCount(vector);
        	 scan.close();
         }
}