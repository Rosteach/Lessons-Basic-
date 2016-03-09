/*Task 2. Написать метод, который принимает имя файла и возвращает количество строк в файле. */

package lesson6;
import java.io.FileReader;
import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) throws Exception{
		  String sFileName = "file1.txt";
		
		  retNumberStroks(sFileName);
}
	public static void retNumberStroks(String sFileName) throws Exception{
		String fileName = "file1.txt";
		  FileReader fr = new FileReader(fileName);
		  Scanner scan = new Scanner(fr);
		 int i=0;
	    while(scan.hasNextLine()){
	    scan.nextLine();
	    	i++; }
	    System.out.print("Kolichestvo Strok v faile"+":"+i);
		fr.close();
}
}	