package examples;

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
