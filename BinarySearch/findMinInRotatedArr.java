class findMinInRotatedArr{
	
	//method to find minimum in rotated sorted array.
	public static int minimum(int[] nums,int start,int end){
		
	//using O(log n) solution.
    //since there is no target given to us, the decision of search half must be computed by comparing mid index value & end index value.
    //we decided to compare mid with end index because array is rotated, if rotation is done than minimum would be shifted to right side.
    
	//base case.
	if(start == end){
		return nums[start];
	}

	//compute mid.
	int mid = start + (end-start)/2;
	
	//compare mid with end index,
	if(nums[mid] > nums[end]){
		//min is in right half.
		return	minimum(nums,mid+1,end);
	}

	else{
		//min exist in left half.
		return minimum(nums,start,mid-1);
	}
	
	}

	//main
	public static void main(String[] args){
//
		int[] nums = {4,5,6,7,0,1,2};
		//int[] nums = {11,13,15,17};
		System.out.println("Rotated Array elements are:");
		for(int i = 0;i < nums.length;i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println("");
		int start  = 0;
		int end = nums.length-1;

		int min = minimum(nums,start,end);
		System.out.println("MInimum in rotated sorted arrays is:"+min);
	}
}
