/*������ ���� ������ � ����� ����� �����. ���������� ����� ����� ���������� ������� ����� ������ � ������ ����� �����*/

package lesson1;
import java.util.Scanner;
public class task7done {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter commodity price");
	    double m = scan.nextDouble();//���� ������
	    System.out.println("The amount of your money");
	    double n = scan.nextDouble();//����� ����� �����
	    double k = n/m;
	    int s = (int) (k);
	    double r = n - s*m;
	    /*
	    double s = (m - n)*100;
	    int k = (int) (s);
	    */
		 System.out.println(s);
		 System.out.println(r);
	}
}
