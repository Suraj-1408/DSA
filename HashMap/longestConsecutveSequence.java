//import java.util.HashMap;
import java.util.HashSet;
class longestConsecutiveSequence{
	
	//method to find longest consecutive sequence in the given array.
	/*
	Input: nums = [100,4,200,1,3,2]
	Output: 4
	Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
	*/
	public static int longestSequence(int[] nums){
	
	//HashMap<Integer,Integer> map = new HashMap<>();
	HashSet<Integer> set = new HashSet<>();

	//first storing all element into map.
	for(int i = 0;i < nums.length;i++){
		//map.put(nums[i],i);
		set.add(nums[i]);
	}

	int maxlen = 0;

	//now for each element , checking how long the sequence exist uisng HashMap.
	for(int i = 0;i < nums.length;i++){
	
		//starting  a new squence when it previous element doesn't exist.
		//if(!map.containsKey(nums[i]-1)){	
		if(!set.contains(nums[i]-1)){
		

		int currNum = nums[i];
		int count = 1;

		//for above element check into hashmap , how long the sequence exist.
		//until the next sequence doesn't exist go on checking the next element into map.
		//while(map.containsKey(currNum+1)){
		while(set.contains(currNum+1)){
			currNum++;
			count++;
		}

		//update maxlen.
		maxlen = (count > maxlen)?count:maxlen;
	
		}
	}

	return maxlen;
	/*	int len = 0;

		HashMap<Integer,Integer> map = new HashMap<>();

		for(int i = 0;i < nums.length;i++){
			
			if(map.isEmpty()){
				map.put(i,nums[i]);
				len++;
			}
			
			else if(map.containsValue(nums[i]-1)){
				map.put(i,nums[i]);
				len++;
			}
			else{
				map.remove(i-1);
				map.put(i,nums[i]);

			}
		}
	*/
	}

	//main
	public static void main(String[] args){
		
		int[] nums = {100,4,200,1,3,2};
		System.out.println("Array elements:");
		for(int i = 0;i < nums.length;i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println("");
		int max = longestSequence(nums);
		System.out.println("Maximum length is:"+max);

	}
	
}
