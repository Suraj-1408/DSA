/*
 Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

*/

import java.util.*;
import java.io.*;

class reverse{
	public static int reverseInteger(int number){
	//1)Extract last integer using mod
	//2)update number using '/'
	//3)update result.
	
	//Signed num can be either '+ve' || '-ve'
	int sign = (number > 0)? 1: -1;

		int result = 0;

		while(number != 0){
			int last = number % 10;		
			number = number / 10;

			//handling overflow for bits beyond 32 bits.if TRUE return 0
			if((number > Integer.MAX_VALUE) || (number == Integer.MAX_VALUE && number > Integer.MAX_VALUE) ){
				return 0;
			}
			
			result = (result * 10) + last;
		}

		return result*sign;
	}
}

//main class
public class reverseInteger{
	public static void main(String[] args){
		
		System.out.println("Enter a number to reverse:");
		int num;
	       	Scanner sc = new Scanner(System.in);
       		num = sc.nextInt();

		//creating object for reverse.
		reverse instance = new reverse();

		int result = instance.reverseInteger(num);
		System.out.println("Reverse for given integer "+num+" is "+result);
	}

}
