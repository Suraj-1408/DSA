//take one index start from 0.
//take variable to track unique element , k = 1;
//start from index 1 to less than nums.length.
//check if nums[i] != nums[i-1]
//simply add element at index i to new index i.e let say index1 and simultaineously increment k count & index1 count.
//else if (nums[i] == nums[i-1])
//than udpate index1 value to duplicate element found at index i.
//at last return k count.


//ABOVE APPROACH WOULD HELPS US IN REMOVING ALL DUPLICATES EXCEPT ITS ONE OCCURRENCE.


//PROBLEM - REMOVE DUPLICATES FROM THE ARRAY FOR ELEMENTS APPEARING MORE THAN TWICE.
//USING SAME APPROACH AS ABOVE WITH JUST LITTLE MODIFICATON AT TIME OF INSERTING ELEMENT INTO ARRAY USING NEW INDEX.
//WHILE TRAVERSING FOR EACH ELEMENT CHECK ITS COUNT( HOW MANY TIMES IT HAS APPEARED). INTIALLY COUNT WILL ALWAYS BE 1 , FOR ANY NEW ELEMENT ECOUNTERED.
//IF (COUNT <= 2) UPDATE INTO NUMS USING NEW INDEX.

//1,1,1,2,2,3
class rmDuplicate{
	
	//method to remove all duplicates appearing more than twice and return final count of elements into array.
	public static int removeDuplicate(int[] nums){
		
		int index = 0;		//using this new index , to update elements encountered in array while traversing
					//if it is unique and if duplicates exist than its occurrence must be less than 2.
					//
		
		int count = 1;
		for(int i = 1;i < nums.length;i++){

			//if nums[i]  == nums[i-1] check count if its <= 2 , insert into array using new index.
			if(nums[i] == nums[i-1]){
				count++;
				
				if(count <= 2){
					index++;
					nums[index] = nums[i];
				}

			}

			else{
				index++;
				nums[index] = nums[i];
				count = 1;
			}	
		}

		return index+1;
	}

	//main
	public static void main(String[] args){
		
		//int[] nums = {1,1,1,2,2,3};
		int[] nums = {0,0,1,1,1,1,2,3,3};
		System.out.println("Printing Array elements , objective is to remove duplicates appearing more than twice.  AND return the final element present in array.");

		for(int i = 0;i < nums.length;i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println("\n\n\tAfter remvoing duplicates appearing more than twice.");
		
		int k = removeDuplicate(nums);
		for(int i = 0;i < k;i++){
			System.out.print(nums[i]+"\t");
		}
		System.out.println("");

		System.out.println("Total. elements after removing duplicate appearing more than twice:"+k);
	
	}
}
