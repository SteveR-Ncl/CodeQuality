
package examples;

/**
 * nullness example
 *
 */
public class NullExample {

	/**
	 * just the main method
	 */
	public static void main(String[] args) {
		  Object myObject = null;
	        // To see a built-in Eclipse warning, remove this "if"
	        if (args.length > 2) {
	            myObject = new Object();
	        }
	        System.out.println(myObject.toString());
	}
}