class findingLongestSubArrWithGivenK{
	
	//method to find out longest subarray with given target value K.
	public static int longestSubarrayWithgivenK(int[] arr,int k){
		
		//approach- using start index  to keep track of start of every new array.
		//consider the current element + existing sum.
		//check if sum doesn't exceeds given K, if so, move start index position until the all elements sum into
		//subarray is <= given target.(Subtract current element &  MOve start).
		//next check if sum meet target , if yes , get the length of subArray.

		int start = 0;
		int len = 0;
		int sum = 0;

		//will be used to print actual elements of subarray.
		int finalStart = 0;
		int finalEnd = 0;

		for(int end = 0;end < arr.length;end++){

			//add the element into sum.
			sum = sum+arr[end];
			
			//check if sum doesn;t exceeds target, if yes, keep on subtracting that element from sum & simultaineously move start index, UNTIL sum <= target.
			while(sum > k && start <= end){
				sum = sum - arr[start];
				start++;
			}

			//check if sum meets target k.
			if(sum == k){
				//len = (end-start+1)>len?(end-start+1):len;

				//preserve finalStart & finalEnd only when len has Updated or "currentSub array" > "len"
				if(len < end-start+1){			
				
					len = end-start+1;	//update len only if subarray(end-start+1)> previous len.

					finalStart = start;		//preserving start index of longest subarray.
					System.out.println("Final Start:"+finalStart);
					
					finalEnd = end;			//preserving end index of longest subarray.
					System.out.println("Final End:"+finalEnd);
				}
			}
		}
		

		// the loop will get the longest length of subarray meeting target AND Also the specific finalStart & finalEnd index of that subarray.
		System.out.println("Subarray elements meeting target");

		for(int i = finalStart; i <= finalEnd;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();

		return len;
	}

	//print()
	public static void list(int[] arr){
		
		System.out.println("Elements of arrays:");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
	}

	//main
	public static void main(String[] args){
		
		int[] arr = {1, 2, 3, 7,5};
		int k = 12;

		list(arr);

		int len = longestSubarrayWithgivenK(arr,k);
		System.out.println("Longest sub Array length meeting target k "+k+" is "+len);
	}
}
