package JavaImportantPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class OccurrenceCharacter1 {

	public static void main(String[] args) {
		String a = "cucumber";

		char[] abc = a.toCharArray();

		LinkedHashMap<Character, Integer> h1 = new LinkedHashMap<Character, Integer>();

		for (int i = 0; i < abc.length; i++) {
			
			if (h1.containsKey(abc[i]))
			{
				h1.put(abc[i], h1.get(abc[i]) + 1);
			}
			else {
				h1.put(abc[i], 1);
			}
		}

		Set<Entry<Character, Integer>> it = h1.entrySet();
			
		for(Entry<Character, Integer> xyz: it)
		{
			System.out.println(xyz.getKey() + "  ::  "+xyz.getValue());
		}
		
	}
}
