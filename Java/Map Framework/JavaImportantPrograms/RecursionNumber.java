package JavaImportantPrograms;

public class RecursionNumber {

	public static void main(String[] args) {
		RecursionNumber.Recursion(10);
	}

	public static void Recursion(int n) {

		if (n < 0) {

			return;
		}
		Recursion(n - 1);
		System.out.println(n);
	}

}
