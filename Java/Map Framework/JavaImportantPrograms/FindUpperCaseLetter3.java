package JavaImportantPrograms;

public class FindUpperCaseLetter3 {

	public static void main(String[] args) {
		String s = "Welcome to Automation";

		String upperCase = s.replaceAll("[^A-Z]", "");

		System.out.println(upperCase);
	}
}