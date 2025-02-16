//TO remove duplicate letters and return the string in sorted order.
import java.util.*;

public class removeDuplicateLetters{
	//make using of set interface.
	//checking every character whether its present in set?
	//if character is already present, we will skip it.
	
	//method that returns a string without repeating letters.
	public static String noDuplicateLetters(String s){
	
		HashSet<Character> check = new HashSet<>();
		String result = "";

		for(int i = 0;i < s.length();i++){
			
			char ch = s.charAt(i);

			if(check.contains(ch) == false){
				check.add(ch);
				result = result + String.valueOf(ch);
			}
		}
		
		/*
		int start = 0;
		int end = result.length()-1;

		while(start <= end){
			if(result.charAt(start) > result.charAt(end)){
				char temp  =result.charAt(start);
				result.set(start) = result.charAt(end);
				result.set(end) = temp;
			}
		}
		*/
		
		//since Arrays.sort() on works on array.
		//converting string to character Array.

		char[] carr = result.toCharArray();
		
		//sorting characters .
		Arrays.sort(carr);
		
		//converting back character array to string.
		//String sortedStr = carr.toString();	
		String sortedStr = new String(carr);

		return sortedStr;	
	}


	//main()
	public static void main(String[] args){
		
		String input = "bcabc";
		String s = "cbacdcbc";
		System.out.println("Given String:"+s);

		String res = noDuplicateLetters(s);
		System.out.println("Resultant String without duplicate letters:"+res);
	}

}
