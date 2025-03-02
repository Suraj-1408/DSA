public class checkisSequence{

	//method to check if given one string s appears as sequence in other given String t, if YES return true else false.
	public static boolean checkSequence(String s,String t){
	
		StringBuilder str = new StringBuilder("");
		int index = 0;
		for(int i =  0; i < t.length();i++){
		        if(index == s.length()){
                             break;
                        }
	
			//captures all characters of s string that matches in t string.
			if(s.charAt(index) == t.charAt(i)){
				str.append(t.charAt(i));
				index++;
			}
			
		}
		
		System.out.println("Extracted String:"+str);

		//at last check if extracted characters matches given string s.
		if(s.equals(str.toString())){
			return true;
		}

		return false;
	}

	//main
	public static void main(String[] args){
		
		String s = "axc";
		String t = "ahbgdc";
		
		
		if(checkSequence(s,t) == true){
			System.out.println("Given string s:"+s +" is subsequence in t:"+t);
		}

		else{
			System.out.println("string S:"+s +" is not subsequence.");
		}

	}
}
