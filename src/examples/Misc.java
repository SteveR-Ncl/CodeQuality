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
	 * Fixed version. Alternative versions:
	 * - declare but don't initialise m. Although both paths 
	 *   initialise m, eclipse shows as an error.
	 * - don't declare m. Have local declarations in each of 
	 *   the inner blocks, and local returns. Eclipse shows 
	 *   error (must return int).
	 * 
	 * @param x integer
	 * @param y integer
	 * @return max of x,y
	 */
	public int max(int x, int y){
		int m = 0;

		if (x >= y) {
			m = x;
		}
		else if (x < y) {
			m = y;
		}
		return m;
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
	 * days in a month - adapted from Java tutorial
	 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
	 * 
	 * @param month represents the month
	 * @param year
	 * @return int number of days in month in that year
	 */
	public int daysInMonth(int month, int year) {
		int numDays = 0;

		switch (month) {
		case 1: case 3: case 5:
		case 7: case 8: case 10:
		case 12:
			numDays = 31;
			break;
		case 4: case 6:
		case 9: case 11:
			numDays = 30;
			break;
		case 2:
			if (((year % 4 == 0) && 
					!(year % 100 == 0))
					|| (year % 400 == 0))
				numDays = 29;
			else
				numDays = 28;
			break;
		}
		return numDays;
	}

	/**
	 * Compute square root of a value using modified Newton-Raphson iteration.
	 * @param value to find root of
	 * @return root
	 */
	public float sqrt(float value) { 
		float guess;  
		int loops; 
		if (value <= 0) return 0; 
		else 
			guess = value / 2; 
		for (loops = 0; loops < 5; loops++) { 
			guess = (guess + value/guess)/2; 
		} 
		return guess; 
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public void  Puzzling(){
		int j = 0;
		for (int i = 0; i < 100; i++)
		{
			j = j++;
		}
		System.out.println(j);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void loopForever() {
		int i = 0;

		while (true) {
			i++;
		}	
	}

	public void loopForABit() {
		int i = 0;

		while (i < 10) {
			i++;
		}
	}

	public void anotherLoop(int[] intArray, int key) {
		int size = intArray.length;
		int i = 0;
		boolean found = false;     
		while(i < size && !found) 
		{
			if (key == intArray[i]) 
			{
				found = true;
			} else 
			{
				i = i + 1;
			}
		}	
	}

}


