package JavaImportantPrograms;

import java.util.Arrays;

public class FindSecondMaxNumberinArray1{

	public static void main(String[] args) {
		int a[] = { 10, 30, 20, 60, 70, 50 };
		Arrays.sort(a);
		System.out.println(a[a.length - 2]);

	}
}
