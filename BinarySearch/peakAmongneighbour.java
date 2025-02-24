public class peakAmongneighbour{
	
	//method to return index of peak among neighbour in complete array.
	public static int peakAmongneighbour(int[] nums){
	
		//edge case for lenght 1
		if(nums.length  == 1){
			return 0;
		}	

		else if(nums.length == 2){
			int pik = (nums[0] > nums[1])?0:1;
			return pik;
		}



		int peak = 0;

		//this loop will run till 2nd last element of array element.
		//Ex nums.length = 4;
		// of nums.length-1 = 4-1 = 3
		// for will execute from 0 to 2(due to strictly less < nums.length -1)
	
		for(int i = 0; i < nums.length-1;i++){
			
			if(i == 0){
				if(nums[i] > nums[i+1]){
					peak = i;
				}
			}

			//check if current element is greater than its neighbour , UPDATE peak value.
			else if(nums[i-1] < nums[i] && nums[i] > nums[i+1]){
				peak = i;
			}

		}

		//now the loop has validated till 2nd last element.
		//check of last element.
		if(nums[nums.length - 1] > nums[nums.length -2]){
			peak = nums.length-1;
		}

		return peak;
	}




	//main
	public static void main(String[] args){
		
		int[] nums = {1,2,1,3,5,6,4};
		//int[] nums = {1,2,3,4};
		int peak = peakAmongneighbour(nums);
		System.out.println("Peak among neighbour in complete Array:"+peak);
	}
}
