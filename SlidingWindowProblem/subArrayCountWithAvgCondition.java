public class subArrayCountWithAvgCondition{

	
	//method to return the Subarray count  whose window is of K size and avg ? given threshold.
	public static int subArrayCountWithAvg(int[] nums,int K,int threshold){
		
		int sum = 0;
		int subArrayCount =  0;

		//Using one start index to keep track of start index of any new subArray.
		int start  = 0;

		for(int end = 0 ; end < nums.length;end++){
			
			//add current element in sum
			sum = sum + nums[end];

			//since we need to return the count of total subarray satisfying given condition.
			//we already computed sum for checking avg.
			//next we have to ensure that subarray is of size K.
			//if subarray reaches size K , we compute avg and based on avg condition, we will either add that subarray count or neglect it.

			if((end-start +1) == K){
				int avg = sum/K;

				if(avg >= threshold){
					subArrayCount++;
				}

				//if avg doesn;t satisfy the condition, check for next index value by moving starting and removing its corresponding index value from computed sum.
				sum = sum - nums[start];
				start++;
			}
		}

		return subArrayCount;
	}


	//main
	public static void main(String[] args){
		
		//int[] nums = {2,2,2,2,5,5,5,8};
		int[] nums = {11,13,17,23,29,31,7,5,2,3};
		
		int k = 3;
		int target = 5;

		System.out.println("Give Array elements are:");

		for(int i = 0; i < nums.length;i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println("\n");

		int res = subArrayCountWithAvg(nums,k,target);
		System.out.println("Count of sub Arrays having avg  greater equal to given threshold:"+res);
	}
}
