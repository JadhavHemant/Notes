package JavaImportantPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindSecondMaxNumberinArray2 {

	public static void main(String[] args) {
		int a[] = { 10, 30, 20, 60, 70, 50 };
		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			arr.add(a[i]);
		}

		Collections.sort(arr);
		Collections.reverse(arr);

		System.out.println(arr.get(1));

	}
}
