package JavaImportantPrograms;

public class SeperateUpperCaseAndLowerCaseAndNumbersAndSpecialCharacter {

	public static void main(String[] args) {
		String s = "Sele11344$!#$$Nium123";

		String lowerCase = s.replaceAll("[^a-z]", "");
		System.out.println(lowerCase);

		String uppercase = s.replaceAll("[^A-Z]", "");
		System.out.println(uppercase);
		
		String numbers = s.replaceAll("[^0-9]", "");
		System.out.println(numbers);

		String SpecialCharacter = s.replaceAll("[A-Za-z0-9]", "");
		System.out.println(SpecialCharacter);
		
	}
}
