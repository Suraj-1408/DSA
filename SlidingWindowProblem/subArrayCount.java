//Return total subArray COunt whose product is less then given target value.


//userdefined class computing total count of subarray whose product is less than given target 

class totalSubarrayCountLessthanK{
	public static int countSubarray(int[] nums,int target){
		//start with computing the product of each element and simultaineously expanding the subarray using end index.
		//shrinking the subarray when product value exceeds the target value ,using start index.
		//Atlast count the subarray count.

		int start = 0;
		int end = 0;
		int currProd = 1;
		int count = 0;

		for(end = 0 ; end < nums.length;end++){
			currProd = currProd * nums[end];

			//slide the window when currProd value exceeds target
			while(currProd >= target){
				//remove the element present at start index.
				currProd = currProd/nums[start];
				start++;
			}

			//count the subarray;
			count = count + (end-start+1);

		}
	
		return count;
	}
}

public class subArrayCount{
	public static void main(String[] args){
		
		int[] arr = {10,5,2};
		int target = 100;

		int count = totalSubarrayCountLessthanK.countSubarray(arr,target);
		System.out.println("Total subarray count is "+ count);
	}
}
