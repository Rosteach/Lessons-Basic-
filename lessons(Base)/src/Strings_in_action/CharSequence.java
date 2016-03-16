package Strings_in_action;
public class CharSequence{
	public static void main(String[] args){
		String str1 = "tutorials point)", str2 = "http://";

		java.lang.CharSequence tut = ")";
		    
		   // string contains the specified sequence of char values
		   boolean retval = str1.contains(tut);
		   System.out.println("Method returns : " + retval);
		    
		   // string does not contain the specified sequence of char value
		   retval = str2.contains("_");   
		   System.out.println("Methods returns: " + retval);
		
	}
}
