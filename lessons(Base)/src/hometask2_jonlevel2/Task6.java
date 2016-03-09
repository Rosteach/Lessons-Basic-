/*6)Обмен половин
Написать класс с методом меняющий местами половины массива, если размер нечетный - центральный элемент не учитывается
В случае, если размер вектора некорректный, выводить сообщение "Неверный размер вектора"
Название метода: swapHalves
Пример:
 swapHalves(int[] vector); // [1234567]
[5674123]*/

package hometask2_jonlevel2;

import java.util.Scanner;

public class Task6 {
	public static void fillVector(int[] vector, int arrayLength){ 
		  for(int i = 0; i < vector.length;i++){
		   vector[i] = (int)(arrayLength * Math.random());}
		  }
	public static void printPartVector(int[] vector,int indexEnd){  
			 for(int i = 0; i < indexEnd;i++)
			 {
				 System.out.print(vector[i]);
				 if(i<(indexEnd-1))System.out.print(", ");
			 }
			 //System.out.println();
	}
	public static void swapHalves(int[] vector){
		
	  if (vector.length>1){
		System.out.print("[");
		printPartVector(vector,vector.length);
		System.out.println("]");
		int [] firsthalf = new int[vector.length/2];
    	int [] secondhalf = new int[vector.length/2];
    	int k = 0;
		int ostatok = vector.length%2;
		if (ostatok==0){k=0;}else{k=1;}
		  	for (int i=0;i<vector.length/2;i++){
	    		firsthalf[i]=vector[i];}
	    	
	    	for (int i=0;i<vector.length/2;i++){
		        secondhalf[i]=vector[(vector.length/2)+k+i];
	    	}	  
	    	
	    	for (int i=0;i<vector.length/2;i++){
	    	    vector[i]=secondhalf[i];	
	    	}
	    	for (int i=0;i<vector.length/2;i++){
	    		vector[(vector.length/2)+k+i]=firsthalf[i];
	    	}
			System.out.print("[");
			printPartVector(vector,vector.length);
			System.out.println("]");    	
	    }
	  else if (vector.length==1){
		  int [] firsthalf = new int[vector.length/2];
	    	int [] secondhalf = new int[vector.length/2];
	    	int k = 0;
			int ostatok = vector.length%2;
			if (ostatok==0){k=0;}else{k=1;}
			  	for (int i=0;i<vector.length/2;i++){
		    		firsthalf[i]=vector[i];}
		    	
		    	for (int i=0;i<vector.length/2;i++){
			        secondhalf[i]=vector[(vector.length/2)+k+i];
		    	}	  
		    	
		    	for (int i=0;i<vector.length/2;i++){
		    	    vector[i]=secondhalf[i];	
		    	}
		    	for (int i=0;i<vector.length/2;i++){
		    		vector[(vector.length/2)+k+i]=firsthalf[i];
		    	}
				System.out.print("[");
				printPartVector(vector,vector.length);
				System.out.println("]");    	
		    }
		  
	  
		else {System.out.print("Неверный размер вектора");}

	}
	
	
		     	
	public static void main(String[] args){

      Scanner scan = new Scanner(System.in);
	  final int LENGTH = scan.nextInt();
	  int [] vector = new int[LENGTH];
	  fillVector(vector,LENGTH); 
	  //printPartVector(vector,LENGTH);
	  swapHalves(vector);
	  //printPartVector(vector,LENGTH);
	  
	  scan.close();
	  
}

}



