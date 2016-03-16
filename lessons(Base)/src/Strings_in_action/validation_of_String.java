package Strings_in_action;

public class validation_of_String {
	public static void main(String[] args){
		String in = "yi67)";
		/*int res=0;
		int i;
		char t='$';
		for(i=0;i<in.length();i++){
			if(in.charAt(i)==')'|in.charAt(i)=='('){
				t=in.charAt(i);
				res=++i;
				System.out.println("Position of: "+t+" ["+res+"]");
			}
		}*/
		validation(in);
	}
	public static void validation(String input){
		char p=' ';
		for(int i=0;i<input.length();i++){
			if(input.charAt(i)==')'|input.charAt(i)=='('){
				p=input.charAt(i);
			}
		}
		
		if((p==')')|(p=='(')){
			System.out.print("'"+p+"' exists");
		} 
		else
		{
			System.out.print("It's ok");
		}
	}
}
