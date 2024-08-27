package JavaImportantPrograms;

public class FibinacciNumber1 {

	public static void main(String[] args) {
		// Definition:A series of number in which each number (Fibinacci number)
		// is the sum of the two preceding numbers.
		// 0 1 1 2 3 5 8 13 21 34
		int a = 0, b = 1;
		int c;
		for (int i = 0; i < 5; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}
}
