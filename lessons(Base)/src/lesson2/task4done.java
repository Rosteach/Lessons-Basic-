package lesson2;
/*������ �������� ����������, ���������� 
�������������, ����� ��� �����.*/
import java.util.Scanner;
public class task4done {
 public static void main(String[] args){
  Scanner scan = new Scanner(System.in);
  System.out.println("������� �����:");
  int k = scan.nextInt();
  
  if(k < 0) System.out.println("��� �������������");
  
  if((k >= 0) && ( k < 10))
   System.out.println("��� �����");
 

}
}
