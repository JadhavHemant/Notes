package JavaImportantPrograms;

public class ReverseString5 {

	public static void main(String[] args) {
		String a = "Selenium Testing";
		String b[] = a.split(" ");
		String c = "";
		for (int i = 0; i < b.length; i++) {

			for (int j = b[i].length() - 1; j >= 0; j--) {
				c = c + b[i].charAt(j);
			}

			c = c + " ";

		}
		System.out.println(c.trim());//muineleS gnitseT
	}
}
