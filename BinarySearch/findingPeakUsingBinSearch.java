
class findingPeakUsingBinSearch{
	
	//method to find the peak using binary search in java.
	//Since the input follow a specific order - incresing & decresing we can apply binary search on it.
	public static int peak(int[] nums){
		//compute mid for given nums array.
		//check mid index value if its GREATER then mid+1 index value, then OUR PEAK EXIST IN LEFT SIDE( INCLUDING MID.) UPDATE HIGH TO MID-1 INDEX.
		//IF MID+1 > MID , PEAK EXIST IN RIGHT SIDE. HENCE UPDATE LOW TO MID+1 INDEX.
		//CONTINUE THE PROCESS OF DIVIDING ARRAY INTO HALF , COMPUTE MID INDEX , UPDATE LOW & HIGH INDEX BASED ON MID INDEX VALUE UNTIL WE ARE LEFT WITH SINGLE ELEMENT.

		int peak = 0;
		//using two indexes to keep track input size where peak would exist.
		int low = 0;
		int high = nums.length-1;

		while(low < high){
		
		//compute mid index
		int mid = low+(high-low)/2;

		//now check mid index value with either mid+1 or mid-1
		
		
		if(nums[mid] > nums[mid+1]){
		//peak exist in left half.
			peak = mid;
			high = mid;
		}

		//peak exist in right half.
		else{
			peak = mid+1;
			low = mid+1;
		}

		}

		
		return peak;
	}


	//main
	public static void main(String[] args){
		int[] nums = {1,2,3,1};
		System.out.println("Eelements of Array:");
		for(int i = 0;i < nums.length;i++){
			System.out.print(nums[i]+"\t");
		}

		System.out.println("");

		int pik = peak(nums);
		System.out.println("Peak element "+nums[pik]+" found at index "+ pik);
	}

}
