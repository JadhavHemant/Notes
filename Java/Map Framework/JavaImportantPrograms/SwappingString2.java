package JavaImportantPrograms;

public class SwappingString2 {

	public static void main(String[] args) {
		//Swapping a String without third variable
		String a = "java";
		String b = "selenium";

		a = a + b;
		b = a.substring(0, a.length() - b.length());
		a = a.substring(b.length());

		System.out.println(a);
		System.out.println(b);

	}
}
