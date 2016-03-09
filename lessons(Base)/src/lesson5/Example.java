package lesson5;

public class Example {

		/* public static void main(String[] args) {
		  String s = "12+13";

		  // определяет длину строки
		  int k = s.length();//7 
		  
		  // s.charAt( indexA) - возвращает символ строки s, который находится под индексом indexA 
		  char c1 = s.charAt(0);// 'a'
		  char c2 = s.charAt(2);// 'c'
		  
		  // s.indexOf( str) возвращает индекс из строки s , где начинается подстрока str  
		  int k1 = s.indexOf( "ab" ); // 0
		  int k2 = s.indexOf( "de" ); // 3
		  int k3 = s.indexOf( "af" ); //-1
		  
		  //s.substring(indexA, indexB) - возвращает подстроку, которая начинается с indexA по indexB не включительно
		  String s1 = s.substring( 2, 6); // "cdef"
		  
		  //s.equals(s1) - сравнение строк
		  if(s1.equals(s)) System.out.println("строки равные");
		    else System.out.println("строки разные");
		 }*/
		 public static void main(String [] args){
			String s = "22.3/5";
			double res = 0;
			for(int i = 0;i<s.length();i++){
				//double value = Double.parseDouble(s.charAt(i)+"");
				if((s.charAt(i))==('+')){
					res = Double.parseDouble(s.substring(0,i)) + Double.parseDouble(s.substring(i,s.length()));
					System.out.println(res);
				}
				else if ((s.charAt(i))==('-')){
					res = Double.parseDouble(s.substring(0,i)) - Double.parseDouble(s.substring(i+1,s.length()));
					System.out.println(Double.parseDouble(s.substring(0,i)));
					System.out.println(Double.parseDouble(s.substring(i+1,s.length())));
					System.out.println(res);
				}
				else if ((s.charAt(i))==('*')){
					res = Double.parseDouble(s.substring(0,i))*Double.parseDouble(s.substring(i+1,s.length()));
					System.out.println(Double.parseDouble(s.substring(0,i)));
					System.out.println(Double.parseDouble(s.substring(i+1,s.length())));
					System.out.println(res);
				}
				else if ((s.charAt(i))==('/')){
					res = Double.parseDouble(s.substring(0,i))/ Double.parseDouble(s.substring(i+1,s.length()));
					System.out.println(Double.parseDouble(s.substring(0,i)));
					System.out.println(Double.parseDouble(s.substring(i+1,s.length())));
					System.out.println(res);
				}
				
			}
			//System.out.println(res);
		 }
}

