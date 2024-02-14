package basicJavaPrograms;

public class ReverseString {

	public static void main(String args[]) {

		String str = "Selenium Testing";
		String reversedstr = "";
		char ch;
//Apporach1: Using iterating  characters
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			reversedstr = ch + reversedstr;

		}
		System.out.println(reversedstr);
//Apporach2: Using StringBuilder.reverse Method

		StringBuilder reverseusingStringBuilder = new StringBuilder(reversedstr);
		// You can use appeand method as well
		// reverseusingStringBuilder.append(reversedstr);

		System.out.println("==Reverse again with the help of string builder==");
		System.out.println(reverseusingStringBuilder.reverse());

//Apporach3: Using StringBuffer.reverse Method
		System.out.println("==Reverse again with the help of string Buffer==");
		StringBuffer stringbuff = new StringBuffer(reversedstr);
		System.out.println(stringbuff);

// Approach 4: Reverse all the characters using the Split() method.

		String Name = "Selenium Testing";

		String[] ReversedSplit = Name.split("");
		System.out.println("==Reverse using split method");
		for (int i = ReversedSplit.length - 1; i >= 0; i--) {
			System.out.print(ReversedSplit[i]);

		}
// Approach 5: Reverse all the words using the Split() method.

				String Sentence = "Selenium Testing";

				String[] ReversedSplitSentence = Sentence.split(" ");
				System.out.println("==Reverse using split method for words");
				System.out.print("\n");
				for (int i = ReversedSplitSentence.length - 1; i >= 0; i--) {
					System.out.print(ReversedSplitSentence[i]+" ");

				}

	}

}
