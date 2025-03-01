class returnDuplicateinBinSearch{

	//mehtod to return duplicate in given array by searching on range of number that is  sorted and not on given nums array which is unsorted.
	public static int returnDuplicate(int[] nums){
		
		int left  = 1;
		int right = nums.length-1;	//this will get the actual length of array , minuz the duplicated value count.

		while(left < right){
			
			//computing mid.
			int mid = left + (right - left)/2;

			int numberCount = 0;	//after each iteration checking this numberCount;
			//count numbers of elements that are less than equal to obtained mid value.
			for(int i = 0;i < nums.length;i++){
				if(nums[i] <= mid){
					numberCount = numberCount+1;
				}
			}

			//if numberCount > mid and search in left half
			if(numberCount > mid){
				right = mid;
			}
				
			//search in right half.
			else{
				left = mid+1;
			}
		}

		return left;
	}

	//main
	public static void main(String[] args){
		//int[] nums = {1,3,4,2,2};
		int[] nums = {3,1,3,4,2};

		int dup = returnDuplicate(nums);
		System.out.println("Duplicate element is:"+dup);
	
	}

}
