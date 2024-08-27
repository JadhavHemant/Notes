package JavaImportantPrograms;

public class StringPallindrome2 {

	public static void main(String[] args) {

		String a = "madam";
		String b = "";
		char abc[] = a.toCharArray();

		for (int i = abc.length - 1; i >= 0; i--) {
			b = b + abc[i];
		}
		if (a.equals(b)) {
			System.out.println("String is pallidrome");
		} else {
			System.out.println("String is not pallidrome");
		}
	}
}