class moveAllZerotoEnd{

	//method to move all zero to end of array without changing the given relative order.
	public static void moveZerostoEnd(int[] nums,int[] temp){
	
		//solving this problem using a extra O(n) space , by creating  temp arr.
		//int size = nums.length;
		//int[] temp = new int[size];

		
		//first copying all non zero element to temp.
		int index = 0;
		for(int i = 0;i < nums.length;i++){
			if(nums[i] != 0){
				temp[index++] = nums[i];
			}
	
		}	
		
		//now starting from the nzcount index value insert zero till nums.length
		for(int  i = index;i < nums.length;i++){
			temp[i] = 0;
		}


	/*
		for(int i = 0; i < nums.length-1;i++){
			
			if(nums[i] == 0){
				//swapp the i with i+1
				int curr = nums[i];		//preserve the current element.
				nums[i] = nums[i+1];		//update the curr index value.
				nums[i+1] = curr;		//update i+1 with curr(i.e prev one)
			}
		}
	*/
	}



	//method to print the array elements.
	public static void list(int[] arr){
		System.out.println("Elements of nums:");

		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+"\t");
		}	

		System.out.println("");
	}


	//main
	public static void main(String[] args){
		
		System.out.println("Move all zeros to End.");
		int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
		int[] arr1 ={10, 20, 30};

		//solving this problem using a extra O(n) space , by creating  temp arr.
                int size = arr1.length;
                int[] temp = new int[size];



		list(arr1);

		System.out.println("After calling method to move all zeros to end.");
		moveZerostoEnd(arr1,temp);

		list(temp);
	}

}
