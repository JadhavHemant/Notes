package JavaImportantPrograms;

public class FindUpperCaseAndLowerCaseLetter1 {

	public static void main(String[] args) {
		String s = "Sele11344$!#$$Nium123";
		String UpperCase = "";
		String lowerCase = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 98 && ch <= 122) {
				lowerCase = lowerCase + ch;
			} 
			else if (ch >= 65 && ch <= 90) {
				UpperCase = UpperCase + ch;
			}
		}
		
		System.out.println(lowerCase);
		System.out.println(UpperCase);
	}
}