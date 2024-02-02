package basicJavaPrograms;

public class FindmaxValueInArray {

	public static void main(String[] args) {
		int[] intarr = { 10, 2, 3, 30, 12 };
		int max = intarr[0];
		for (int i = 0; i < intarr.length; i++) {
			if (intarr[i] > max) {
				max = intarr[i];
			}
		}
		System.out.println(max);
	}
}
