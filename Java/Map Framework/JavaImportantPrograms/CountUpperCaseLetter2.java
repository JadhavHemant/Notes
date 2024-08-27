package JavaImportantPrograms;

public class CountUpperCaseLetter2 {

	public static void main(String[] args) {
		String s = "Welcome to Automation";
		char[] abc = s.toCharArray();

		int upper = 0;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isUpperCase(abc[i])) {
				upper++;
			}
		}

		System.out.println("Uppercase letters Count " + upper);
	}
}
