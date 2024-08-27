package JavaImportantPrograms;

public class FindUpperCaseAndLowerCaseLetter3 {

	public static void main(String[] args) {
		String s = "Sele11344$!#$$Nium123";

		String lowerCase = s.replaceAll("[^a-z]", "");
		System.out.println(lowerCase);
		
		String uppercase = s.replaceAll("[^A-Z]", "");
		System.out.println(uppercase);

		
	
	}
}