package JavaImportantPrograms;

public class StringPallindrome4 {

	public static void main(String[] args) {

		String a = "madam";

		StringBuilder sb1 = new StringBuilder(a);
		sb1 = sb1.reverse();
		String rev = sb1.toString();

		if (a.equals(rev)) {
			System.out.println("String is pallidrome");
		} else {
			System.out.println("String is not pallidrome");
		}

	}
}