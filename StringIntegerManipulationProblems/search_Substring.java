import java.util.*;

public class search_Substring{

		//method
		public static int searchSubstring(String large,String small){
			int end = 0;
			int count = 0;
			for(int i = 0 ;i < large.length();i++){
				for(int j = end;j < small.length();j++){
					//if the character matches update end
					if(large.charAt(i) == small.charAt(j)){
						count++;	//use to verify at last the length of small string is completed
						end++;		//update index so that inner directly jumps on next character.
						break;
					}
					else{
						count = 0;
						end = 0;
						break;
					}
				}

				//verify small string length.
				if(count == small.length()){
					int index = i - count + 1;
					return index;
				}
			}

			return -1;
		}


		//main
		public static void main(String[] args){
			
			String large = new String("saddear");
			String small = new String("dd");

			int index = searchSubstring(large,small);
			
			if(index >= 0){
				System.out.println("Substring start index found at "+index);
			}
			else{
				System.out.println("Substring not found "+index );
			}
		}
}
