package JavaImportantPrograms;

public class FindMinimumNumberinArray1 {

	public static void main(String[] args) {

		int a[] = { 50, 100, 1005, 200, 30 };
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		{
			System.out.println(min);
		}

	}
}