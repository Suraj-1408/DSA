import java.util.*;

public class firstNLastPosOfGivenTarget{

	
	public static int[] searchRange(int[] nums, int target) {

        //creating a different function for finding first and last occurrence of that element.
        int[] res = {-1,-1};

        if(nums == null || nums.length == 0){
            return res;
        }

        else if(nums.length == 1 && nums[0]== target){
            res[0] = 0;
            res[1] = 0;

            return res;
        }

        res[0] = firstOccurence(nums,target);
        res[1] = lastOccurence(nums,target);

        return res;
    	}



	public static int firstOccurence(int[] nums,int target){
            int first = -1;

            int start = 0;
            int end = nums.length-1;

            while(start <= end){
                //conpute mid
                int mid = start + (end-start)/2;

                if(nums[mid] == target){
                    first = mid;       //update first occurrence index.
                    end = mid-1;    //move to left until we get first occurrence.
                }

                else if(nums[mid] < target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }   

            return first;
	}
        

   	 public static int lastOccurence(int[] nums,int target){
            int last = -1;

            int start = 0;
            int end = nums.length-1;

            while(start <= end){
                //conpute mid
                int mid = start + (end-start)/2;

                if(nums[mid] == target){
                    last = mid;       //update first occurrence index.
                    start = mid+1;    //move to left until we get first occurrence.
                }

                else if(nums[mid] < target){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }   

            return last;
    	}
        
	


	/*	
		//defining resultant array that will return indexes of given target.
		int[] res = {-1,-1};

		//edge case
		if(nums.length == 0){
			return res;
		}

	

		//since the array is sorted uisng binary search to find the given target.
		int start = 0;
		int end = nums.length;

		while(start <= end){
			
			//compute mid index and compare target with mid index value.
			int mid = start + (end-start)/2;

			if(nums[mid] == target){
				
				//check for previous index value and next index value.And Accoridng update start and end index value.
				if(nums[mid-1] != target){
				  res[0] = mid;		//setting the start index of target
				  start = mid+1;
				}

				else if(nums[mid+1] != target){
					res[1] = mid;	//setting the end index of target.
					end = mid-1;
				}
			}

			else if(nums[mid]  > target){
				end = mid-1;
			}

			else{
				start = mid+1;
			}
		}

		return res;
	*/



	//main
	public static void main(String[] args){
		
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		
		int[] res = searchRange(nums,target);
		System.out.println("Start and End indexes of given target:"+Arrays.toString(res));
	}
}
