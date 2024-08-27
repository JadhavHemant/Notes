package JavaImportantPrograms;

public class FindLowerCaseLetter3 {

	public static void main(String[] args) {
		String s = "Welcome to Automation";
		String lowerCase = s.replaceAll("[^a-z]", "");
		System.out.println(lowerCase);

	}
}