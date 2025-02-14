import java.util.*;

public class longestcommonPrefix{

	//method to find the longest common prefix.
	public static String lcommonprefix(String[] arrStr){
		
		String result = "";
		int count = 0;		//to keep track of elements traversed.
		int index = 0;
	
/*

		//going on comparing each individual character of each string with all rest other charcaters.
		for(int i = 0;i < arrStr.length;i++){
			//extracting first character of first string.
			String str = arrStr[i];
			
			//count = i + 1;		//use to keep a count of elements that are traversed.

			for(int j = i+1;j < arrStr.length;j++){

				String str2 = arrStr[j];

				//comparing first chracter of first string with it next first character of next string.
				if(str.charAt(index) != str2.charAt(index)){
					break;
				}

				count = j;		
				//count++;
			}
			
			if(count == arrStr.length -1){
				result = result+ str.charAt(index);	
			}

			index++;
		}

		return result;
*/

		String first = arrStr[0];

		for(int i = 0;i < first.length();i++){
			
			char ch = first.charAt(i);

			for(int j = 1;j < arrStr.length;j++){

                                String str2 = arrStr[j];
/*
                                //comparing first chracter of first string with it next first character of next string.
                                if(first.charAt(index) != str2.charAt(index)){
                                        break;
                                }

                                count = j;              
  				//count++;
*/

		//check two condition if len of first str > array of any string  OR character of any string doesn't match with first string character
                		if( i >= str2.length() || str2.charAt(i)  != ch){
					return result;
				}
			}
                        	
			result += ch;
                }

                return result;
	}


	//main()
	
	public static void main(String[] args){
		
		//initializing string arr
		String[] arrStr = {"flower","flow","flight"};
		
		System.out.println("Strings of array are:");

		for(int i = 0;i < arrStr.length;i++){
			System.out.print(arrStr[i]+"\t");
		}

		System.out.println("");

		String res = lcommonprefix(arrStr);
		System.out.println("LOngest common prefix in given array String is:"+res);
	}
}
