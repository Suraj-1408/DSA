import java.util.*;

public class longestConsecutiveSeq{
	
	//method to return the length to longest consecutive sequence for given unsorted Array.
	public static int longestConsecutiveSeq(int[] nums){
	
		//sorts the array element.
		Arrays.toString(nums);

		//since the array element is sorted. and in order to find longest consecutive ,  at any step we just to 
		//check whether current element is equal to previous element.
		//ex: 1,2,3,
		//for index:1 i.e element 2
		//check if(nums[i] == nums[i-1] +1)
		



		int maxlen = 1;	//it could be set Integer.MIN_VALUE, but edge cases such as single element will it amke it fail.

		//if array length is zero.(null means array is not initialized and haven't given memory location.)
		if(nums == null || nums.length == 0){
			return 0;
		}
		

		//if array contains single element.
		else if(nums.length == 1){
			return maxlen;
		}


		int count = 1;

		for(int end = 1;end < nums.length;end++){
			//skipping duplicates element
			if(nums[end] == nums[end-1]){
				continue;
			}

			/*
			//consider the count of the existing element	
			if(nums[end] == nums[end-1]+1){
				count++;
			}

			else{
				count = 1;
			}
			*/
			
			count=(nums[end] == nums[end-1]+1)?count+1:1;


			//update max length
			if(count > maxlen){
				maxlen = count;
			}
		}

		return maxlen;
	}

	//main()
	public static void main(String[] args){
		
		int[] nums = {100,4,200,1,3,2};
//		int[] nums = {0,3,7,2,5,8,4,6,0,1};
		System.out.println("Array elements:");
		
		for(int i = 0;i < nums.length;i++){
			System.out.print(nums[i]+"\t");
		}

		System.out.println("");
		

		Arrays.sort(nums);	//sort the array elements.	
		System.out.println("Array elements after sort:"+Arrays.toString(nums)); //make the sorted element human
											//readable due to toString().
		int maxlen = longestConsecutiveSeq(nums);
		System.out.println("Maximum consecutive length of elements in array:"+maxlen);
	}
}
