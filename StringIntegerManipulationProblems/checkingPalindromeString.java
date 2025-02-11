public class checkingPalindromeString{


	//method to check whether given string is palindrome or not.
	public static boolean checkPalindrome(String s){
		
		int len = s.length();	
		int start = 0;
		int end = len -1;
		
		while(start <= end){
			
			//compare  characters.
			if(s.charAt(start) == s.charAt(end)){
				start++;
				end--;
			}

			else{
				return false;
			}
		}

		return true;
	}

	//main()
	public static void main(String[] args){
		
		String s = new String("aba");
		boolean result =  checkPalindrome(s);

		if(result == true){
			System.out.println("Given string "+s+" is a palindrome.");
		}

		else{
			System.out.println("Given string "+s+" is not a palindrome.");
		}
	}
}
