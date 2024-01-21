package RecursionPD;

public class recursion {
	public static int multiplication(int numOne, int numTwo) {
//		int total; 
//		if (numOne < numTwo) {
//			return multiplication(numOne, numTwo); 
//		}
//		else if(numTwo!=0) {
//			total =  (numOne+  multiplication(numOne, numTwo-1));
//			return total;
//		}
//		else 
//			return 0; 
		
		if (numTwo == 1) {
			return numOne;
		}
		else {
			return numOne + multiplication(numOne, numTwo -1);
		}
		
	}
	
	public static boolean palindrome(String stringUsed) {
		 int size = stringUsed.length(); 
		 if (size<= 1) {
			 return true; 
		
	}
		 else if (stringUsed.charAt(0) == stringUsed.charAt(size-1)) {
			 return palindrome(stringUsed.substring(1, size-1)); // comprend
		 }
		 else return false; 
	
}
	public static boolean vorc(String input) {
		return countVowels(input)>countConsonants(input);
	}
	
	public static char vowels(char characterUsed) {
		characterUsed = Character.toUpperCase(characterUsed); 
		if (characterUsed == 'A' || characterUsed == 'E' || characterUsed == 'I' || characterUsed == 'O' || characterUsed == 'U') {
			return characterUsed;
		}
		else
		{
			return 0; 
		}

	
}
	
	public static char countVowels(String stringUsed) {
		// how dies it know the size?
		int size = stringUsed.length();
		if (size == 1) {
			return vowels(stringUsed.charAt(size-1)); 
		}
		
		else 
			return vowels(stringUsed.charAt(size-1)); 
	
}

	public static char consonants(char characterUsed) {
		characterUsed = Character.toUpperCase(characterUsed); 
		
		if ((characterUsed != 'A' || characterUsed != 'E' || characterUsed != 'I' || characterUsed != 'O' || characterUsed != 'U' && (characterUsed >= 65 && characterUsed<=90))){
			return characterUsed;
			
		}
		else 
			return 0; 
	
}
	public static int countConsonants(String stringUsed) {
		int size = stringUsed.length();
		if (size == 1) {
			return consonants(stringUsed.charAt(size-1)); 
		}
		else
			return consonants(stringUsed.charAt(size-1)); 
		
}
	
	public static void towersOfHanoi(int size, char fromRod, char toRod, char auxRod) {
		
		if (size == 1)
		{
			System.out.println("Take disk " + size + " from peg " + fromRod + " to peg " + toRod); 
		}
		else 
		{
		towersOfHanoi(size-1 , fromRod, auxRod, toRod);
		System.out.println("Take disk " + size + " from peg " + fromRod + " to peg " + toRod); 
		towersOfHanoi(size -1 , auxRod, toRod, fromRod);
		}
	}
	

}