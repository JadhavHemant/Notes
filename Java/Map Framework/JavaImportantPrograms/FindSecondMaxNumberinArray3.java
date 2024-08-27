package JavaImportantPrograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class FindSecondMaxNumberinArray3 {

	public static void main(String[] args) {
		int a[] = { 10, 30, 20, 60, 70, 50 };
		TreeSet<Integer> t1 = new TreeSet<Integer>();

		for (int i = 0; i < a.length; i++) {
			t1.add(a[i]);
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.addAll(t1);

		System.out.println(arr.get(arr.size()-2));

	}
}
