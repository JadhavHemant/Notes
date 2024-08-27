package JavaImportantPrograms;

public class FindUpperCaseLetter2 {

	public static void main(String[] args) {
		String s = "Welcome to Automation";
		String upperCase = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isUpperCase(ch)) {
				upperCase = upperCase + ch;
			}
		}

		System.out.println(upperCase);
	}
}
