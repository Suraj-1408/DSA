import java.util.*;

public class duplicateII{
	
	
	public static boolean duplicateII(int[] nums,int k){
	
	//USING HASHMAP.
	//storing elements as key and its index as value.
	//for every element checking if this key already exists? if Yes -> extract the previous index(i.e VALUE)
	//later check whether current Index - prevIndex <= k
	//if yes return true.
	
	//declaring HashMAP where key is array element and value is its index.
	HashMap<Integer,Integer> map = new HashMap<>();

	for(int i = 0;i < nums.length;i++){
		
		//check if key exists.
		if(map.containsKey(nums[i])){
			
			//if YES, extract previous Index.here it is value.
			int prevIndex = map.get(nums[i]);

			//now checking if (i - prevIndex) <= k ?if yes return true.
			int absolute = i - prevIndex;
			absolute = (absolute < 0)?(-absolute):(absolute);

			if(absolute <= k){
				System.out.println("Difference of Index "+ i +" and "+prevIndex+" is less than K");
				return true;
			}
		}
	//incase its not present. We either add || update the the last occurence of the respective elment in hashmap.
	
		map.put(nums[i],i);	//(element,index)
	}
	System.out.println("NO Index found satisfying the given condition.");
	return false;

	//method to return boolean value , if there exist two distinct indexes(ex i and j) and value at that indexes are 	//same and the absolute(diff(i -j) <= k(where K is the given value)).
	/*	BRUTE FORCE:
		//1) using O(n^2), comparing each element with rest of the elements.
		//2) if value at different matches, we compute the asolute of it and if absolutes <= k. return true.

		for(int i = 0;i < nums.length;i++){
			for(int j = i+1; j < nums.length;j++){
				
				if(nums[i] == nums[j]){
					
					//compute absolute and check if its <= k.
					//Absolute- its the distance from 0 to given number on the  number line
					//therefore , absolute is positive version of given number, because distance is never negative.

					int absolute = j - i;
					absolute = (absolute < 0)?(-absolute):absolute;	
					
					if(absolute <= k){
						System.out.println("Absolute value:"+absolute);
						System.out.println("Indexes "+i+" and "+j+" satisfy all given condition");
						return true;
					}	
				}
			}
		}

		return false;
	*/


	}



	//main()
	public static void main(String[] args){
		
		int[] nums = {1,2,3,1,2,3};
		//int[] nums = {1,0,1,1};
		int k = 2;
		System.out.println("Given K:"+k);	
		System.out.println("Given Array elements:");
		for(int i = 0 ;i < nums.length;i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println("");

		duplicateII(nums,k);
	}

}
