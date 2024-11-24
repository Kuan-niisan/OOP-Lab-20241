import java.util.Arrays;
public class Array {
	public static void main(String arg[]) {
		int[] numsArr = new int[] {1789, 2035, 1899, 1456, 2013};
		int sum = 0;
		double average;
		
		for (int i = 0; i < numsArr.length;i++) {
			sum += numsArr[i];
		}
		average = (double) sum / numsArr.length;
		
		for (int i = 0; i < numsArr.length - 1; i++) {
			for (int j = 0; j < numsArr.length - i - 1; j++) {
				if (numsArr[j] > numsArr[j+1]) {
					int temp = numsArr[j];
					numsArr[j] = numsArr[j+1];
					numsArr[j+1] = temp;
				}
			}
		}
		System.out.println("Sorted array: " + Arrays.toString(numsArr));
		System.out.println("The sum is: " + sum);
		System.out.println("The average is: " + average);
	}
}