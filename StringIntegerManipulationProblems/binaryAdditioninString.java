import java.util.*;

public class binaryAdditioninString{
	
	//method to add two binary string.
	public static String addTwoBinary(String a,String b){
		
		//starting from the LSB of both string.
		//extract the lsb character of each string using str.charAt() - '0' or Character.getNumericValue(char) in int variable.
		//get the sum of it.
		//access the lsb of sum using modulo%2 , 2 because its binary , the sum can only be either 0,1,2 or 3 when adding any two binary number
		//add this lsb character into final resultant string.
		//simulTAINEOUSLY CHECK IF CARRY EXIST FOR COMPUTED SUM UISNG SUM/2.
		//repeat for next character in the sum along wiht carry.



		int sum = 0;
		int carry = 0;
		String result = "";
		int len1 = a.length() -1;	//starting from last character/
		int len2 = b.length() -1;

		while(len1 >= 0 || len2 >= 0 || carry > 0){
			
			//extract the lsb character of each string by making it to integer type.
			int n1 = (len1 >=0 ) ? a.charAt(len1) - '0' : 0;
			//OR int n1 = Character.getNumericValue(character);

			int n2 = (len2 >= 0) ? b.charAt(len2) - '0': 0;

			sum  = n1 + n2 + carry;
			
			//update the result
			result = (sum%2) + result;
			carry =  sum/2;

			len1--;
			len2--;
		}

		//At last if carry exist , adding it to result.
		if(carry > 0){
			result = carry + result;
		}
		
		return result;	
	}

	//main(){}
	public static void main(String[] args){
		
		String num1 = "101";
		System.out.println("num1 String:"+num1);
		String num2 = "111";
		System.out.println("num2 String:"+num2);

		String res = addTwoBinary(num1,num2);
		System.out.println("Binary Addition of two string:"+res);

	/*	
		String a = "11";
		System.out.println("a:"+a);
		String b = "11";
		System.out.println("b:"+b);

		//System.out.println("Binary Addition "+c);
		
		int len1 = a.length()-1;
		int len2 = b.length()-1;
		String result = "";
		int carry = 0;

		while(len1 >= 0 && len2 >= 0){
			
			int n1 = Character.getNumericValue(a.charAt(len1));
			int n2 = Character.getNumericValue(b.charAt(len2));

			int sum = n1 + n2 + carry;	//sum can only be either 0,1,2 or 3 . if its 0 or 1 carry = 0
							//else if its 2 or 3 carry is set to 1.
	

				
			result =  (sum%2) + result; //since we need to extract last bit of sum we use %2 , 2 because
						    //base of binary is 2, similarly if %10 for decimal.
			//After adding the last digit. check carry if its.
			carry = sum/2;		
			
			len1--;
			len2--;
		}

		//addigng remaining elements.
		while(len1 >= 0){
			
			int sum = 0;

			sum = Character.getNumericValue(a.charAt(len1)) + carry;	
			
			/* this way is wrong.

			//setting carry back if sum >=2
			if(sum >= 2){
				carry = 1;
			}
			*/


		/*
			result = (sum%2) + result;
			carry = sum/2;	//checking if carry exits.
			len1--;
		}

		while(len2 >= 0){
			int sum = 0;

			sum = Character.getNumericValue(b.charAt(len2)) + carry;
			
			/*
			if(sum >= 2){
				carry = 1;
			}
			*/

		/*
			result = (sum%2) + result;
			carry = sum/2;			//chekicking carry if exist.

			len2--;
		}


		//ATLAST ON ADDING COMPLETE BINARY STRING, CHECK IF THERE EXIST CARRY LEFT.	
		if(carry > 0){
			//adding it to result.
			result = carry + result;
		}

		System.out.println("Binary addition :"+result);
	*/
	}

	
}
