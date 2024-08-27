package JavaImportantPrograms;

public class ReverseString2 {

	public static void main(String[] args) {
		String a = "Selenium";
		
		char [] abc = a.toCharArray();
		
		for (int i = abc.length- 1; i >= 0; i--) 
		{
			System.out.print(abc[i]);	
		}
	}

}
