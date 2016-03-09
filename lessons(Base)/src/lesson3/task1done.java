package lesson3;

	import java.util.Scanner;

	public class task1done {
	 public static void main(String[] args){
	  f();
	 } 
	 public static void f(){
	  Scanner scan = new Scanner(System.in);
	  System.out.println("¬ведите число:");
	  int m = scan.nextInt();
	  /*for(int i = 2; i <= m; i++){
	   System.out.print(i+", ");
	   //int k=0;
	  }*/
	 
	  System.out.println();
	  int j = m;
	  while(j >= 2){
	   System.out.print(j+", ");
	   j--;
	  }  
	 }
	}

