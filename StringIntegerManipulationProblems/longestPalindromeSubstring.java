public class longestPalindromeSubstring{
	
	//method to return longest palindrome sustring.
	public static String longestPalindrome(String s){
	
	/*	
		StringBuilder str = new StringBuilder();

		//uisng two index starting  from mid
		int start = s.length()/2;	
		int end = s.length()/2;
		
		while(start >= 0 && end < s.length()){
			
			//checking character value for both position at same index.
			if(s.charAt(start) == s.charAt(end)){
				str.append(s.charAt(start));
			}
			
			start--;
			end++;

			if(s.charAt(start) == s.charAt(start+1)){
				str.append(s.charAt(start));
			}

			else if(s.charAt(end) == s.charAt(end-1)){
				str.append(s.charAt(end));
			}
		
		
		}

		return str.toString();
	*/

	
		//checking every possible substring whether its palindrome or not , starting from index 0.

		String longestSubstr = "";

		for(int i = 0;i < s.length();i++){
			
			//checking substring upto every ith index
			for(int j = i; j < s.length();j++){
					
				String sub = s.substring(i,j+1);		//extracting the substring upto i

				//checking if its a palindrome or not, if YES and if its lenght is > previous substring palindrome than updating resultant string.
				if(isPalindrome(sub) && sub.length() >  longestSubstr.length()){
					longestSubstr = sub;
				}
			}
		}

		return longestSubstr;

	}


	//method to checking given string is palindrome or not.
	public static boolean isPalindrome(String s){
		int left = 0;
		int right = s.length() -1;

		while(left <= right){
			if(s.charAt(left) != s.charAt(right)){
				return false;
			}

			left++;
			right--;
		}
		
		return true;
	}


	//main()
	public static void main(String[] args){
	
		String s = "babad";

		System.out.println("Given string is "+ s);
		String res = longestPalindrome(s);
		System.out.println("Longest palindrome substring is "+ res);
	}


}
