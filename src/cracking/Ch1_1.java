package cracking;

public class Ch1_1 {
	
	/*
	 * Is Unique: Implement an algorithm to determine if a string has all unique characters.
	 * What if you cannot use additional data structures?
	 */

	private static boolean containsRepeat(String input) {
		int cycles = input.length();

		for(int i = 0; i < cycles; i++) {
			String test = input.substring(0, 1);
			input = input.substring(1);
			for(int j = 0; j < input.length(); j++) {
				if(test.charAt(0) == input.charAt(j)) return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(" true: " + containsRepeat("hello"));
		System.out.println("false: " + containsRepeat(""));
		System.out.println(" true: " + containsRepeat("eloo"));
		System.out.println("false: " + containsRepeat("help"));
		System.out.println(" true: " + containsRepeat("helloh"));
		System.out.println(" true: " + containsRepeat("ooooooo"));
	}
}
