package examples;
import java.util.Scanner;


/**
 * Examples of control flow problems based on 
 * Carlo Ghezzi, Mehdi Jazayeri, and Dino Mandrioli: Fundamentals of
 * Software Engineering, 2nd edition
 */
public class ControlFlow {
	
	
	/**
	 * Example of static analysis showing uninitialised variable z.
	 * Eclipse identifies this as an error.
	 */
	public void ReadAndSet() {
		int x, y, z;	

		x = read();
		if (x > 0) {
			z = read();
		} else {
			y = read();
		}
		x = x * z;

	}

	/**
	 * Example of false positive: z or y are defined (depending on x) and
	 * referenced (same condition on x). Static analysis shows z or y may be
	 * uninitialised, incorrectly.
	 */
	public void Uncertainty() {

		int w, x, y, z;

		x = read();
		if (x > 0) {
			z = read();
		} else {
			y = read();
		}    
		if (x > 0) {
			w = z; 
		} else { 
			w = y;
		}

	}

	/**
	 * @return int value read from scanner
	 */
	public int read() {
		Scanner in = new Scanner(System.in);
		
		int val = in.nextInt();
		in.close();
		return val;

	}
}

