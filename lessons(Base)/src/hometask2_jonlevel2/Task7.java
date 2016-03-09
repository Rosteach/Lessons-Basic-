/*7)Среднее арифметическое
Написать класс с методом, возвращающий среднее арифметическое значение для всех элементов массива
В случае, если размер вектора некорректный, выводить сообщение "Неверный размер вектора"
Название метода: calcVectorAvg
Пример:
 calcVectorAvg(int[] vector); // [1234567]
14*/

package hometask2_jonlevel2;
import java.util.Scanner;
public class Task7 {
	public static int calcVectorAvg(int [] vector){ 
		if(vector.length>0){
		    for(int i = 0; i < vector.length;i++){
		        vector[i] = (int)(10 * Math.random());
		    }
		    System.out.print("[");
		    for(int i = 0; i < vector.length;i++){
		        System.out.print(vector[i]);
		        if(i<(vector.length-1))System.out.print(", ");
		    }
		    System.out.println("]");
		    int sum = 0;
	        for(int i=0;i < vector.length;i++){
	            sum +=vector[i]; 
	        }
	        //System.out.println((float)3/5);
	        int avg = sum/vector.length;
	        float bear = (float)(((float) (sum % vector.length))/vector.length);
	        if (bear>=0.5) avg++;
	        System.out.println("b=sum/vector.length :"+bear+"="+sum+"/"+vector.length + "          avg="+avg);
	        return avg;
	    }
		else System.out.println("Неверный размер вектора");
		return 0;
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		final int lENGTH = scan.nextInt();
		int [] vector = new int[lENGTH];
		System.out.println(calcVectorAvg(vector));
		scan.close();
	}
}
	
