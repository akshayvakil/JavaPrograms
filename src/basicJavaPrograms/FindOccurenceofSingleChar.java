package basicJavaPrograms;

public class FindOccurenceofSingleChar {

	// Online Java Compiler
	// Use this editor to write, compile and run your Java code online

	public static void main(String args[])
	{
	    int counter=0;
	    String str= "aabcd";
	    char ch[]= str.toCharArray();
	    for (int i=0;i<str.length();i++)
	    {
	        if(ch[i]=='a')
	        {
	         counter++;   
	        }
	   
	    }
	    System.out.println(counter); 
	}
}

