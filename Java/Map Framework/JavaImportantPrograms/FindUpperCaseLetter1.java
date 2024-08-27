package JavaImportantPrograms;

public class FindUpperCaseLetter1 {

	public static void main(String[] args) {
		String s = "Welcome to Automation";
		String upperCase = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 65 && ch <= 90) {
				upperCase = upperCase + ch;
			}
		}

		System.out.println(upperCase);
	}
}
