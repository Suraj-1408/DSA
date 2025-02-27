import java.util.*;

public class stringPalindromeRemoveAlphaNumericChar{
	
	//method to remove all Alpha Numeric characters and check given string is palindrome or not.
	public static boolean checkPalindrome(String s){
	
		String lower  = s.toLowerCase();
		//removing all non alphanumeric characters.
		//making use of replaceAll() method of String class, that takes regex(expression) and replacement string as parameter. and returns newly modified string based on given replacement string.


		lower = lower.replaceAll("[^A-Za-z0-9]","");
		//above regex is used to match,search or control string based on Specific rules.

		System.out.println("String in Lower case & without non alphanumeric characters:"+lower);

		StringBuilder reverse = new StringBuilder(lower);
	
		//Note the reverse method only works on StrigBuilder class only.
		System.out.println("String in Reverse:"+reverse.reverse());
	
		//After reversing check whether reversed stirng and string wihtout non alphanumeric characters are same or not.
		if(lower.equals(reverse.toString())){
			return true;
		}	

		return false;
	}

	//main
	public static void main(String[] args){
		
		String Str = "RACE A CAR";
		//String Str =  "A man, a plan, a canal: Panama";

		boolean res = checkPalindrome(Str);
		System.out.println(res);
	}
}
