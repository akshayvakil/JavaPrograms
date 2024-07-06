package basicJavaPrograms;

public class FindmaxValueInArray {
	//Find max value program
	//Find max value program
	//This is develop branch this line is not present in master command

	public static void main(String[] args) {
		
		// This is master branch
		int[] intarr = { 10, 2, 3, 30, 12 };
		
// Find Max Value in array		
		int max = intarr[0];
		for (int i = 0; i < intarr.length; i++) {
			if (intarr[i] > max) {
				max = intarr[i];
			}
		}
		System.out.println("Max Value is -->"+max);
// Find Min Value in array
		int minValue =intarr[0];
		
	for (int j=intarr.length-1;j>=0;j--)
	{
		if (intarr[j]<minValue)
		{
			minValue=intarr[j];
		}
		
	}
	System.out.println("Min Value is -->"+minValue);	

		
		
		
	}

	
	
}
