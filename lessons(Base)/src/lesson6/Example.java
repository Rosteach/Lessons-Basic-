

package lesson6;
import java.io.FileWriter;
public class Example {
	public static void main(String[] args) throws Exception {
  // Запись в файл
  String fileName = "file1.txt";
  FileWriter fw = new FileWriter(fileName);
  fw.write("ab \n");//  \r  \r\n
  fw.write("stroka 2555");
  fw.close();
 }
}


