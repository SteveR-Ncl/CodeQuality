package examples;

/**
 * @author steve
 * Adapted from http://stackoverflow.com/questions/2758224/what-does-the-java-assert-keyword-do-and-when-should-it-be-used
 * See also http://docs.oracle.com/javase/7/docs/technotes/guides/language/assert.html
 */
public class Assertions {

	static int sum(int a, int b) {
		assert (Integer.MAX_VALUE - a >= b): "Overflow! ";
		final int result = a + b;
		assert (result - a == b);
		return result;
	}

	public static void main(String[] args) {
		   
	        System.out.println(sum(500,2147483500));

	}
}
