package JavaImportantPrograms;

import java.util.LinkedHashSet;

public class findDuplicateCharacter2 {

	public static void main(String[] args) {
		String a = "jaavvva";
		char abc[] = a.toCharArray();
		LinkedHashSet<Character> h1 = new LinkedHashSet<Character>();

		for (int i = 0; i < a.length(); i++) 
		{
			if(!h1.add(abc[i]))
			{
				System.out.print(abc[i]);
			}
			else
			{
				h1.add(abc[i]);
			}
			
		}
	}
}