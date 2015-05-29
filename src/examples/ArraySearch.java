package examples;


import java.util.Iterator;
import java.util.List;



/**
 * @author steve
 * some array searching to illustrate code quality
 */

public class ArraySearch {
	private List<String> words;
	
	/**
	 * Search using arrayList.
	 * @param findme string to search for
	 * @return true if found
	 */
	public boolean arrayContains(String findme) {
		boolean foundIt = words.contains(findme);
		return foundIt;
	}
	
	/**
	 * Search using foreach loop
	 * @param findme string to search for
	 * @return true if found
	 */
	public boolean forLoopSearch(String findme){
		boolean foundIt = false;
		for(String w: words){
            if(w.equals(findme)){
               foundIt = true;
            }
        }
		return foundIt;
	}
	
	public String getLongest(){
		String longest = "";
		Iterator<String> iter = words.iterator();
		while (iter.hasNext()){
			String word = iter.next();
			if (word.length() > longest.length()){
				longest = word;
			}
		}
		return longest;
		
	}
	
	/**
	 * Accessor. 
	 * @return the current word list.
	 */
	public List<String> getWords() {
	 
		return words;	
	}
	
	/**
	 * Setter for words
	 * @param newWords List of new words
	 */
	public void setWords(List<String> newWords){
		words = newWords;
	}
	
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
	
	
	public int[] mergeSort(int[] a, int[] b){
	// assumption that a and b are same length and sorted
		int	i=0, j=0, k=0;
		int n = a.length;
		int c[] = new int[2*n] ;
	
		while (k < 2*n) {
		
			if (i < n && j < n && a[i] < b[j] || i<n && j == n){
				c[k] = a[i]; 
				i++;
			}
			else if(j < n){
				c[k] = b[j];
				j++;
			}
			k++;
		}
		return c;

	}
	
	public int absdiff(int a, int b) {
		int tmp;
		if (a<b) { 
			tmp=a; 
			a=b;
			b=tmp;
		}

		return (a-b);
	}


	public float sqrt(float value) { 
		/* compute square root of a value using modified Newton-Raphson iteration */ 
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
