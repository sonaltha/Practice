package telsuko.prac;

// These 3 imports will now work perfectly
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Removin_dupicate {

	public static void main(String[] args) {
		 Integer[] numbers = {1, 3, 2, 3, 1, 4, 2};
	        
	        // Convert array to LinkedHashSet to eliminate duplicates
	        LinkedHashSet<Integer> set = new LinkedHashSet<>(Arrays.asList(numbers));
	        
	        // Convert back to an array
	        Integer[] uniqueNumbers = set.toArray(new Integer[0]);
	        
	        System.out.println(Arrays.toString(uniqueNumbers)); // [1, 3, 2, 4]
	    }
	}
