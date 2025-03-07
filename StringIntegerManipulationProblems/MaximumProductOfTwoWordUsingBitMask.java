import java.util.*;

class MaximumProductOfTwoWordUsingBitMask{
	
	//To get the maximum product of any two words in given string array using Bitmask Approach.
	//i.e First we will store all words into binary string, internally at hardware level they are stored similar.
	//In order to get bianry string of any word we will use bitmask.
	//i.e since word is in String type,
	//convert string into characterArray uisng words[i].toCharArray()
	//now traversing each character , and store it in bianary,
	//we know int consist of 32bits.
	//we first compute actual position of encountered character in word in total alphabets that exist.
	//position = 'givenCharacter' - 'a'
	//here ASCII comparison is made and accordingly its position is extracted.
	//all lowercase starts from 97.
	//int pos = '97' - '97' i.e if given character was 'a' (97 in ASCII) we substract it with 'a' to actual position.
	//once position is extracted we try to place bit 1 to appropriate position in 32bits , here only consider 26 becuase those many alphabets exist.
	//this bit 1 is stored from LSB-MSB format.
	//Later making use BitWise Or(|) to get complete binary string of one specific word.
	//ex: 'abc'
	//	for 'a'  =  00000000000000000000000001
	//	bitwiseOR(|)00000000000000000000000000
	//	---------------------------------------
	//	result =    00000000000000000000000001
	//
	//	next 'b'    00000000000000000000000010
	//		|   00000000000000000000000001  this previously computed result.
	//
	//Atlast once we get binary stirng for two words, we try to make use of AND between them , if common bits exist i.e in result we get bit '1' , we conclude the common character exist in give two words.
	

	//use two array 
	//1) to store bitmask of any words , internally(Harware level) it is stored in  binary, but when we print it, java shows in decimal.
	//2)length of each words in string array.
		
	public static int maxProduct(String[] words){
	
		int[] bitMask = new int[words.length];
		int[] len = new int[words.length];

		for(int i = 0;i < words.length;i++){
			
			int mask = 0;	//initializes every word with 0's

			//to convert word in decimal by extracting every characters and converting it into binary string.
			//converting given word into character array.
			char[] arr = words[i].toCharArray();
			//char[] arr = new char(words[i].toCharArray());

			for(int j = 0;j < arr.length;j++){
				char ch = arr[j];
				int pos  = ch - 'a';		//this gets the actual position of any character in ch.
				mask = mask | (1 << pos);	//this gvies binary string for that particular character(i.e by converting it into ASCII)

			}

			//storing extracted binary stirng in bitMask[]
			bitMask[i] = mask;
			len[i]  = words[i].length();
		}
	
		int maxProduct = 0;
		//next computing maximum Product for stored binary string of each words.
		for(int i = 0; i < bitMask.length;i++){
			
			for(int j = i+1;j < bitMask.length-1;j++){
				
				//using bitwise AND operator to check there exist some common characetr by comparing eaech individual bits. if while camparing if any of bit in result return bit value "1" than there exist common letter or character.	
				if((bitMask[i] & bitMask[j]) == 0){
					int currProduct = len[i]*len[j];
					maxProduct = (currProduct > maxProduct)?currProduct:maxProduct;
				}
			}
		}

		return maxProduct;
	}



	//main
	public static void main(String[] args){
		
		System.out.println("Given String array:");
		//String[] words = {"abcw","baz","foo","bar","xtfn","abcdef"};
		String[] words = {"a","ab","abc","d","cd","bcd","abcd"};

		for(int i = 0;i < words.length;i++){
			System.out.print(words[i]+"\t");
		}
		System.out.println();

		int maxProd = maxProduct(words);
		System.out.println("MAximum Product is:"+maxProd);

	}
}
