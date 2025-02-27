class searchInRotatedSortedArray{

	//method to search element in rotated sorted array accordingly return a boolean value.
	public static boolean search(int[] nums, int target) {
        
    /*    
        //using binary search as the array is sorted.
        //making use of two index start and end.
        //computing mid and comparing it target, if target > mid , search right half ,else left half.
        
        Arrays.sort(nums);

        int start = 0;
        int end = nums.length-1;

        while(start <= end){
            int mid = start + (end-start)/2;

            if(nums[mid] == target){
                return true;
            }

            else if(nums[mid] > target){
                //search in left half.
                end = mid-1;
            }

            else{
                start = mid+1;
            }
        }

        return false;
    */

    //Second solution -  more fast and optimised one.
    //Due to array rotation, the elements are divided into two different sorted interval.
    //we need to find out that first for searching target in given array.
    //In order to ensure that our one of the interval sorted or not we need to compare
    //start index value with mid index value if(nums[start] <= nums[mid]) this mean left half is sorted.
    //else right half is sorted where nums[mid] <= nums[end]
    //further in both cases check whether target lies in betweena nd accordingly discard search spaces.

    int start= 0;
    int end = nums.length -1;

    while(start <= end){

        //compute mid 
        int mid = start + (end-start)/2;

        if(nums[mid] == target){
            	System.out.println("Element found at Index:"+mid);
		return true;
        }

        else if(nums[start] == nums[mid] && nums[mid] == nums[end]){
            start = start+1;
            end = end-1;
            continue;
        }

        else if(nums[start] <= nums[mid]){
            //ensuring target lies in  between.
            if(nums[start] <= target && target <= nums[mid]){
                //if above condition is true , DISCARD THE RIGHT HALF AND SEARCH IN LEFT HALF.
                end =  mid-1;
            }

            else{
                start = mid+1;
            }
        }

        else{

            //ensure target lies in betweeen right half.
            if(nums[mid] <= target && target <= nums[end]){
                start = mid+1;
            }

            else{
                end = mid-1;
            }
        }
    }

    return false;

    }


    //main()
    public static void main(String[] args){
    	
    	int[] nums = {2,5,6,0,0,1,2};
	int target = 3;
	
	System.out.println("Array ELements are:");
	for(int i = 0;i < nums.length;i++){
		System.out.print(nums[i]+"\t");
	}
	System.out.println("");


	boolean res = search(nums,target);
	if(res){
		System.out.println("Result:true");
    	}	
	else{
		System.out.println("Element not found, Result:false");
	}

	}

}
