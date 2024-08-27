package JavaImportantPrograms;

public class StringPallindrome1 {

	public static void main(String[] args) {

		String a = "madam";
		String b = "";
		for (int i = a.length() - 1; i >= 0; i--) {
			b = b + a.charAt(i);
		}
		if (a.equals(b)) {
			System.out.println("String is pallidrome");
		} else {
			System.out.println("String is not pallidrome");
		}
	}
}
