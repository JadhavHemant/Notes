package JavaImportantPrograms;

public class CountLowerCaseLetter2 {

	public static void main(String[] args) {
		String s = "Selenium";
		char[] abc = s.toCharArray();

		int lower = 0;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isLowerCase(abc[i])) {
				lower++;
			}
		}

		System.out.println("lowercase letters Count " + lower);
	}
}
