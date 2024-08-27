package JavaImportantPrograms;

public class ReverseString1 {

	public static void main(String[] args) {
		String a = "Selenium";
		
		for (int i = a.length() - 1; i >= 0; i--) 
		{
			System.out.print(a.charAt(i));	
		}
	}
}
