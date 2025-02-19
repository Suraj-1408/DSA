import java.util.*;

public class reverseWordsinString{
		
	//method to reverse words in the string.
	public static String reverseWordsinString(String s){
	
	/*	
		int startIndex = 0;
		int lastIndex =  s.length() -1;
	
		StringBuilder startWord = new StringBuilder();
		StringBuilder lastWord = new StringBuilder("");


		while(startIndex <= lastIndex){
		
			while(s.charAt(startIndex) != ' '){
				startWord.append(s.charAt(startIndex));
				startIndex++;	
			
			}
			
			startWord.reverse();


			while(s.charAt(lastIndex) != ' '){
			//lastWord = lastWord + s.charAt(lastIndex).toString();
				lastWord.append(s.charAt(lastIndex));
				lastIndex--;
			}

		//	String lastWord = String.valueOf(s.charAt((s.length() - 1)));
			lastWord.reverse();

			StringBuilder temp =  new StringBuilder(lastWord);
			lastWord = startWord;
			startWord = temp;
			

			while(s.charAt(startIndex) == ' ' && s.charAt(lastIndex) == ' '){
				startIndex++;
				lastIndex--;

			}

			}

		return s;
	*/
		
		
		//APPROACH
		//1)starting from the last index.(Until reach to 0th index.)
		//2) extract each word in variable using StringBuilder() class.
		//3) apply reverse() on this variable.
		//4) add it to resultant string using Again StringBuilder class.

		//Words in reverse Order for any given string.
		int lastIndex = s.length()-1;
		StringBuilder word = new StringBuilder();

		StringBuilder wordsInReverse  = new StringBuilder();
		
		
		while(lastIndex >= 0){
		
			//skipping spaces.	
			while(lastIndex >= 0 && s.charAt(lastIndex) == ' '){
				lastIndex--;	
			}
	
			//keeping on extract last character until space is encountered, whihc is nothting but last word.
			while(lastIndex >= 0 && s.charAt(lastIndex) != ' '){
				word.append(s.charAt(lastIndex));
				lastIndex--;
			}


			//reversing the characters in word string.
			word.reverse();

			//as soon as space hits ,  storing the  last word in resultant string.
			if(word.length() > 0){
				//ADD SPACE ONLY WHEN RESULTANT STRING IS > 0
				if(wordsInReverse.length() > 0){
					wordsInReverse.append(' ');
				}

				wordsInReverse.append(word);
			}
			/*
			if(lastIndex >= 0){
				wordsInReverse.append(' ');
			}

			*/


			//resetting word.
			word.setLength(0);
	
		}
		
		return wordsInReverse.toString();
	}
	
	//main()
	public static void main(String[] args){
		
		String str = new String("  Suraj Paswan  ");
		System.out.println("Given String:"+str);
		String output = reverseWordsinString(str);

		System.out.println("In Reverse Order:"+output);
	}
}
