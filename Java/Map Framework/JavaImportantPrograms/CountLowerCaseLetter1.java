package JavaImportantPrograms;

public class CountLowerCaseLetter1 {

	public static void main(String[] args) {
		String s = "Selenium";

		int lower = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 98 && ch <= 122) {
				lower++;
			}
		}

		System.out.println("lowercase letters Count " + lower);
	}

}