import java.util.*;

public class countAndSay{

	//method to represent ,ex-Input: "33" -> Output:"23" 	
	public static String countAndSay(int n){
	

	/*
	//"3322251"  output -> "23321511";
	String result = "";
	
	//edge case if string contains single element.
	if(input.length() == 1){
		result = input.charAt(0)+"1";

		return result;
	}

	int count = 1;
	int start = 0;	
	for(int i = 1; i < input.length();i++){
		
		if(input.charAt(i-1) != input.charAt(i)){
			
			result = result + String.valueOf(count)+input.charAt(i-1);

			count = 0;
			while(start != i){
				start++;
			}
		}

		count++;		
		//ensuring if current index is  not the last index.(Handling for last element character)
		if(i == input.length()-1){
			result = result + String.valueOf(count)+input.charAt(i);
		}	
	}	
		
		return result;
	*/

	/*Example 1:
	Input: n = 4
	Output: "1211"
	Explanation:
	countAndSay(1) = "1"
	countAndSay(2) = RLE of "1" = "11"
	countAndSay(3) = RLE of "11" = "21"
	countAndSay(4) = RLE of "21" = "1211"
	*/
	

	//edge case if string contains single element.
          if(n == 1){
                 return "1";
	  }


	int num = 1;

	String rle = String.valueOf(num);
	System.out.println("String inside "+rle);	
	
	while(num != n){	
		String res_rle = "";
	
       		//edge case if string contains single element.
        	if(rle.length() == 1){        
			res_rle= "1"+rle.charAt(0);
		}

		int count = 1;
		int start = 0;
		for(int i = 1;i < rle.length();i++){
			

			
			if(rle.charAt(i) != rle.charAt(i-1)){
				//storing result for previous character occurrence.
				res_rle = res_rle + String.valueOf(count) + rle.charAt(i-1);

				count  = 0;
				while(start != i){
					start++;
				}
			}

			count++;

			//handling last character element.
			if(i == rle.length()-1){
				res_rle = res_rle + String.valueOf(count) + rle.charAt(i);
			}
		}

		rle = res_rle;		//updating this for computing rle for thr formed string. Ex: initial rle(1) = "1" , next rle(2) = rle(1)
		System.out.println("updated rle string "+rle);
		//result = result + res_rle;
		num++;	
	}
		
		return rle;
	}


	//main()
	public static void main(String[] args){
		

		//String input = "3322251";
		String input ="23321511";
		
		String result = countAndSay(4);
		System.out.println("Compressed String for given integer 4  is "+result);
		
	}
}
