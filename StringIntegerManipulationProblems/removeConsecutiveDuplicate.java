import java.util.HashSet;

class removeConsecutiveDuplicate{

	//method to remove adjacent  duplicates in given string.
	public static String removeDuplicateInString(String str,int index,HashSet<Character> set,StringBuilder res){
		
		/*
		StringBuilder res = new StringBuilder();
		
		for(int i = 0;i < str.length()-1;i++){
			
			if(str.charAt(i) == str.charAt(i+1)){
				res.append(str.charAt(i+1));
			}
			else{
				res.append(str.charAt(i));
				//res.append(str.charAt(i+1));
			}
			
		}
		*/

 		/*
			//making use of HashSet.
		
			HashSet<Character> set = new HashSet<>();
			StringBuilder res = new StringBuilder();

			for(int i = 0;i < str.length();i++){
				
				//if set doesn't contains character added it resultant string and also in set.
				if(!set.contains(str.charAt(i))){
					res.append(str.charAt(i));
					set.add(str.charAt(i));			
				}
			}
		

		return res.toString();	
		*/
		

		//SETTING a BASE CONDITION.
		if(index == str.length()){
			return res.toString();
		}
		
		//using HashSet class.

		if(!set.contains(str.charAt(index))){
			res.append(str.charAt(index));
			set.add(str.charAt(index));
		}

		return removeDuplicateInString(str,index+1,set,res);

	}

	public static void main(String[] args){
		String str = "aazbbby";
		
		String finalResult = removeDuplicateInString(str,0,new HashSet<>(),new StringBuilder());
		System.out.println("String Without Duplicates:"+finalResult);
	}
}
