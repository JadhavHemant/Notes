package JavaImportantPrograms;

public class FindVowels {

	public static void main(String[] args) {

		String a = "selenium testing";
		char[] b = a.toCharArray();
		String c = "";
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 'a' || b[i] == 'e' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u') {
				c = c + b[i];
			}
		}
		System.out.println(c);
	}
}
