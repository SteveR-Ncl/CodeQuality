package examples;


import java.util.Iterator;
import java.util.List;



/**
 * @author steve
 * Some array searching to illustrate code quality, some methods based on 
 * Carlo Ghezzi, Mehdi Jazayeri, and Dino Mandrioli: Fundamentals of
 * Software Engineering, 2nd edition
 * 
 * Use with PMD to illustrate several examples of static analysis
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
	

}
