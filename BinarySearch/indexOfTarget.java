public class indexOfTarget{
	
	//method to return index of given target value.
	public static int indexofTarget(int[] nums,int target,int start,int end){
		
		
		//base condition.
		if(start > end){
			return start;	
		}

		int mid = start + (end - start)/2;
		//writing a recursive function.

		if(nums[mid] == target){
			return mid;
		}

		else if(nums[mid] < target){
			//search in right half.
			//update start index.
			start = mid+1;
			return indexofTarget(nums,target,start,end);
		}

		//search in left half.
		else{
			end = mid-1;
			return indexofTarget(nums,target,start,end);
		}



	}


	//main()
	public static void main(String[] args){
		
		int[] nums = {1,3,5,6};
		int target = 7;
	
		System.out.println("Array elements.");	
		for(int i = 0 ; i < nums.length;i++){
			System.out.print(nums[i]+"\t");
		}

		System.out.println("");

		int index  = indexofTarget(nums,target,0,nums.length-1);
		System.out.println("Index is at or should be at:"+index);

	}
}
