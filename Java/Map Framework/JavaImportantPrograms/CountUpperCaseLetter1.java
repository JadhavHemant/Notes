package JavaImportantPrograms;

public class CountUpperCaseLetter1 {

	public static void main(String[] args) {
		String s = "Welcome to Automation";

		int upper = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 65 && ch <= 90) {
				upper++;
			}
		}

		System.out.println("Uppercase letters Count " + upper);
	}

}
