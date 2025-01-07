class Solution {
    public static int majorityElement(int[] nums) {
        int count = 1;
        int element = nums[0];

        for(int i = 1;i < nums.length;i++){
            //Update count while encountring same element.
            if(nums[i] == element){
                count++;
            }
            else{
                count--;
                //now here check if count == 0, if TRUE, update element.
                if(count == 0){
                    element = nums[i];
                    //update its count.
                    count = 1;
                } 
            }

        }

    	return element;
  }

}


//main class
public class majorityElements{
	public static void main(String[] args){
		int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
		System.out.print("Given elements of array are:\n");
		for(int i = 0;i < arr.length;i++){
			System.out.print(arr[i]+"\t");
		}

		int result = Solution.majorityElement(arr);
		System.out.println("\nMajority element in the given Array is "+result);
	}
}
