package JavaImportantPrograms;

public class CountVowels {

	public static void main(String[] args) {

		String a = "selenium testing";
		char[] b = a.toCharArray();
		int counter = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 'a' || b[i] == 'e' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u') {
				counter++;
			}
		}
		System.out.println(counter);
	}
}
