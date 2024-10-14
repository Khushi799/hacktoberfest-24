// Java code
import java.util.*;

public class Main {

	// Function to Print all Unique Strings 
	// present in a given Array
	static void printUniqueStrings(String[] arr) {
		Map<String, Integer> freqMap = new HashMap<>();

		// Count the frequency of each string in arr
		for (String str : arr) {
			freqMap.put(str, freqMap.getOrDefault(str, 0) + 1);
		}

		// Print unique strings in arr
		for (Map.Entry<String, Integer> entry : freqMap.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = {"geeks", "for", "geek", "ab", "geek", "for", "code", "karega"};
		printUniqueStrings(arr);
	}
}
