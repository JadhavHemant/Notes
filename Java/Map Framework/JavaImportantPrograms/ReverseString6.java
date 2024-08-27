package JavaImportantPrograms;

public class ReverseString6 {

	public static void main(String[] args) {
		String a = "Selenium Testing";
		String b[] = a.split(" ");
		String c = "";

		for (int i = 0; i < b.length; i++) {
			char[] abc = b[i].toCharArray();

			for (int j = abc.length - 1; j >= 0; j--) {
				c = c + abc[j];
			}

			c = c + " ";

		}
		System.out.println(c.trim());// muineleS gnitseT
	}
}
