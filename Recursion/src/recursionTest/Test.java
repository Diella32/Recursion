package recursionTest;
import RecursionPD.recursion;

public class Test 
{

	public static void main(String[] args)
	{
		int x = 5, y = 3;
		recursion objectUsed= new recursion();
	    System.out.println("total" + "=" + objectUsed.multiplication(x, y));
		System.out.println(" ");
			//Multiplying 5 and 3 by recursion: 15

			
		recursion palindromeCheck= new recursion();
			String word1="gohangasalamiimalasagnahog";
			String word2="test";
    System.out.println("Is " + word1 + " a palindrome by recursion? " + palindromeCheck.palindrome(word1));
    System.out.println("Is " + word2 + " a palindrome by recursion? " + palindromeCheck.palindrome(word2));
   

    recursion COrVCheck= new recursion();
	
		String wordOne= "racecar ";
		String wordTwo= "eager ";
		System.out.print("Does " +wordOne + " have more vowels or consonants: ");

		if(COrVCheck.vorc(wordOne))
		{
			 System.out.println("more vowels");
		}
		else
		{
			 System.out.println("more consonants");
		}

		
	recursion towersTest= new recursion();
	
	int N=4;
	
	towersTest.towersOfHanoi(N, '1', '3', '2');
			
		

	}

}
