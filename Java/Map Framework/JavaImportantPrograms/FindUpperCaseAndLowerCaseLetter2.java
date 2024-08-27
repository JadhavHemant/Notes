package JavaImportantPrograms;

public class FindUpperCaseAndLowerCaseLetter2 {

	public static void main(String[] args) {
		String s = "Sele11344$!#$$Nium123";
		String UpperCase = "";
		String lowerCase = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isLowerCase(ch)) {
				lowerCase = lowerCase + ch;
			} else if (Character.isUpperCase(ch)) {
				UpperCase = UpperCase + ch;
			}
		}

		System.out.println(lowerCase);
		System.out.println(UpperCase);
	}
}