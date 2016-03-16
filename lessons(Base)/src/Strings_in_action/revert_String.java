package Strings_in_action;

public class revert_String {
	
	public static void main(String[] args){
		String in = "abcdef";
		for(int i=in.length()-1;i>=0;i--){
			char out=in.charAt(i);
			System.out.print(out);
		}
	}
}
