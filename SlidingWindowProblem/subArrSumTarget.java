//using Array list.

import java.util.*;

public class subArrSumTarget{
	//method that returns indexes of subarray whose sum is equal to target.
	public static ArrayList<Integer>  subArraySumMeetingTarget(int[] arr,int target){
		
		/*
		//declaring ArrayList
		ArrayList<Integer> arr = new ArrayList<Integer>();

		arr.add(2);
		arr.add(4);
		arr.add(6);
		arr.add(8);

		return arr;
		*/
	
		//Since we need to return the indexes of subarray that on adding meets the target.
		//using sliding window technique.
		//using start variable to shrink the window , when SUM VALUE IS STRICTLY > TARGET
		//using end index usually for traversing the complete array.EXPANDING THE SUBARRAY BY ADDING ELEMENTS INTO PREVIOUS SUM
		//using arrayList to store the indexes and later return it.

		int currSum = 0;
		int start = 0;

		//declaring array list to store indexes.
		ArrayList<Integer> res = new ArrayList<>();

		for(int end = 0;end < arr.length;end++){
			//compute the sum by adding current element to currsum.
			currSum += arr[end];

			//checking value of currSum , if Greater than target, shrinking the subarray until it strictly become less.
			while(currSum > target && start <= end){
				//SHRINK THE SUBARRAY
				currSum -= arr[start];
				start++;
			}
			
			if(currSum == target){
				res.add(start);
				res.add(end);
				break;		
			}

		}

		return res;
	}

	public static void main(String[] args){
		
		//In java Array data structure is already defined inside collection.

		//int[] arr = new int[5];
		int[] arr = {1, 2, 3, 7,5};

		int target = 12;

		ArrayList<Integer> result = subArraySumMeetingTarget(arr,target);

		System.out.println(result);
	}
}
