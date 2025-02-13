import java.util.*;

public class lengthofLastWord{
	
	//method to get the length of last word.
	public static int lastwordlength(String s){

/*
//This approach is also correct but won't handles all cases.		
		StringBuilder lastword = new StringBuilder();

		for(int i = s.length() -1 ;i >= 0;i--){
			
			if(s.charAt(i) != ' '){
				char ch = s.charAt(i);
				//lastword = lastword.append(ch.toString());		//wrong
				//lastword.append(String.valueOf(ch)); 			// Correct

				lastword = lastword.append(ch+"");
			}	
			else{
				break;
			}
		}
		System.out.println("");	
		System.out.println("Last word:"+lastword.reverse());
		int len = lastword.length();

		return len;
*/


		StringBuilder lastword = new StringBuilder();

		int i = s.length()-1;

		//if my last character starts as space? Skipping it.
		while(i >=0 && s.charAt(i) == ' '){
			i--;
		}

		//adding character until space isn;t encountered.
		while(i >= 0 && s.charAt(i) != ' '){
			lastword.append(s.charAt(i));
			i--;
		}

		lastword.reverse();
		System.out.println("");
		System.out.println("Last word: "+ lastword);
		int len = lastword.length();

		return len;
	}

	//main()
	public static void main(String[] args){
		
		String str = "Hello World!";
		System.out.println("Given string "+str);

		int len = lastwordlength(str);
		System.out.println("Length of last word "+len);
	}




}
