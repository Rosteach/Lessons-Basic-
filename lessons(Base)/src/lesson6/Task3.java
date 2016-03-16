/*Task 3. Написать метод, который принимает имя файла и строку. Метод 
 добавляет строку в файл.*/

package lesson6;

import java.io.FileReader;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) throws Exception{
		String sFileName = "file1.txt";
		
		addStroks(sFileName,"eryr");
		
}
	public static void addStroks(String sFileName,String s) throws Exception{
		String fileName = "file1.txt";
		  FileReader fr = new FileReader(fileName);
		  Scanner scan = new Scanner(fr);
		 
		 int i=0;
	    while(scan.hasNextLine()){
	    scan.nextLine();
	    	i++; }
	    System.out.print("Kolichestvo Strok v faile "+":"+i);	    
		fr.close();
}
}