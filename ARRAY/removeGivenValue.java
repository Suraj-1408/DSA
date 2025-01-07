import java.util.*;

public class removeGivenValue{
	public static int removeGivenValue(int[] nums,int value){
		//declaring a new Array.
		int size = 0;
		//int[] Arr = new int[size];
		//int index = 0;
		
		//declaring an ArrayList
		//ArrayList<Integer> arr = new ArrayList<>();

		for(int i = 0; i < nums.length;i++){
			if(nums[i] != value){
				//Arr[index] = nums[i];
				//arr.add(nums[i]);
				nums[size] = nums[i];		//updating the index(In Place)
				size++;
				//index++;
			}
		}

		return size;
	}

	//main class
	public static void main(String[] args){
		
		int[] nums = {0,1,2,2,3,0,4,2};
		int val = 2;

		int size = removeGivenValue(nums,val);
		System.out.println("The length new Array without given value is "+size);

	}

}
