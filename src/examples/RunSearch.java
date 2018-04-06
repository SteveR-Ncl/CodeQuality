/**
 * 
 */
package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * @author steve
 * test wrapper for the string array search class.
 * 
 */
public class RunSearch {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException  {
		// do the searching for a word
		ArraySearch myArr = new ArraySearch();
		myArr.setWords(Arrays.asList("a", "age", "all", "and", "authorities", "before", "being", "belief", "best", "both", "clearer", "comparison", "countries", "crystal", "darkness", "degree", "despair", "direct", "england", "epoch", "ever", "everything", "evil", "face", "fair", "far", "fishes", "foolishness", "for", "france", "general", "going", "good", "had", "heaven", "hope", "in", "incredulity", "insisted", "it", "its", "jaw", "king", "large", "light", "like", "loaves", "lords", "noisiest", "nothing", "of", "on", "only", "or", "other", "period", "plain", "present", "preserves", "queen", "received", "season", "settled", "short", "so", "some", "spring", "state", "superlative", "than", "that", "the", "there", "things", "throne", "times", "to", "us", "was", "way", "we", "were", "winter", "wisdom", "with", "worst" ));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("What word to look for? -> ");
		 
		String target = br.readLine();
		// resource leak! found with infer
		
		System.out.println("Found " + target + " with contains: " + myArr.arrayContains(target));
		System.out.println("Found " + target + " with for loop: " + myArr.forLoopSearch(target));

		System.out.println("And the longest word is " + myArr.getLongest());
		
		System.out.println("Array Merge...");
		int[] m = new int[]{8, 10, 12, 14, 16, 18, 20};
		int[] n = new int[]{9, 11, 13, 15, 17, 21, 22};
		
		int[] p = myArr.mergeSort(m, n);
		
		System.out.println("Merged array is " + Arrays.toString(p));

	}

}
