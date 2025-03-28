class searchInRotatedSortedArray{

	//method to search element in rotated sorted array accordingly return a boolean value.
	public static int search(int[] nums, int target) {
        
    //APPROACH - Compare mid index value with target & array boundaries,(low or high index value.)
    
    //Due to array rotation, the elements are divided into two different sorted interval.
    //In order to ensure that our one of the interval sorted or not we need to compare
    //start index value with mid index value if(nums[start] <= nums[mid]) this mean left half is sorted.
    //else right half is sorted where nums[mid] <= nums[end]
    //further in both cases check whether target lies in betweena nd accordingly discard search spaces.

    int start= 0;
    int end = nums.length -1;

    while(start <= end){

        //compute mid 
        int mid = start + (end-start)/2;

	//if target is found at mid index.
        if(nums[mid] == target){
            	System.out.println("Element "+nums[mid]+" found");
		return mid;
        }

	/*
        else if(nums[start] == nums[mid] && nums[mid] == nums[end]){
            start = start+1;
            end = end-1;
            continue;
        }
	*/

	//NOW , SINCE MID INDEX IS NOT TARGET.
	//NEXT,IDENTIFY WHICH HALF IS SORTED, 
	//IF PARTICULAR HALF IS SORTED CHECK IF TARGET LIES IN THAT HALF.
	
        else if(nums[start] < nums[mid]){
            
	    //checking if target lies in this half or not.
            if(nums[start] <= target && target < nums[mid]){
                //if above condition is true , DISCARD THE RIGHT HALF AND SEARCH IN LEFT HALF.
                end =  mid-1;
            }
	
	    //SEARCH IN RIGHT HALF. by updating start index to mid
            else{
                start = mid;
            }
        }

        else{

            //ensure target lies in betweeen right half.
            if(nums[mid] <= target && target < nums[end]){
                start = mid+1;
            }

            else{
                end = mid-1;
            }
        }
    }

    return -1;

    }


    //main()
    public static void main(String[] args){
    	
    	//int[] nums = {2,5,6,0,0,1,2};
	int[] nums = {4,5,6,7,0,1,2};
	int target = 3;
	
	System.out.println("Array ELements are:");
	for(int i = 0;i < nums.length;i++){
		System.out.print(nums[i]+"\t");
	}
	System.out.println("");


	int res = search(nums,target);
	if(res != -1){
		System.out.println("Element found at index "+res);
    	}	
	else{
		System.out.println("Element "+target+" not found, Result:"+res);
	}

	}

}
