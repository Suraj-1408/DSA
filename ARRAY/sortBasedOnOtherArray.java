//Problem Given two array. sort the first array based on 2nd array.
//traverse both array.
//pick the element encountered in 2nd array.
//search its all occurrences in first array.
//at whichever index it is found replace that index value with its desired index position.


class sortBasedOnOtherArray{
	
	public static void sort(int[] nums1,int[] nums2){
		
		int index = 0;
/*
		//storing nums1 in hashmap.
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < nums1.length;i++){
			map.add(i,nums[i]);	//index,value.
		}	
*/		
		//int[] nums1 = {2,1,2,5,7,1,9,3,6,8,8};
		int pos = 0;

		for(int i = 0;i < nums1.length;i++){

			int val = getValue(index,nums2);	
			int count = getCount(pos,val,nums1);

			while(count > 0){

			if(nums1[pos] == val){
				pos++;
				count--;
				//System.out.println(nums1[i]);
				//break;
			}
		
			//else if(nums1[i] != val){
			else{
				for(int j = pos+1;j < nums1.length;j++){
				
				if(nums1[j] == val){
					int temp = nums1[pos];
					nums1[pos] = nums1[j];
					nums1[j] = temp;
						
					pos++;
					count--;
					break;
					}
				}
				//System.out.println(nums1[i]);	
				//count = 0;
			}
			
			}

			if(count == 0){
			index++;
			}
		}
		
		
		System.out.println("Index Reached:"+pos);

	
		for(int i = pos;i < nums1.length;i++){
			
			for(int j = i+1;j < nums1.length;j++){
				if(nums1[i] > nums1[j]){
					int temp = nums1[i];
					nums1[i] = nums1[j];
					nums1[j] = temp;
				}
			}
		}
		
	
	}

	public static int getValue(int index,int[] nums2){
		
		if(index < nums2.length){
			return nums2[index];
		}
		
		return 0;
	}

	public static int getCount(int index,int val,int[] nums1){
		//int val = getValue(index,nums1);
		
		int count = 0;
		for(int j = index;j < nums1.length;j++){
			if(nums1[j] == val){
				count++;
			}
		}

		return count;
	}
	

	public static void list(String text,int[] arr){
		
		System.out.println(text);

		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("");
	}

	//main
	public static void main(String[] args){
		
		int[] nums1 = {2,1,2,5,7,1,9,3,6,8,8};
		int[] nums2 = {2,1,8,3};

		list("Nums1:",nums1);
		list("Nums2:",nums2);

		sort(nums1,nums2);

		list("Updated nums1:",nums1);	
	}
}
