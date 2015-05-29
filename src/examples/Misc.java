/**
 * Some general miscellaneous examples, some methods based on 
 * Carlo Ghezzi, Mehdi Jazayeri, and Dino Mandrioli: Fundamentals of
 * Software Engineering, 2nd edition
 * 
 * Use with PMD to illustrate several examples of static analysis
 */
package examples;

/**
 * @author steve
 * Misc methods
 */
public class Misc {

	/**
	 * Some dataflow issues
	 * @param x an integer
	 */
	public int doSomethingPointless(int x){
		
		int y = 100;
		int z = y;
		
		if (x >= y) {
			int m = x;
			return m;
		}
		else if (x < y) {
			int m = y;
			return m;
		}
		return z;
	}
	
	/**
	 * @param a integer 
	 * @param b integer
	 * @return absolute difference of a and b
	 */
	public int absdiff(int a, int b) {
		int tmp;
		if (a<b) { 
			tmp=a; 
			a=b;
			b=tmp;
		}

		return (a-b);
	}


	/**
	 * compute square root of a value using modified Newton-Raphson iteration
	 * @param value to find root of
	 * @return root
	 */
	public float sqrt(float value) { 
		float guess; 
		int loops; 
		if (value <= 0) 
		   return 0; 
		else 
		    guess = value / 2; 
		for (loops = 0; loops < 5; loops++) { 
		    guess = (guess + value/guess)/2; 
		    } 
		return guess; 
		} 

	
}
