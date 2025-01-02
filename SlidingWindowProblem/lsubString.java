import java.util.*;

class longestSubstring{
	public static int longestSubstring(String input){
		int start = 0;
		int end = 0;
		int maxCnt = 0;

		//System.out.println("Given characters in input string is.");

		//declaring a hashSet.
		HashSet<Character> set = new HashSet<>();	

		//Iterator<char> ch = set.iterator();
		for(end = 0 ;end < input.length();end++){
			
			char ch = input.charAt(end);

			//check if character is present in set or not.
			while(set.contains(ch)){
			
				//removing that character from set.
				set.remove(input.charAt(start));
				//incrementing the start index.
				start++;
			}	
	
			//add the character to the set.
			set.add(ch);

			//updating maxCnt
			maxCnt = (maxCnt > (end - start + 1))?maxCnt : end-start + 1;	

		}

		return maxCnt;
	}


}


public class lsubString{
	public static void main(String[] args){
		String input = "abcdef";

		int maxCnt = longestSubstring.longestSubstring(input);
		System.out.println("MAx count of longest substring present in given String "+input+" is "+maxCnt);	
	}
}
