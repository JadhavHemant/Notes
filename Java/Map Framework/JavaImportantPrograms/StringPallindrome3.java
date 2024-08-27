package JavaImportantPrograms;

public class StringPallindrome3 {

	public static void main(String[] args) {

		String a = "madam";

		StringBuffer sb1 = new StringBuffer(a);
		sb1 = sb1.reverse();
		String rev = sb1.toString();
		
		if (a.equals(rev)) 
		{
			System.out.println("String is pallidrome");
		} else {
			System.out.println("String is not pallidrome");
		}

	}
}
