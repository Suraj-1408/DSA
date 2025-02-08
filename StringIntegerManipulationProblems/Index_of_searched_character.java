//searching given character and returning its index in the given string , if not found , return -1	
import java.util.*;

public class Index_of_searched_character{
	

	//method
	public static int indexOfsearchedCharacter(String str1,char ch){
		

		for(int i = 0;i < str1.length();i++){
			if(str1.charAt(i) == ch){
				int index = i;
				return index;
			}
		}

		return -1;
	}


	//main	
	public static void main(String[] args){
		System.out.println("Returning  index of any searched character in given string:");
		//Creating String object either using string literal or string class(i.e using new keyword.)
		String str = new String("hello world");

		
		System.out.println("Given String:"+str);
		
		char input;
		System.out.println("Enter character to be searched:");
		Scanner sc = new Scanner(System.in);
		input = sc.next().charAt(0);

		System.out.println("SEARCHED CHARACTER:"+input);

		int index = indexOfsearchedCharacter(str,input);	
		if(index > 0){
			System.out.println("Character "+input+" found at Index "+index);
		}
		else{
			System.out.println("Character not found:"+index);
		}	
	}
}
