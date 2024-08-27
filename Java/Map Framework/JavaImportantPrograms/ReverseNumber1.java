package JavaImportantPrograms;

public class ReverseNumber1 {

	public static void main(String[] args) {
		int a = 12345;
		String b = Integer.toString(a);
		for (int i = b.length() - 1; i >= 0; i--) {
			System.out.print(b.charAt(i));
		}

	}
}
