/*Task 1. Написать метод, который заполняет файл четными числами от k1 до к2.
 Все числа в отдельной строке.
 Этот метод принимает имя файла , к1 и к2 в качестве параметра.
class Task1{
 public static void main(String[] args) throws Exception{
  String sFileName = "file2.txt";
  int k1 = 10;
  int k2 = 30;
  myMethod(sFileName, k1, k2);
 }
 public static void myMethod(String sFileName, int k1, int k2) throws Exception{
  ...
 }
}*/

package lesson6;
import java.io.FileWriter;

public class Task1 {
	public static void main(String[] args) throws Exception{
		  String sFileName = "file2.txt";
		  int k1 = 10;
		  int k2 = 30;
		  randomNumbers(sFileName, k1, k2);
}
	public static void randomNumbers(String sFileName,int k1,int k2) throws Exception{
		String fileName = "file2.txt";
		FileWriter fw = new FileWriter(fileName);
		int s = 0;
		for(int i = k1; i<=k2; i+=2){
			fw.write(" "+(s=+i)); 
		}
		//fw.write(s); 
		fw.close();
	}
}
