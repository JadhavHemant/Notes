package JavaImportantPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class FindMaxNumberinArray3 {

	public static void main(String[] args) {

		int a[] = { 50, 100, 1005, 200, 30 };
		int max = a[0];

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 1; i < a.length; i++) {
			arr.add(a[i]);
		}

		Collections.sort(arr);

		max = arr.get(arr.size() - 1);

		System.out.println(max);

	}
}