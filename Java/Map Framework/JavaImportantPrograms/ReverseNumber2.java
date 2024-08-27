package JavaImportantPrograms;

public class ReverseNumber2 {

	public static void main(String[] args) {
		int a = 12345;
		String b = Integer.toString(a);
		char[] abc = b.toCharArray();

		for (int i = abc.length - 1; i >= 0; i--) {
			System.out.print(abc[i]);
		}

	}
}