import java.util.*;

public class checkPalindrome{
	public static boolean checkPalindrome(int num){
	
		//handling negative case
		if(num < 0){
			return false;
		}	
		//here given integer needs to be converted ot character Array

		//hence , first converting integer to string.
		String numStr = String.valueOf(num);
	       	//next convert it into character array using function toCharArray(), as toCharArray() works on instace of String;
		char[] str = numStr.toCharArray();	
		
		//using two index start and end , initialized to two different position
		int start = 0;
		int end = str.length - 1;

		while(start <= end){
			
			//if  while comparing two digit representing as character are found dissimilar, return false.
			if(str[start] != str[end]){
				return false;
			} 

			//keeping on checking for next character.
			start++;
			end--;
		}

		return true;

	}

	//main class
	public static void main(String[] args){
		
		int num;
		System.out.print("Enter Number:");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();


		boolean flag = checkPalindrome(num);
		
		if(flag){
			System.out.println("The given is "+num+" is Palindrome & returns "+ flag);
		}

		else{
			System.out.println("The given is "+ num+" is not palindrome & returns "+flag);
		}

	}
}
