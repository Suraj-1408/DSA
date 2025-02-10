import java.util.*;

public class stringConstruct{

	//method to check whether we can construct given string using its own substring copies(substring copies must be same)
	//if YES - > return True. else -> false.
	
	public static boolean constructString(String str){
		//first generating a substring by adding every character to substring until first character is encountered.
		String substr = "";
		substr  = substr.concat(String.valueOf(str.charAt(0)));
		int len = str.length();

		for(int i = 1;i < str.length();i++){

			if(str.charAt(i) != str.charAt(0)){
				//substr  = substr.concat(String.valueOf(i));
				substr = substr + str.charAt(i);
				break;
			}

		}
		System.out.println("SubString :"+substr);

		int totalSubstr = len/substr.length();
		
		String s1 = "";
		while(totalSubstr != 0){
			s1 = s1.concat(substr);
			totalSubstr--;
		}
		System.out.println("String S1 "+s1);
		if(str.equals(s1)){
			int totalSubstrcnt = len/substr.length();

			System.out.println(totalSubstrcnt+" substring  can be used to generate given string "+str);
			return true;
		}

		return false;
	}


	//main()
	
	public static void main(String[] args){
		
		String str = "ababab";
		boolean res = constructString(str);
		
		if(res == true){
			System.out.println("The given string can be generated using its multiple substring "+res);
		}
		else{
			System.out.println("String cannot be generated using Substring"+res);
		}
		
	}
}
