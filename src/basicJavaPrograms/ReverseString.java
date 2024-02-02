package basicJavaPrograms;

public class ReverseString {

	public static void main(String args[]) {

		String str = "Selenium Testing";
		String reversedstr = "";
		char ch;
//Using one character
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			reversedstr = ch + reversedstr;

		}
		System.out.println(reversedstr);
		
		StringBuilder abc= new StringBuilder();
		abc.append(reversedstr);
		
		System.out.println("==Reverse again with the help of string builder==");
		System.out.println(abc.reverse());
		

	}
	

}
