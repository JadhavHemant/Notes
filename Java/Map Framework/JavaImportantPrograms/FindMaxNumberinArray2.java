package JavaImportantPrograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindMaxNumberinArray2 {

	public static void main(String[] args) {

		int a[] = { 50, 100, 1005, 200, 30 };
		int max = a[0];

		TreeSet<Integer> t1 = new TreeSet<Integer>();

		for (int i = 1; i < a.length; i++) {
			t1.add(a[i]);
		}

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.addAll(t1);
		max = arr.get(arr.size() - 1);

		System.out.println(max);

	}
}